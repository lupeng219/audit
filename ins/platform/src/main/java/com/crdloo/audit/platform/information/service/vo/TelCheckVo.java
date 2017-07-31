package com.crdloo.audit.platform.information.service.vo;


import org.apache.commons.lang.builder.ReflectionToStringBuilder;

public class TelCheckVo{
	private static final long serialVersionUID = 4065294738168332768L;
    private Long id;
	private String swift_number ;
	private Flag flag;
    private Product product;
    

	public TelCheckVo() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSwift_number() {
		return swift_number;
	}

	public void setSwift_number(String swift_number) {
		this.swift_number = swift_number;
	}

	public Flag getFlag() {
		return flag;
	}

	public void setFlag(Flag flag) {
		this.flag = flag;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	@Override
    public String toString() {
        String[] others = new String[] {};
        return ReflectionToStringBuilder.toStringExclude(this, others);
    }
    
}
