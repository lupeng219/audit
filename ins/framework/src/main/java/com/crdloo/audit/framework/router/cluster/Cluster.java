package com.crdloo.audit.framework.router.cluster;

import java.io.IOException;
import java.net.Socket;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import org.apache.log4j.Logger;

public class Cluster {
	
	private static final Logger logger = Logger.getLogger(Cluster.class);

	private volatile CopyOnWriteArrayList<Address> aliveAddresses = new CopyOnWriteArrayList<Address>();

    private volatile CopyOnWriteArrayList<Address> zombieAddresses = new CopyOnWriteArrayList<Address>();
    
    private final Object monitor = new Object();
    
    public Cluster() {
    	
    }
    
    public void put(String server) {
        Address address = Address.found(server);
        put(address);
    }
    
    public void put(Address address) {
        if (isValidate(address)) {
            aliveAddresses.addIfAbsent(address);
        } else {
            zombieAddresses.addIfAbsent(address);
        }
    }
    
    public static boolean isValidate(Address address) {
        boolean validate = false;
        Socket connector = null;
        try {
            connector = new Socket(address.getIp(), address.getPort());
            validate = true;
        } catch (Exception e) {
        	logger.error("new socket to " + address + " " + e.getMessage());
        }
        if (connector != null) {
            try {
                connector.close();
            } catch (IOException e) {
            }
        }
        return validate;
    }
    
    /**
     * 恢复(使之有效)
     * 
     * @param address
     */
    public void validate(Address address) {
        synchronized (monitor) {
            aliveAddresses.addIfAbsent(address);
            removeAll(zombieAddresses, address);
        }
    }

    /**
     * 残废(使之无效)
     * 
     * @param address
     */
    public void invalidate(Address address) {
        synchronized (monitor) {
            removeAll(aliveAddresses, address);
            zombieAddresses.addIfAbsent(address);
        }
    }

    private void removeAll(final CopyOnWriteArrayList<Address> list, Address address) {
        while (list.contains(address)) {
            list.remove(address);
        }
    }
    
    public Address index(int index) {
        int size = aliveSize();
        if (size == 0) {
            return null;
        }
        if (index < 0 || index >= size) {
            index = 0;
        }
        return aliveAddresses.get(index);
    }
    
    /**
     * 保持连接的服务器个数
     * 
     * @return
     */
    public int aliveSize() {
        return aliveAddresses.size();
    }
    
    /**
     * 判断服务器是否活着的
     * 
     * @param address
     * @return
     */
    public boolean isAlive(Address address) {
        return aliveAddresses.contains(address);
    }
    
    public List<Address> getAliveAddresses() {
        return Collections.unmodifiableList(aliveAddresses);
    }

    public List<Address> getZombieAddresses() {
        return Collections.unmodifiableList(zombieAddresses);
    }
    
    public String clusterName() {
        return this.toString();
    }
    
}
