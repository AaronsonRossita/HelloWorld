package com.company;

public class MyClass {

    private int id;
    private String name;

    public MyClass(int id, String name){
        this.id = id;
        this.name = name;
    }

    public MyClass(int id) {
        this.id = id;
    }

    public MyClass(String name) {
        this.name = name;
    }

    public MyClass() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        String s = "Id - " + id + "; Name - " + name;
        return s;
    }
}
