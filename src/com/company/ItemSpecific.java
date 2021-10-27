package com.company;

public class ItemSpecific extends Item {

    private boolean specific;

    public ItemSpecific(String name, double price, int quantity, String picture, boolean specific) {
        super(name, price, quantity, picture);
        this.specific = specific;
    }

    @Override
    public String toString() {
        return super.toString() + "\nSpecific : " + specific;
    }
}
