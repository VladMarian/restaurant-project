package com.vladmarian;

import java.util.ArrayList;
import java.util.Iterator;

public class Menu {

    protected String name;
    private ArrayList<Product> products;
    private ArrayList<Menu> menus;

    public Menu(String name) {
        this.name = name;
        products = new ArrayList<Product>();
        menus = new ArrayList<Menu>();
    }

    public Menu(String name, ArrayList<Product> products, ArrayList<Menu> menus) {
        this.name = name;
        this.products = products;
        this.menus = menus;
    }

    public Menu() {
        products = new ArrayList<Product>();
        menus = new ArrayList<Menu>();
    }

    public void addProduct(Product product) {
        this.products.add(product);
    }

    public void showProducts() {
        System.out.println(this.name);
        Iterator var2 = this.products.iterator();

        while (var2.hasNext()) {
            Product product = (Product) var2.next();
            if (product instanceof Food) {
                System.out.println("Item: " + product.getName() + "; ingredients: " + ((Food) product).getIngredients() + "; price: " + product.getTotalPrice());
            } else if (product instanceof Drink) {
                System.out.println("Item: " + product.getName() + "; stock: " + ((Drink) product).stock + "; price: " + product.getTotalPrice());
            } else {
                System.out.println("Item: " + product.getName() + "; price: " + product.getTotalPrice());
            }
        }
    }

    public void addMenu(Menu menu) {
        this.menus.add(menu);
    }

    public void showMenus() {
        Iterator var2 = this.menus.iterator();

        while (var2.hasNext()) {
            Menu menu = (Menu) var2.next();
            menu.showProducts();
        }


    }

    public ArrayList<Product> getProducts() {
        return products;
    }
}