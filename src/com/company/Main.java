package com.company;

import com.sun.tools.corba.se.idl.constExpr.Or;
import food.Apple;
import food.Orange;
import food.Fruit;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InterruptedException {

//        System.out.println("Hello World");

        // primitive types
        String a = "String";
        char b = 'b';

        byte c = 127;
        short d = 32767;
        int e = 2147483647;
        Integer e1 = new Integer(45); // class has methods
        e1.toString();
        long f = 454545;
        float g = 0.0f;
        double h = 1.3;

        boolean b1 = true;
        boolean b2 = false;

//        System.out.println(c);
//
        MyClass object = new MyClass(1,"one");
//        MyClass object1 = new MyClass();
//        object1.setName("Rossita");
//        System.out.println(object1.getName());

//        System.out.println(object.id);
//        System.out.println(object1.name);

//        HappyBirthday hb = new HappyBirthday("Rossita");
//        HappyBirthday.wish("Ben El");

//        Calculator calc = new Calculator();
//        int myInt = calc.square(5);
//        System.out.println(myInt);
//
//        int myInt2 = Calculator.stSquare(6);
//        System.out.println(myInt2);

        Item item1 = new Item("Chair",100.0,2,"www");
//        System.out.println(item1);
//        System.out.println(object);
//
//        Calculator.square(4.0);
//        Calculator.square(4);

//        ItemSpecific is = new ItemSpecific("Sofa",20.0,1,"www",true);
//        System.out.println(is);
//
//        Fruit fruit = new Fruit("type","yellow",1);
//        fruit.ripe();
//
//        Apple apple = new Apple("golden","golden",1,"apple");
//        apple.ripe();
//
//        Orange orange = new Orange("orange","orange",1,3);
//        orange.ripe();


        Scanner scanner = new Scanner(System.in);

        System.out.println("please give me a number");
        int x = scanner.nextInt();

//        System.out.println("also give me a double");
//        double s = scanner.nextDouble();
//
//        if (x > 6){
//            System.out.println("bigger");
//        }
//
//        if (x < 6){
//            System.out.println("this one is ok");
//        }
//
//        if (x > 6){
//            System.out.println();
//        }else{
//            System.out.println("else");
//        }
//
//        if (x >= 6){
//            System.out.println(1);
//        }else if (x > 5){
//            System.out.println(2);
//        } else{
//            System.out.println(3);
//        }
//
//        if (x == 6){
//            System.out.println("equals");
//        }
//
//        if (!true){
//            System.out.println("true");
//        }
//
//        if (x != 6){
//            System.out.println("not equals");
//        }
//
//        if (x == 6 & x < 5){
//            System.out.println("both are true");
//        }
//
//        if (x == 7 | x < 5){
//            System.out.println("at least one is true");
//        }

//        while (x > 0){
//            System.out.println(x);
//            x = x - 1;
////            x--;
////            x -= 1;
//        }

//        do{
//            System.out.println(x + " i'm doing");
//            x++;
//        }while(x < 10);

        //index      0  1  2   3  4  5  6
        int[] arr = {10,20,30,40,50,60,70};
        String[] arr1 = {"one","two","three"};
//        for (int i = 0; i <= 8; i++) {
//            System.out.println("i = " + i);
//        }
//
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i] + " at index " + i);
//        }
//
//        for (int number : arr){
//            System.out.println("this is the next number = " + number);
//        }
//
//        for (String s : arr1){
//            System.out.println(s);
//        }


        switch (x){
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            default:
                System.out.println("dunno");
        }





    }
}

