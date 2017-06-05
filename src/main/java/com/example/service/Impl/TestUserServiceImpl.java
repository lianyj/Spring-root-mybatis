package com.example.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mapper.TestUserDao;
import com.example.pojo.domain.TestUser;
import com.example.pojo.ro.TestUserRo;
import com.example.pojo.so.TestUserSo;
import com.example.service.TestUserService;
import com.example.util.constans.CommonConstant;
@Service("testUserService")
public class TestUserServiceImpl implements TestUserService{

	@Autowired
	private TestUserDao testUserDao;
	
	public void insertUser(TestUser user){
		testUserDao.insertUser(CommonConstant.INSERT_USER, user);
	}
	
	public void updateUser(TestUser user){
		testUserDao.updateUser(CommonConstant.UPDATE_USER, user);
	}
	
	public void deleteUser(TestUser user){
		testUserDao.deleteUser(CommonConstant.DELETE_USER, user);
	}
	
	public TestUserRo selectSingleUser(TestUserSo userSo){
		return testUserDao.selectSingleUser(CommonConstant.SELECT_SINGLE_USER, userSo);
	}
	
	public List<TestUserRo> selectUserList(TestUserSo userSo){
		return testUserDao.selectUserList(CommonConstant.SELECT_USER_LIST, userSo);
	}
}
