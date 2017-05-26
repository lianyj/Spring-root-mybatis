package com.example.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.pojo.domain.Person;
import com.example.pojo.ro.PersonRo;
import com.example.pojo.so.PersonSo;
import com.example.service.PersonService;
@RestController
@RequestMapping("/person")
public class PersonResource {

	@Autowired
	private PersonService personService;
	
	
	@RequestMapping("/add")
	public String addPerson(String name,String address,Integer age){
		boolean flag = true;
		String msg = null;
		
		if(flag){
			if(null != name &&!"".equals(name)){
				flag=true;
			}else {
				flag=false;
				msg="错误，名字为空";
			}
		}
		
		if(flag){
			if(null != address &&!"".equals(address)){
				flag=true;
			}else {
				flag=false;
				msg="错误，地址为空";
			}
		}
		
		if(flag){
			if(null != age &&!"".equals(age)){
				flag=true;
			}else {
				flag=false;
				msg="错误，年龄为空";
			}
		}
		
		if(flag){
			Person person = new Person();
			person.setAddress(address);
			person.setName(name);
			person.setAge(age);
			personService.insertPerson(person);
			msg="创建成功";
		}
		
		return msg;
	}
	
	  
	@RequestMapping(value = "/update",method=RequestMethod.POST)
	public String updatePerson(@RequestBody Person person){
		boolean flag = true;
		String msg = null;
		
		if(flag){
			if(null != person &&!"".equals(person)){
				flag=true;
			}else {
				flag=false;
				msg="错误，json为空";
			}
		}
		
		if(flag){
			if(null != person.getId()&&!"".equals(person.getId())){
				flag=true;
			}else {
				flag=false;
				msg="错误，id为空";
			}
		}
		
		if(flag){
			personService.updatePerson(person);
			msg="成功";
		}
		
		return msg;
	}
	
	@RequestMapping("/delete/{id}")
	public String deletePerson(@PathVariable("id")Long id){
		boolean flag = true;
		String msg = null;
		
		if(flag){
			if(null != id &&!"".equals(id)){
				flag=true;
			}else {
				flag=false;
				msg="错误，id为空";
			}
		}
		
		if(flag){
			Person person = new Person();
			person.setId(id);
			personService.deletePerson(person);
			msg="成功";
		}
		
		return msg;
	}
	
	@RequestMapping("/query/one/{id}")
	public PersonRo queryone(@PathVariable("id")Long id){
		PersonRo personRo=null;
		if(null != id &&!"".equals(id)){
			PersonSo personSo = new PersonSo();
			personSo.setId(id);
			personRo = personService.selectSinglePerson(personSo);
		}
		return personRo;
	}

	
	@RequestMapping("/query/list")
	public List<PersonRo> queryLIst(){
		PersonSo personSo = new PersonSo();
		List<PersonRo> personRos = personService.selectPersonList(personSo);
		return personRos;
	}
}
