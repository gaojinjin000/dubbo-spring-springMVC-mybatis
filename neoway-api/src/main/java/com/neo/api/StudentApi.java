package com.neo.api;



import com.neo.common.model.Student;

import java.util.List;

/**
 * Created by 20130702224 on 2017/10/18.
 */
public interface StudentApi {
    public List<Student> findAllStudents();
    public Student findById(Integer id);
    public void deleteStudent(Integer id);
    public  void addStudent(Student student);
    public void updateStudent(Student student);
    public int getMaxId();
}
