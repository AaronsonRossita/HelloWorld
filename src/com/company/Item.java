package com.company;

public class Item {

    private String name;
    private double price;
    private int quantity;
    private String picture;

    public Item(String name, double price, int quantity, String picture) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.picture = picture;
    }

    @Override
    public String toString() {
        return "Name : " + name + "\nPrice : " + price +
                    "\nQuantity : " + quantity + "\nPicture : " + picture;
    }
}
