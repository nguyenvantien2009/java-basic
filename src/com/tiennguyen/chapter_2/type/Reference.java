/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tiennguyen.chapter_2.type;

/**
 *
 * @author Neit Ng
 */
public class Reference {
    
    public static void main(String[] args) {
//        String name = "Nguyen Van Tien";
//        System.out.println(name);
//        
//        String nameRef = name;
//        System.out.println(nameRef);
//        
//        nameRef = "My Name is changed";
//        System.out.println(nameRef);
//        System.out.println(name);
        
        Student student1 = new Student("Tien Nguyen", 32);
        System.out.println(student1);
        
        Student student2 = student1;
        student2.setAge(23);
        System.out.println(student1);
    }
}
