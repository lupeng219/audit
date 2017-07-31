package com.crdloo.audit.framework.router.conf;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.LinkedHashSet;
import java.util.Set;

import org.apache.log4j.Logger;

public class ClusterConfig {

	private static final Logger logger = Logger.getLogger(ClusterConfig.class);
	
    public static final String CLUSTER_CONF_PATH = "cluster.conf.path";

    public static final String CLUSTER_FILENAME = "ins-cluster.conf";
    
    public static final String AUTOLOADING_TAG = "autoloading";
	
    public static boolean isHttpAutoloading(String projectName) {
        File file = checkAndGet();
        return getConfig(file, projectName, AUTOLOADING_TAG);
    }
    
    public static String[] getConfigs(String... keys) {
        File file = checkAndGet();
        return getConfigs(file, keys);
    }
    
    public static File checkAndGet() {
        String dir = System.getProperty(CLUSTER_CONF_PATH);
        if (dir == null) {
        	//从classpath加载ins-cluster.conf文件
        	URL url = ClusterConfig.class.getResource("/");
        	dir = url.getPath() + CLUSTER_FILENAME;
        }
        File file = new File(dir);
        if (!file.exists() || !file.isFile()) {
            throw new RuntimeException("Router Cluster Conf file \"" + dir + "\" is incorrect, please check it.");
        }
        String name = file.getName();
        if (!CLUSTER_FILENAME.equals(name)) {
            throw new RuntimeException("Router Cluster Conf filename is not \"" + CLUSTER_FILENAME
                    + "\", please check it.");
        }
        return file;
    }
    
    private static boolean getConfig(File file, String projectName, String tag) {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(file));
            String line = null;
            while ((line = br.readLine()) != null) {
                if (ignore(line)) {
                    continue;
                }
                if (isBeginRead(line, projectName)) {
                    return hasTag(line, tag);
                }
            }
        } catch (Exception e) {
            logger.warn("read file " + file.getAbsolutePath() + " fail.", e);
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                }
            }
        }
        return false;
    }
    
    private static String[] getConfigs(File file, String... keys) {
        String[] values = new String[keys.length];
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(file));
            String line = null;
            boolean begin = false;
            boolean end = false;
            while ((line = br.readLine()) != null) {
                if (ignore(line)) {
                    continue;
                }
                if (begin) {
                    end = equals(line, "</config>");
                    if (!end) {
                        if (ignore(line)) {
                            continue;
                        }
                        String[] array = line.split("=");
                        for (int i = 0; i < keys.length; i++) {
                            if (array[0].equals(keys[i])) {
                                values[i] = array[1];
                                break;
                            }
                        }
                    } else {
                        break;
                    }
                } else {
                    begin = equals(line, "<config>");
                }
            }
        } catch (Exception e) {
            logger.warn("read file " + file.getAbsolutePath() + " fail.", e);
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                }
            }
        }
        return values;
    }
    
    private static boolean ignore(String line) {
        return line.trim().length() == 0 || line.startsWith("#");
    }
    
    private static boolean isBeginRead(String line, String projectName) {
        String str = line.trim();
        return str.startsWith("router") && (str.indexOf(projectName) != -1);
    }
    
    private static boolean isEndRead(String line) {
        return "}".equals(line.trim());
    }
    
    private static boolean equals(String line, String flag) {
        return flag.equals(line.trim());
    }
    
    private static boolean hasTag(String line, String tag) {
        String str = line.trim();
        return str.startsWith("router") && (str.indexOf(tag) != -1);
    }
    
    public static Set<String> getClusters(String projectName, String agreement) {
        File file = checkAndGet();
        if (projectName == null || projectName.trim().length() == 0) {
        	throw new RuntimeException("projectName is null, please config it.");
        }
        return getServers(file, projectName, agreement);
    }
    
    private static String still(String line, String agreement) {
        String str = line.trim();
        if (!str.startsWith("#")) {
            if (str.startsWith(agreement)) {
                String server = str.substring(agreement.length(), str.length() - 1);
                return server.trim();
            }
        }
        return null;
    }
    
    private static Set<String> getServers(File file, String projectName, String agreement) {
        Set<String> servers = new LinkedHashSet<String>();
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(file));
            String line = null;
            boolean begin = false;
            boolean end = false;
            while ((line = br.readLine()) != null) {
                if (ignore(line)) {
                    continue;
                }
                if (begin) {
                    end = isEndRead(line);
                    if (!end) {
                        String server = still(line, agreement);
                        if (server != null) {
                        	servers.add(server);
                        }
                    } else {
                        break;
                    }
                } else {
                    begin = isBeginRead(line, projectName);
                }
            }
        } catch (Exception e) {
            logger.warn("read file " + file.getAbsolutePath() + " fail.", e);
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                }
            }
        }
        return servers;
    }
}
