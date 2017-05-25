package com.example.pojo.so;

import com.zjtachao.framework.common.util.context.CommonContext.DeleteFlagContext;
import com.zjtachao.framework.pojo.so.base.BaseSo;

public class PersonSo extends BaseSo{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5752358380750032297L;

	private Long id;
	
	private String address;
	
	private Integer age;
	
	private String name;
	
	 /** 删除标志 **/
    private String deleteFlag = DeleteFlagContext.DELETE_NO.getCode();
    

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
