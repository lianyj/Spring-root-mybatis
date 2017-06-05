package com.example.pojo.domain;

import java.io.Serializable;

import com.zjtachao.framework.common.util.context.CommonContext.DeleteFlagContext;

public class TestUser implements Serializable{

	private static final long serialVersionUID = -5798899711565977164L;

	private Long id;
	
	private String account;
	
	private String password;
	
	 /** 删除标志 **/
   private String deleteFlag = DeleteFlagContext.DELETE_NO.getCode();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDeleteFlag() {
		return deleteFlag;
	}

	public void setDeleteFlag(String deleteFlag) {
		this.deleteFlag = deleteFlag;
	}
   
   
}
