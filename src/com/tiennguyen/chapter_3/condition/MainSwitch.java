package com.tiennguyen.chapter_3.condition;

public class MainSwitch {

    public static void main(String[] args) {

        String levelName = "STUDENT";
        switch (levelName) {
            case "STUDENT":
                System.out.println("I am Student");
                break;
            case "TEACHER":
                System.out.println("I am Teacher");
                break;
            default:
                System.out.println("I don't know");
        }
    }
}
