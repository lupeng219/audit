package com.crdloo.audit.web.example.form;

import java.io.Serializable;
import java.util.List;

import org.apache.commons.lang.builder.ReflectionToStringBuilder;

import com.crdloo.audit.client.dto.ExampleDto;

public class ExampleForm implements Serializable {

	private static final long serialVersionUID = 7240324999021738832L;

	private Long id;
	private String name;
	private List<String> tags;
	
	public ExampleForm(){
		
	}
	
	public ExampleForm(ExampleDto dto){
		this.id = dto.getId();
		this.name = dto.getName();
		this.tags = dto.getTags();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getTags() {
		return tags;
	}

	public void setTags(List<String> tags) {
		this.tags = tags;
	}
	
	@Override
	public String toString() {
		String[] others = new String[] {};
		return ReflectionToStringBuilder.toStringExclude(this, others);
	}
	
}
