package com.vladmarian;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Cart {

    protected float totalPrice;
    protected ArrayList<Product> products;

    public Cart() {
    products = new ArrayList<Product>();
    }

    public void addProduct(Product product) {
        this.products.add(product);
        if (product instanceof Food && ((Food)product).foodType.toString() == "meat") {
            Scanner in = new Scanner(System.in);
            System.out.println("How do you want " + product.name + " to be cooked?");
            ((Food)product).setCookedType(in.nextLine());
        }

        if (product instanceof Drink) {
            Ingredient var3 = ((Drink)product).getIngredient();
        }
    }

    public void removeProduct(Product product) {
        this.products.remove(product);
    }

    public void showCartProducts() {
        for(int i = 0; i < products.size();i++ ) {
            System.out.println(getProducts().get(i).getName());
        }
    }



    public ArrayList<Product> getProducts() {
        return products;
    }
}
