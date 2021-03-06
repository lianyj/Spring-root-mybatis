package com.example.pojo.ro;

import java.io.Serializable;

public class StudentRo implements Serializable {

/**
	 * 
	 */
	private static final long serialVersionUID = -6169967553998321519L;

	private Long id;
	
	private String name;
	
	private Integer age;
	
	private Integer sex;

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

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Integer getSex() {
		return sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}
	
}
