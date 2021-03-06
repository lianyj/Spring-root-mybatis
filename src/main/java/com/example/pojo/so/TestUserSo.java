package com.example.pojo.so;

import com.zjtachao.framework.common.util.context.CommonContext.DeleteFlagContext;
import com.zjtachao.framework.pojo.so.base.BaseSo;

public class TestUserSo extends BaseSo{

	private static final long serialVersionUID = 6731171255440526652L;

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
