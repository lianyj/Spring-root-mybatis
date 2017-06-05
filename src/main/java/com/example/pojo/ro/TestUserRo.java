package com.example.pojo.ro;

import java.io.Serializable;

public class TestUserRo implements Serializable{

	private static final long serialVersionUID = -5798899711565977164L;

	private Long id;
	
	private String account;
	
	private String password;

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
   
}
