package com.company;

public class Typecasting {
    public static void main(String[] args) {
        int myInt = 5;
        System.out.println(myInt);
        double myDouble = myInt;
        System.out.println(myDouble);

        double myDouble1 = 5.500;
        System.out.println(myDouble1);

        int myInt1 = (int) myDouble1;

        System.out.println(myInt1);
    }
}
