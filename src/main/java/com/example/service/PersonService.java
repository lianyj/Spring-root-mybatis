package com.example.service;

import java.util.List;

import com.example.pojo.domain.Person;
import com.example.pojo.ro.PersonRo;
import com.example.pojo.so.PersonSo;

public interface PersonService {

	
	public void insertPerson(Person person);
	
	public void updatePerson(Person person);
	
	public void deletePerson(Person person);
	
	public PersonRo selectSinglePerson(PersonSo personSo);
	
	public List<PersonRo> selectPersonList(PersonSo personSo);
}
