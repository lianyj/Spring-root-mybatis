package com.example.pojo.domain;

import java.io.Serializable;

import com.zjtachao.framework.common.util.context.CommonContext.DeleteFlagContext;

public class Person implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8181824770516679304L;

	
	private Long id;
	
	private String address;
	
	private Integer age;
	
	private String name;
	
	 /** 删除标志 **/
   private String deleteFlag = DeleteFlagContext.DELETE_NO.getCode();
   
   public Person(String address,Integer age,String name){
	   super();
	   this.address=address;
	   this.age=age;
	   this.name=name;
   }
   public Person(){
	   super();
   }

	public String getDeleteFlag() {
		return deleteFlag;
	}

	public void setDeleteFlag(String deleteFlag) {
		this.deleteFlag = deleteFlag;
	}

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
