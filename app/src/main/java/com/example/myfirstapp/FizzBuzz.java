package com.example.myfirstapp;

public class FizzBuzz {
    public static String calc(int i) {
        if (i % 3 == 0 && i % 5 == 0){
            return "FizzBuzz";
        }
        else if(i % 3 == 0) {
            return "Fizz";
        }
        else if (i % 5 == 0) {
            return "Buzz";
        }
        else if (i == 1){
            return "1";
        }
        return null;
    }

}
