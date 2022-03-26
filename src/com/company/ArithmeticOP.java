package com.company;

public class ArithmeticOP {

    public static void main(String[] args) {
        int a=30, b=5, c=2;
        int sum = a + b + c;
        int difference = a - b - c;
        int multiplication = a * b * c;
        int division = (a / b) / c;
        int x = 10;
        int y = 20;
        System.out.println("The sum " + sum);
        System.out.println("difference" + difference);
        System.out.println("multiplication" + multiplication);
        System.out.println("division" + division);
        System.out.println(x++); //increment
        System.out.println(x++);
        System.out.println(++x);
        System.out.println(y--);//decrement
        System.out.println(--y);
        System.out.println(--y);

    }
}
