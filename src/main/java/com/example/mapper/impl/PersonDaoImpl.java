package com.example.mapper.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.mapper.PersonDao;
import com.example.pojo.domain.Person;
import com.example.pojo.ro.PersonRo;
import com.example.pojo.so.PersonSo;

@Repository("personDao")
public class PersonDaoImpl implements PersonDao {

	/** mybatis服务 */
	@Autowired
	private SqlSession sqlSessionTemplate;
	
	public void insertPerson(String sql,Person person){
		sqlSessionTemplate.insert(sql, person);
	}
	
	public void updatePerson(String sql,Person person){
		sqlSessionTemplate.update(sql, person);
	}
	
	public void deletePerson(String sql,Person person){
		sqlSessionTemplate.delete(sql, person);
	}
	
	public PersonRo selectSinglePerson(String sql,PersonSo personSo){
		return sqlSessionTemplate.selectOne(sql, personSo);
	}
	
	public List<PersonRo> selectPersonList(String sql,PersonSo personSo){
		return sqlSessionTemplate.selectList(sql, personSo);
	}
}
