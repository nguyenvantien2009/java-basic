/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tiennguyen.chuong_4.debug;

import java.util.Date;

/**
 *
 * @author Neit Ng
 */
public class MainDebug {
    
    public static void main(String[] args) throws Exception {
        @SuppressWarnings("deprecation")
		int day = new Date().getDay();
        switch(day) {
            case 0: {
                System.out.println("Sunday");
                break;
            }
            case 1:
                System.out.println("Monday");
                break;
            case 2: 
                System.out.println("Tuesday");
                break;
            case 3: 
                System.out.println("Wendnesday");
                break;
            case 4: 
                System.out.println("Thursday");
                break;
            case 5: 
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("I don't know");
                break;
        }
        System.out.println("Print me");
    }
    
    private String getName(String a) {
        return a;
    }
    
}
