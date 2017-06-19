package com.example.springbootsamplemybatis;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.pojo.so.PersonSo;
import com.example.service.PersonService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PersonTest {

	@Autowired
	private PersonService personService;
	
//	@Test
//	public void testQuery(){
//		PersonSo personSo =new PersonSo();
//		personSo.setId(1l);
//		PersonRo p=personService.selectSinglePerson(personSo);
//		System.out.println(p.toString());
//	}
//	
//	@Test
//	public void testInsert(){
////		personService.insertPerson(new Person("beijing", 18, "lyj"));
////		personService.insertPerson(new Person("tianjing", 17, "sjs"));
////		personService.insertPerson(new Person("hangzhou", 16, "zy"));
//		PersonSo personSo =new PersonSo();
//		personSo.setAge(18);
//		personSo.setAddress("beijing");
//		String name = personService.selectSinglePerson(personSo).getName();
//		Assert.assertEquals("lyj",name);
//	}
	
//	/** 测试新增 */
//	@Test
//	public void testInsert(){
//
//		Person person =new Person();
//		person.setName("哈哈");
//		person.setAge(52);
//		person.setAddress("CN");
//		personService.insertPerson(person);
//		
//		PersonSo personSo = new PersonSo();
//		personSo.setName("哈哈");
//		personSo.setAge(52);
//		personSo.setAddress("CN");
//		
//		Assert.assertEquals("哈哈", personService.selectSinglePerson(personSo).getName());
//
//	}
	
	/** 测试新增 */
	@Test
	public void testList(){
		PersonSo personSo =new PersonSo();
		Assert.assertEquals(13,personService.selectPersonList(personSo).size());
	}
}
