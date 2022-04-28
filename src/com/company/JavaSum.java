package com.company;

public class JavaSum {
    public static void main(String[] args) {
        {
            int a;
            int b;
            add(a = 200, b = 200);// calling method add
        }
    }

    public static void add(int a, int b) {
        int c = a + b;
        System.out.println(c);// will print outcome for value c
    }
}