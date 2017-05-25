package com.example.springbootsamplemybatis;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.mapper.StudentDao;
import com.example.pojo.ro.StudentRo;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentTest {

	@Autowired
	private StudentDao studentDao;
	
//	@Test
//	public void testInsert() throws Exception{
//		studentDao.insert(new Student("lyj", 20, 1));
//		studentDao.insert(new Student("zgf", 50, 1));
//		studentDao.insert(new Student("xjy", 20, 0));
//		studentDao.insert(new Student("fwr", 20, 0));
//		studentDao.insert(new Student("sjs", 19, 0));
//		studentDao.insert(new Student("zgx", 20, 0));
//		
//		Assert.assertEquals(19, studentDao.getAll().size());
//	}

	@Test
	public void testQuery(){
		List<StudentRo> studentRos = studentDao.getAll();
		System.out.println(studentRos.toString());
	}
	
}
