package com.company;

public class HappyBirthday {

    // access modifiers
    int myInt1; // protected by default
    public int myInt2; // available everywhere
    protected int myInt3; // only inside the package
    private int myInt4; // only inside the class

    // constant
    final static double phi = 3.14;

    public static void wish (String name){
        System.out.println("Happy Birthday to " + name);
    }

}
