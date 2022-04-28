package com.company;

public class Switch3 {
    public static void main(String[] args) {
        kidsShoeSizing("Youth 8-1");
    }

    public static void kidsShoeSizing(String ageGroup) {
        switch (ageGroup) {
            case "Baby 0-12months":
                System.out.println("uk 0-3");
                break;
            case "Infant 12-18months":
                System.out.println("uk 3-5");
                break;
            case "Toddler 1-3years":
                System.out.println("uk 6-9");
                break;
            case "Kids 4-7years":
                System.out.println("uk 10=13");
                break;
            case "Youth 8-13years":
                System.out.println("uk 1-5");
                break;
            default:
                System.out.println("invalid function");


        }
    }
}
