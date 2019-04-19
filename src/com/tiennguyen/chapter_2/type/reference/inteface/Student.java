/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tiennguyen.chapter_2.type.reference.inteface;

/**
 *
 * @author Neit Ng
 */
public class Student implements Person {

    @Override
    public void go() {
        System.err.println("Student is going.");
    }
    
}
