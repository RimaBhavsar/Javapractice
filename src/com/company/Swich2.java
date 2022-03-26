package com.company;

public class Swich2 {
    public static void main(String[] args) {
        suscriptionOfOTT("Disney");
    }
    public static void suscriptionOfOTT(String nameOfOTT) {
        switch (nameOfOTT){
            case "Netflix":
                System.out.println("£120 annual");
                break;
            case "Amazon Prime":
                System.out.println("£70 annual");
                break;
            case "Apple TV":
                System.out.println("£60 annual");
                break;
            case "Disney":
                System.out.println("£85 annual");
                break;
            case "Hotstar":
                System.out.println("£50 annual");
                break;


        }
    }
}
