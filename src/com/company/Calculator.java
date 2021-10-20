package com.company;

public class Calculator {


    // available only with an objects of the class
    public int square (int x){
        return x * x;
    }

    // static, available without an object
    public static int stSquare(int x){
        return x * x;
    }

}
