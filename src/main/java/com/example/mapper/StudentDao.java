package com.example.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.example.pojo.domain.Student;
import com.example.pojo.ro.StudentRo;
import com.example.pojo.so.StudentSo;

public interface StudentDao {

	
	public void insertStudent(String sql,Student student);
	
	public void updateStudent(String sql,Student student);
	
	public void deleteStudent(String sql,Student student);
	
	public StudentRo selectSingleStudent(String sql,StudentSo studentSo);
	
	@Select("select * from student")
	@Results({
		@Result(property="id",column="ID"),
		@Result(property="name",column="NAME"),
		@Result(property="age",column="AGE"),
		@Result(property="sex",column="SEX")
	})
	public List<StudentRo> getAll();
	
	@Select("select * from student where id=#{id}")
	@Results({
		@Result(property="id",column="ID"),
		@Result(property="name",column="NAME"),
		@Result(property="age",column="AGE"),
		@Result(property="sex",column="SEX")
	})
	public StudentRo getOne(Long id);
	
	@Insert("insert into student(NAME,AGE,SEX,DELETE_FLAG) values(#{name},#{age},#{sex},#{deleteFlag})")
	public void insert(Student student);
	
	@Update("update  student set NAME=#{name},AGE=#{age},SEX=#{sex} where ID=#{id})")
	public void update(Student student);
	
	@Delete("delete from student where ID=#{id}")
	public void delete(Long id);
}
