package com.neo.common.model;

/**
 * Created by 20130702224 on 2017/8/22.
 */


import java.io.Serializable;

/**
 * Created by 20130702224 on 2017/8/22.
 */
public class Student  implements Serializable {
    private Integer id;
    private String name;
    private Integer sal;

    public Student() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSal() {
        return sal;
    }

    public void setSal(Integer sal) {
        this.sal = sal;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sal=" + sal +
                '}';
    }
}