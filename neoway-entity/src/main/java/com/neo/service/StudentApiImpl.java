package com.neo.service;


import com.neo.api.StudentApi;
import com.neo.common.model.Student;
import com.neo.dao.NeoStudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 20130702224 on 2017/10/18.
 */

@Service("studentApiImpl")
public class StudentApiImpl implements StudentApi {

//    @Autowired
//    private StudentService studentService;

    @Autowired
    private NeoStudentMapper neoStudentMapper;

    @Override
    public List<Student> findAllStudents() {
       return neoStudentMapper.findAllStudents();
    }

    @Override
    public Student findById(Integer id) {
        try {
            return neoStudentMapper.findById(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void deleteStudent(Integer id) {
        try {
            neoStudentMapper.deleteStudent(id);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    public void addStudent(Student student) {
        try {
            neoStudentMapper.addStudent(student);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    public void updateStudent(Student student) {
        try {
            neoStudentMapper.updateStudent(student);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    public int getMaxId() {
        return 0;
    }
}
