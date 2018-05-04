package com.vladmarian;

public class Product {

    protected String name;
    protected float price;
    protected String type; // food, drink, side dish
    protected int quantity;

    public Product(){

    }

    public Product(String name, float price, String type, int quantity) {
        this.name = name;
        this.price = price;
        this.type = type;
        this.quantity = quantity;
    }

    public float getTotalPrice() {
        float total = this.price + this.price * ((float)this.getVat() / 100.0F);
        return total;
    }

    public int getVat() {
        String category = this.type;
        int vat = 0;
        switch (category.hashCode()) {
            case 1:
                if (category.equals("food")) {
                    vat = 9;
                }
                break;
            case 2:
                if (category.equals("sodas")) {
                    vat = 12;
                }
                break;
            case 3:
                if (category.equals("naturalDrink")) {
                    vat = 5;
                }
                break;
            case 4:
                if (category.equals("deserts")) {
                    vat = 10;
                }
        }

        return vat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
