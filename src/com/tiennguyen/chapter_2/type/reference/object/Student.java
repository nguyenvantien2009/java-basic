/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tiennguyen.chapter_2.type.reference.object;

/**
 *
 * @author Neit Ng
 */
public class Student {
    
    public static void main(String[] args) {
        Student student = new Student("Tien Nguyen", 32);
        System.out.println("Name: " + student.getName());
        System.err.println("Age: " + student.getAge());
        System.out.println(student);
    }

    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

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
        return "Student{" + "name=" + name + ", age=" + age + '}';
    }

}
