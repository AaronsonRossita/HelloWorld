package com.company;

public class Calculator {


    // available only with an objects of the class
    public static int square (int x){
//        int temp = x * x;
//        return temp;
        return x * x;
    }

    public static int square (double x){
//        int temp = x * x;
//        return temp;
        return (int)x * (int)x;
    }



    // static, available without an object
    public static int stSquare(int x){
        return x * x;
    }

}
