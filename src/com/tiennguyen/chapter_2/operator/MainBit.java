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
public class MainBit {

    public static void main(String[] args) {
        System.out.println(!false);
        System.out.println(true & false);
        System.out.println(true | false);
        System.out.println(true ^ false);
        
        System.out.println(true ^ true);
        System.out.println(false ^ false);
        
        System.out.println(~1);
    }
}
