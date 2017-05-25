package com.example.mapper;

import java.util.List;

import com.example.pojo.domain.Person;
import com.example.pojo.ro.PersonRo;
import com.example.pojo.so.PersonSo;

public interface PersonDao {

	
	public void insertPerson(String sql,Person person);
	
	public void updatePerson(String sql,Person person);
	
	public void deletePerson(String sql,Person person);
	
	public PersonRo selectSinglePerson(String sql,PersonSo personSo);
	
	public List<PersonRo> selectPersonList(String sql,PersonSo personSo);
}
