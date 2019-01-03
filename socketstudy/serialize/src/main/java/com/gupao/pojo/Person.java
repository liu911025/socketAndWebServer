package com.gupao.pojo;

import java.io.Serializable;

/**
 * Created by liujiatai on 2018/12/25.
 */
public class Person implements Serializable{

    //private static final long serialVersionUID = 8114448366880295414L;
    private String name;
    
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
