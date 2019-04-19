/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tiennguyen.chapter_2.operator;

/**
 *
 * @author Neit Ng
 */
public class MainNumber {

    public static void main(String[] args) {
        MainNumber number = new MainNumber();
//        number.prePostFix();
//        number.modul();
        number.move();
    }
    
    public void move() {
        byte a = (byte) Byte.MAX_VALUE;
        byte b = (byte) (a>>1);
        byte c = (byte) (a<<1);
        printByte("Current a: ", a);
        printByte("a>>1: ", b);
        printByte("a<<1: ", c);
    }
    
    private void printByte(String prefix, byte b) {
        String s = prefix + " " +String.format("%8s", Integer.toBinaryString(b & 0xFF)).replace(' ', '0');
        System.out.println(s);
    }
    
    /**
     * Demo modulo of number.
     */
    public void modul() {
        int a = 10;
        long b = 10L;
        float c = 10.0F;
        double d = 10.0D;
        
        System.out.println("\n -- int & long: 10 / 3");
        System.out.println(a / 3);
        System.out.println(b / 3);
        
        System.out.println("\n -- float & double: 10 / 3");
        System.out.println(c / 3);
        System.out.println(d / 3);
        
        System.out.println("\n -- Modulo: 10 % 3");
        System.out.println(a % 3);
        System.out.println(b % 3);
        System.out.println(c % 3);
        System.out.println(d % 3);
    }
 
    /**
     * Demo prefix and postfix in Java.
     */
    public void prePostFix() {
        int a = 1, b;
        b = ++a;    // Prefix
        System.out.println("Print variable with prefix");
        System.out.println(a);
        System.out.println(b);

        a = 1;
        b = a++;    // Postfix
        System.out.println("Print variable with postfix");
        System.out.println(a);
        System.out.println(b);
    }
}
