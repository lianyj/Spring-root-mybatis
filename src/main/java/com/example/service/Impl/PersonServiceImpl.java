package com.example.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mapper.PersonDao;
import com.example.pojo.domain.Person;
import com.example.pojo.ro.PersonRo;
import com.example.pojo.so.PersonSo;
import com.example.service.PersonService;
import com.example.util.constans.CommonConstant;

@Service("personService")
public class PersonServiceImpl implements PersonService {

	@Autowired
	private PersonDao testPersonDao;
	
	public void insertPerson(Person person){
		testPersonDao.insertPerson(CommonConstant.INSERT_PERSON, person);
	}
	
	public void updatePerson(Person person){
		testPersonDao.updatePerson(CommonConstant.UPDATE_PERSON, person);
	}
	
	public void deletePerson(Person person){
		testPersonDao.deletePerson(CommonConstant.DELETE_PERSON, person);
	}
	
	public PersonRo selectSinglePerson(PersonSo personSo){
		return testPersonDao.selectSinglePerson(CommonConstant.SELECT_SINGLE_PERSON, personSo);
	}
	
	public List<PersonRo> selectPersonList(PersonSo personSo){
		return testPersonDao.selectPersonList(CommonConstant.SELECT_PERSON_LIST, personSo);
	}
}
