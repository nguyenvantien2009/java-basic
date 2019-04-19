/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tiennguyen.chapter_2.casting;

/**
 * @author Neit Ng
 */
public class MainCasting {

    public static void main(String[] args) {
        MainCasting cast = new MainCasting();

        System.out.println("\n1. Casting with narrowing.");
        cast.narrowing();

        System.out.println("\n2. Casting with widening.");
        cast.widening();

        System.out.println("\n3. Casting with upcasting.");
        cast.upcasting();

        System.out.println("\n4. Casting with downcasting.");
        cast.downcasting();

    }

    /**
     * up-casting.
     */
    public void upcasting() {
        Student student = new Student();
        student.setAge(12);
        student.setName("Tiển Nguyễn");
        System.out.println("Student : " + student);

        Person person = student;
        System.out.println("Person : " + student);
    }

    /**
     * down-casting with student and person.
     */
    public void downcasting() {
        Person person = new Person();
        person.setName("Tiển Nguyễn");
        System.out.println("Person : " + person);

        Person tmp = new Student();
        System.out.println("Student : " + (Student)tmp);
    }

    /**
     * narrowing is casting type that there is no loss of data.
     * Data types: byte -> short -> char -> int.
     *
     * @author Tien Nguyen
     */
    private void narrowing() {
        System.out.println("---");
        int maxInt = Integer.MAX_VALUE;
        System.out.println(String.format("Max int to short: \t%s -> \t%s", maxInt, (short) maxInt));
        System.out.println(String.format("Max int to char: \t%s -> \t%s", maxInt, (char) maxInt));
        System.out.println(String.format("Max int to byte: \t%s -> \t%s", maxInt, (byte) maxInt));
        //System.out.println(String.format("Max int to byte: \t%s -> \t%s", maxInt, (boolean)maxInt));

        System.out.println("---");
        int minInt = Integer.MIN_VALUE;
        System.out.println(String.format("Min int to short: \t%s -> \t%s", minInt, (short) minInt));
        System.out.println(String.format("Min int to char: \t%s -> \t%s", minInt, (char) minInt));
        System.out.println(String.format("Min int to byte: \t%s -> \t%s", minInt, (byte) minInt));
    }

    /**
     * widening is casting type that there is no loss of data.
     * Data Type: int -> float -> double. From max -> min of Integer.
     *
     * @author Tien Nguyen
     */
    private void widening() {
        System.out.println("---");
        int maxInt = Integer.MAX_VALUE;
        System.out.println(String.format("Max int to long: \t%s -> \t%s", maxInt, (long) maxInt));
        System.out.println(String.format("Max int to float: \t%s -> \t%s", maxInt, (float) maxInt));
        System.out.println(String.format("Max int to double: \t%s -> \t%s", maxInt, (double) maxInt));
        System.out.println("---");
        int minInt = Integer.MIN_VALUE;
        System.out.println(String.format("Min int to long: \t%s -> \t%s", minInt, (long) minInt));
        System.out.println(String.format("Min int to float: \t%s -> \t%s", minInt, (float) minInt));
        System.out.println(String.format("Min int to double: \t%s -> \t%s", minInt, (double) minInt));
    }
}   
