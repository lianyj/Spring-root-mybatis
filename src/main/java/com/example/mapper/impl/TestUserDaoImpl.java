package com.example.mapper.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.mapper.TestUserDao;
import com.example.pojo.domain.TestUser;
import com.example.pojo.ro.TestUserRo;
import com.example.pojo.so.TestUserSo;
@Repository("testUserDao")
public class TestUserDaoImpl implements TestUserDao{
	
	/** mybatis服务 */
	@Autowired
	private SqlSession sqlSessionTemplate;

	public void insertUser(String sql,TestUser user){
		sqlSessionTemplate.insert(sql, user);
	}
	
	public void updateUser(String sql,TestUser user){
		sqlSessionTemplate.update(sql, user);
	}
	
	public void deleteUser(String sql,TestUser user){
		sqlSessionTemplate.delete(sql, user);
	}
	
	public TestUserRo selectSingleUser(String sql,TestUserSo userSo){
		return sqlSessionTemplate.selectOne(sql, userSo);
	}
	
	public List<TestUserRo> selectUserList(String sql,TestUserSo userSo){
		return sqlSessionTemplate.selectList(sql, userSo);
	}
}
