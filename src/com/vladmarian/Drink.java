package com.vladmarian;

public class Drink extends Product {

    protected int stock;
    protected Ingredient ingredient;

    public Drink(){
        ingredient = new Ingredient();
    }

    public Drink(String name, float price, int quantity, int stock, Ingredient ingredient) {
        super(name, price, "drink", quantity);
        this.stock = stock;
    }

    public Drink(String name, float price, String type, int quantity, Ingredient ingredient) {
        super(name, price, type, quantity);
        this.stock = Math.round((float)(ingredient.stock / 2));
    }

    public Drink(String name, float price, String type, int quantity, int stock) {
        super(name, price, type, quantity);
        this.stock = stock;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Ingredient getIngredient() {
        return ingredient;
    }

    public void setIngredient(Ingredient ingredient) {
        this.ingredient = ingredient;
    }
}
