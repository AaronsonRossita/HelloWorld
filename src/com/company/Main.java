package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello World");

        // primitive types
        String a = "String";
        char b = 'b';

        byte c = 127;
        short d = 32767;
        int e = 2147483647;
        Integer e1 = new Integer(45);
        long f = 454545;
        float g = 0.0f;
        double h = 1.3;

        boolean i = true;

        System.out.println(c);

        MyClass object = new MyClass(1,"one");
        MyClass object1 = new MyClass();
        object1.setName("Rossita");
        System.out.println(object1.getName());

//        System.out.println(object.id);
//        System.out.println(object1.name);

//        HappyBirthday hb = new HappyBirthday("Rossita");
//        HappyBirthday.wish("Ben El");

        Calculator calc = new Calculator();
        int myInt = calc.square(5);
        System.out.println(myInt);

        int myInt2 = Calculator.stSquare(6);
        System.out.println(myInt2);

    }
}

