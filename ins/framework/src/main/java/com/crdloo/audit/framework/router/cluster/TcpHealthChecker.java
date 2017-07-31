package com.crdloo.audit.framework.router.cluster;

public class TcpHealthChecker extends AbstractHealthChecker<Address> {

	public TcpHealthChecker() {
        this(SWITCH_THRESHOLD);
    }

    public TcpHealthChecker(int threshold) {
        setFallCount(threshold);
        setRiseCount(threshold);
    }

    @Override
    public Boolean check(Address address) {
        return Cluster.isValidate(address);
    }

}
