package com.example.pojo.ro;

import java.io.Serializable;

public class PersonRo implements Serializable {

/**
	 * 
	 */
	private static final long serialVersionUID = -1278132521746865556L;

	private Long id;
	
	private String address;
	
	private Integer age;
	
	private String name;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
