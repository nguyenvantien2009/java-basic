/*
 * Copyright 2018, VTS Space, http://vtsspace.com.
 *
 * This software is released under the terms of the
 * GNU LGPL license. See http://www.gnu.org/licenses/lgpl.html
 * for more information.
 *
 */

package com.tiennguyen.chapter_2.variable;

/**
 * @author Tien Nguyen (Enit Ng: http://nguyenvantien2009.com)
 */
public class LocalVariable {

    public static void main(String[] args) {
        String name = "Tien Nguyen";
        int age = 32;

        new LocalVariable().show(name, age);
    }

    public void show(String name, int age) {
        System.out.println("I am " + name + ". I'm " + age + " years old.");
    }
}
