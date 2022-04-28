package com.company;

import java.util.Random;

public class RandomEmail {
    public static void main(String[] args) {
        Random random = new Random();
        int result = random.nextInt();
        String email = "john"+result+"@gmail.com";
        String password= "Lengends123"+result;

        createUsers(email,password);
    }


    public static void createUsers(String email, String password1) {
        System.out.println(email+" "+password1);
    }

}



