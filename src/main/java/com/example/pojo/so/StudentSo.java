package com.example.pojo.so;

import com.zjtachao.framework.common.util.context.CommonContext.DeleteFlagContext;
import com.zjtachao.framework.pojo.so.base.BaseSo;

public class StudentSo extends BaseSo{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4461451943606881098L;

	private Long id;
	
	private String name;
	
	private Integer age;
	
	private Integer sex;
	
	 /** 删除标志 **/
    private String deleteFlag = DeleteFlagContext.DELETE_NO.getCode();

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

	public String getDeleteFlag() {
		return deleteFlag;
	}

	public void setDeleteFlag(String deleteFlag) {
		this.deleteFlag = deleteFlag;
	}
    
    
    
}
