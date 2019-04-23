package com.tiennguyen.chapter_3.break_continue;

import java.util.Date;

public class MainBreakContinue {

    public static void main(String[] args) {
        MainBreakContinue main = new MainBreakContinue();
        main.breakInSwitchCase();
        main.breakInWhile();
        main.continueInFor();
    }

    /**
     * break command line is used in switch ... case ...
     * Case 1: Show `This is a car`
     * Case 2: Show `This is bicycle`
     * Default: Show `I don't known`
     */
    public void breakInSwitchCase() {
        int carCode = 1;
        switch (carCode) {
            case 1:
                System.out.println("This is a car.");
                break;
            case 2:
                System.out.println("This is a bicycle.");
                break;
            default:
                System.out.println("I don't known");
        }
    }

    /**
     * print number day <= 15. If day > 15 system will `break` it.
     */
    public void breakInWhile() {
        int day = 1;
        while (day <= 29) {
            day++;

            if (day > 15) {
                break;
            }

            System.out.println(String.format("Today is %s", day));
        }
    }

    /**
     * continue in for command line.
     * loop from 0 to 9. if it is even number, print it in console.
     */
    public void continueInFor() {
        int numberOfLoop = 10;
        for (int i = 0; i < numberOfLoop; i++) {
            if (i % 2 != 0) {
                continue;
            }
            System.out.println("This is even number : " + i);
        }
    }
}
