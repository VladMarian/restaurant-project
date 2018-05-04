package com.vladmarian;

public class Ingredient {

    protected String name;
    protected int stock;

    public Ingredient(){

    }

    public Ingredient(String name, int stock) {
        this.name = name;
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(String stockAvailability) {
        this.stock = stock;
    }
}
