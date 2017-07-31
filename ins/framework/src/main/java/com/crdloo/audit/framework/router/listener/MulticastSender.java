package com.crdloo.audit.framework.router.listener;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.net.UnknownHostException;

import org.apache.log4j.Logger;

import com.crdloo.audit.framework.router.listener.Message.State;

public class MulticastSender {

	private static final Logger logger = Logger.getLogger(MulticastSender.class);

    private InetAddress group;
    private int port;

    private MulticastSocket multicast = null;

    public MulticastSender(String host, int port) {
        this.port = port;
        try {
            this.group = InetAddress.getByName(host);
        } catch (UnknownHostException e) {
            throw new RuntimeException("host=" + host + " UNKNOWN", e);
        }
        try {
            this.multicast = new MulticastSocket(port);
            this.multicast.setTimeToLive(32);
            this.multicast.joinGroup(group);
        } catch (Exception e) {
            logger.warn(" MulticastSocket connect [" + host + ":" + port + "] fail", e);
            shutdown();
        }
    }

    public void send(Message data) {
        if (multicast == null) {
            return;
        }
        DatagramPacket packet = data.format();
        packet.setAddress(group);
        packet.setPort(port);

        try {
            multicast.send(packet);
            if (State.ALIVE == data.getState()) {
                logger.debug("send group=" + group + ", port=" + port + " signal=" + data.getState());
            } else {
                // warn : better monitor
                logger.warn("send group=" + group + ", port=" + port + " signal=" + data.getState());
            }
        } catch (IOException e) {
            logger.warn("Send UDP Data={" + data + "} to group=" + group.getHostAddress() + ", port=" + port + " fail",
                    e);
        }
    }

    public void shutdown() {
        if (multicast != null) {
            try {
                multicast.leaveGroup(group);
            } catch (IOException e) {
            }
            multicast.close();
            multicast = null;
        }
    }
    
}
