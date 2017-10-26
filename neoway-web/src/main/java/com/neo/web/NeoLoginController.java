package com.neo.web;

import com.neo.api.StudentApi;


import com.neo.common.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;


//import com.sun.org.glassfish.gmbal.ParameterNames;

/**
 * Created by 20130702224 on 2017/8/22.
 */
@Controller
@RequestMapping(value = "/user")
public class NeoLoginController {

//    @Autowired
//    private NeoStudentServiceI neoStudentServiceImpl;
    @Autowired
    private StudentApi studentApi;

    @RequestMapping(value = "/hello.do",method = RequestMethod.GET)
    public String loginin(){
        return "StudentLogin";
    }

  @RequestMapping(value = "/list.do" ,method = RequestMethod.GET)
    public String list(Model model){
      List<Student> list=studentApi.findAllStudents();
      model.addAttribute("list",list);
              return "list";
  }
    @RequestMapping(value = "/add.do",method = RequestMethod.POST)
    public String add(Student student){
        try {
            studentApi.addStudent(student);
        } catch (Exception e) {
            return  e.getMessage();
        }
        return "success";
    }
    @RequestMapping(value = "/delete.do",method =RequestMethod.POST )
    public String delete(Integer id){
        try {
            studentApi.deleteStudent(id);
        } catch (Exception e) {
            return e.getMessage();
        }
        return "success";
    }
    @RequestMapping(value = "/get.do",method = RequestMethod.POST)
    public String get(Integer id,Model model){
        try {
            Student student=studentApi.findById(id);
            model.addAttribute("student",student);
            return "show";
        }catch (Exception e){
            return  e.getMessage();
        }
    }
    @RequestMapping(value = "/update.do",method = RequestMethod.POST)
    public String update(Student student){
        try {
            studentApi.updateStudent(student);
        } catch (Exception e) {
            return e.getMessage();
        }
        return "success";
    }


}
