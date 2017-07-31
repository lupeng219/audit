package com.crdloo.audit.client.dto;

import java.util.Date;
import java.util.List;

import org.apache.commons.lang.builder.ReflectionToStringBuilder;
import org.codehaus.jackson.map.annotate.JsonDeserialize;
import org.codehaus.jackson.map.annotate.JsonSerialize;

import com.crdloo.audit.framework.client.IDto;
import com.crdloo.audit.framework.router.utils.CustomDateTimeDeserializer;
import com.crdloo.audit.framework.router.utils.CustomDateTimeSerializer;

public class ExampleDto implements IDto {

	private static final long serialVersionUID = 5500300946777463542L;

	private Long id;
	private String name;
	private List<String> tags;
	@JsonSerialize(using=CustomDateTimeSerializer.class)
	@JsonDeserialize(using=CustomDateTimeDeserializer.class)
	private Date created;
	
	public ExampleDto(){
		
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
	
	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	@Override
	public String toString() {
		String[] others = new String[] {};
		return ReflectionToStringBuilder.toStringExclude(this, others);
	}
	
}
