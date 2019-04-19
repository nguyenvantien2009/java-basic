/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tiennguyen.chapter_3.condition;

/**
 *
 * @author Neit Ng
 */
public class MainIf {
    
    public static void main(String[] args) {

        boolean exists = true;


        if(exists) {
            System.out.println("Exists Student.");
        }

        if(exists) {
            System.out.println("Exists Student.");
        } else {
            System.out.println("Not exists Student.");
        }

        // Short code with conditions
        String name = exists ? "Nguyen Van Tien" : "-- Empty --";

        int score = 7;
        if(score > 8) {
            System.out.println("Your are best Student.");
        } else if(score > 7) {
            System.out.println("Your are good Student.");
        } else if(score > 5) {
            System.out.println("Your are middle Student.");
        } else {
            System.out.println("Your are not good Student.");
        }

        String rank = score > 8 ? "Best Student" : (score > 7 ? "Good Student" : (score > 5 ? "Middle Student" : "Not Good"));
    }
}
