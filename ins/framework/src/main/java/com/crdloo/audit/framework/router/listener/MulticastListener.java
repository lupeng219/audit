package com.crdloo.audit.framework.router.listener;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.util.Set;

import org.apache.log4j.Logger;

import com.crdloo.audit.framework.constant.Const;
import com.crdloo.audit.framework.router.ITrigger;
import com.crdloo.audit.framework.router.cluster.Address;

public class MulticastListener extends Thread {

	private static final Logger logger = Logger.getLogger(MulticastListener.class);

    private Set<String> ips;
    private int port;

    private ITrigger trigger;
    private MulticastSocket multicast;
    private InetAddress group;
    private boolean closed = false;

    public MulticastListener(int port, Set<String> ips, ITrigger trigger) {
        this.port = port;
        this.ips = ips;
        this.trigger = trigger;
        connect();
    }

    public void connect() {
        if (this.multicast == null) {
            try {
                this.group = InetAddress.getByName(Const.MULTICAST_IP);
                this.multicast = new MulticastSocket(this.port);
                this.multicast.setTimeToLive(32);
                this.multicast.joinGroup(group);
                this.closed = false;
            } catch (Exception e) {
                logger.warn(" MulticastSocket connect [" + Const.MULTICAST_IP + ":" + port + "] fail", e);
                disconnect();
            }
        }
    }

    public void disconnect() {
        this.closed = true;
        if (this.multicast != null) {
            try {
                multicast.leaveGroup(group);
            } catch (IOException e) {
            }
            multicast.close();
            multicast = null;
        }
    }

    @Override
    public void run() {
        while (!closed && isInterrupted() == false) {
            Message message = listen();
            // 判断是不是对应服务器发送过来的
            if (safe(message)) {
                handler(message);
            }
        }
    }

    /**
     * 判断收到的信息是否从对应的服务器发来的
     * 
     * @param message
     * @return
     */
    private boolean safe(Message message) {
        return (message != null) ? (this.port == message.getPort() && this.ips.contains(message.getIp())) ? true
                : false : false;
    }

    /**
     * 阻塞
     * 
     * @return
     */
    public Message listen() {
        Message message = null;
        byte[] data = new byte[256];
        DatagramPacket packet = new DatagramPacket(data, data.length);
        try {
            multicast.receive(packet);
            message = Message.format(packet);
            // need
            message.setIp(packet.getAddress().getHostAddress());
        } catch (Exception e) {
            // ingore, no attention
            // log.warn("[id=" + id + ", port=" + port + "] listen() fail", e);
        }
        return message;
    }

    /**
     * 处理消息
     * 
     * @param message
     */
    protected void handler(final Message message) {
        if (Message.State.ALIVE == message.getState()) {
            logger.debug("receive ip=" + message.getIp() + ", port=" + message.getPort() + " signal="
                    + message.getState());
        } else {
            // warn : better monitor
            logger.warn("receive ip=" + message.getIp() + ", port=" + message.getPort() + " signal="
                    + message.getState());
        }
        Address address = new Address(message.getIp(), message.getPort());
        if (Message.State.STARTED == message.getState()) {
            trigger.join(address);
        } else if (Message.State.STOPPED == message.getState()) {
            trigger.exit(address);
        }
    }

    public boolean isClosed() {
        return closed;
    }
    
}
