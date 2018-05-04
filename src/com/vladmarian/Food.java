package com.vladmarian;

public class Food extends Product{

    protected String ingredients;
    protected String cookedType;
    protected String foodType;


    public Food(String name, float price, String type, int quantity, String ingredients, String foodType) {
        super(name, price, type, quantity);
        this.ingredients = ingredients;
        this.foodType = foodType;
    }



    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public String getCookedType() {
        return cookedType;
    }

    public void setCookedType(String cookedType) {
        this.cookedType = cookedType;
    }

    public String getFoodType() {
        return foodType;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }
}
