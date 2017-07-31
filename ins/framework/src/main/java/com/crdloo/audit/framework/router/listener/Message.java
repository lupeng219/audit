package com.crdloo.audit.framework.router.listener;

import java.net.DatagramPacket;

public class Message {

	private int port;
    private State state;

    private String ip;

    public Message(int port, State state) {
        this.port = port;
        this.state = state;
    }

    public int getPort() {
        return port;
    }

    public State getState() {
        return state;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    @Override
    public String toString() {
        return port + "@" + state;
    }

    public DatagramPacket format() {
        String data = toString();
        return new DatagramPacket(data.getBytes(), data.length());
    }

    public static Message format(DatagramPacket packet) {
        String data = new String(packet.getData(), 0, packet.getLength());
        String[] array = data.split("@");
        return new Message(Integer.parseInt(array[0]), State.valueOf(State.class, array[1]));
    }

    public static enum State {
        STARTED, STOPPED, ALIVE
    }
    
}
