package com.company;

public class IfElse {
    public static void main(String[] args) {
        giveStudentGrade(30);



    }
    public static void giveStudentGrade(int marks)
    {
        if (marks>=0 && marks<=34){
            System.out.println("fail");
        }
        if (marks >=35 && marks<=49){
            System.out.println("pass");
        }
        else if (marks >=50 && marks<=74){

            System.out.println("second class");
        }
        else if (marks >=75 && marks<=100){
            System.out.println("first class");
        }
    }}


