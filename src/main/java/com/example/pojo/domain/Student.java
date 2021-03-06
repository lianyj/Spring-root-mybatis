package com.example.pojo.domain;

import java.io.Serializable;

import com.zjtachao.framework.common.util.context.CommonContext.DeleteFlagContext;

public class Student implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3909750697604555936L;

	private Long id;
	
	private String name;
	
	private Integer age;
	
	private Integer sex;
	
	 /** 删除标志 **/
   private String deleteFlag = DeleteFlagContext.DELETE_NO.getCode();

	public String getDeleteFlag() {
		return deleteFlag;
	}

	public void setDeleteFlag(String deleteFlag) {
		this.deleteFlag = deleteFlag;
	}
	
	public Student(String name,Integer age,Integer sex) {
		super();
		this.age=age;
		this.name=name;
		this.sex=sex;
		
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
