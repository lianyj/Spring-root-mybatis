package com.example.service;

import java.util.List;

import com.example.pojo.domain.TestUser;
import com.example.pojo.ro.TestUserRo;
import com.example.pojo.so.TestUserSo;

public interface TestUserService {

	public void insertUser(TestUser user);
	
	public void updateUser(TestUser user);
	
	public void deleteUser(TestUser user);
	
	public TestUserRo selectSingleUser(TestUserSo userSo);
	
	public List<TestUserRo> selectUserList(TestUserSo userSo);
}
