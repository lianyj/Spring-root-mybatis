package com.example.mapper;

import java.util.List;

import com.example.pojo.domain.TestUser;
import com.example.pojo.ro.TestUserRo;
import com.example.pojo.so.TestUserSo;

public interface TestUserDao {

	public void insertUser(String sql,TestUser user);
	
	public void updateUser(String sql,TestUser user);
	
	public void deleteUser(String sql,TestUser user);
	
	public TestUserRo selectSingleUser(String sql,TestUserSo userSo);
	
	public List<TestUserRo> selectUserList(String sql,TestUserSo userSo);
}
