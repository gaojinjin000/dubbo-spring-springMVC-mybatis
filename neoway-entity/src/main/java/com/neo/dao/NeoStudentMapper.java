package com.neo.dao;


import org.apache.ibatis.annotations.Param;

import com.neo.common.model.Student;

import java.util.List;

/**
 * List<User> findAll();
 User findById(String  id);
 void deleteById(String  id);
 void addUser(User user);
 void updateUser(User user);
 *
 *数据库的增删改查
 */


public interface NeoStudentMapper {
    public List<Student> findAllStudents();
    public Student findById(Integer id);
    public void deleteStudent(Integer id);
    public  void addStudent(Student student);
    public void updateStudent(Student student);
    public int getMaxId();

}
