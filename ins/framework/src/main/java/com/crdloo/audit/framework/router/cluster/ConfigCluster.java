package com.crdloo.audit.framework.router.cluster;

import java.util.Set;

import com.crdloo.audit.framework.router.conf.ClusterConfig;

public class ConfigCluster extends Cluster {

	private String projectName;

    public ConfigCluster(String projectName) {
        super();
        this.projectName = projectName;
        setup();
    }
    
    private void setup() {
        Set<String> servers = ClusterConfig.getClusters(projectName, "http");
        if (servers.isEmpty()) {
            throw new RuntimeException("Router Cluster Conf File " + projectName + " Content Error, please check it.");
        }

        // auto box
        for (String server : servers) {
            put(server);
        }
    }

    @Override
    public String clusterName() {
        return projectName;
    }
}
