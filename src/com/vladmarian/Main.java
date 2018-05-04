package com.vladmarian;

import java.util.Scanner;

public class Main {

    static Scanner in = new Scanner(System.in);


    public static void main(String[] args) {

        Menu pizzaMenu = new Menu("Pizza Menu");

        Food pizzaCapriciosa = new Food("Pizza Capriciosa", 27, "food", 500, "rosii, mozzarella, ciuperci, sunca presata, ardei gras", "pizza");
        Food pizzaMargherita = new Food("Pizza Margherita", 22, "food", 400, "rosii, mozzarella", "pizza");
        Food pizzaCalzone = new Food("Pizza Calzone", 27, "food", 500, "rosii, mozzarella, ciuperci, sunca presata", "pizza");
        Food pizzaAlTonno = new Food("Pizza Al Tonno", 32, "food", 600, "rosii, mozzarella, masline verzi, ton, ceapa rosie, capere, lamaie", "food");
        Food pizzaPescatore = new Food("Pizza Pescatore", 32, "food", 500, "rosii, mozzarella, fructe de mare, usturoi", "pizza");

        pizzaMenu.addProduct(pizzaCapriciosa);
        pizzaMenu.addProduct(pizzaMargherita);
        pizzaMenu.addProduct(pizzaCalzone);
        pizzaMenu.addProduct(pizzaAlTonno);
        pizzaMenu.addProduct(pizzaPescatore);

        Menu pastaMenu = new Menu("Pasta Menu");

        Food spaghettiCarbonara = new Food("Spaghetti Carbonara", 27, "food", 350, "paste cu bacon, usturoi si sos carbonara", "pasta");
        Food lasagna = new Food("Lasagna All Forno", 29, "food", 350, "paste la cuptor cu sos bolognes, mozzarella si sos tomat", "pasta");
        Food penneConPollo = new Food("Penne con Pollo e Basilico", 29, "food", 300, "paste cu piept de pui, usturoi, rosii uscate, busuioc si rosii cherry in sos de vin alb si parmesan", "pasta");
        Food tortelliniAllForno = new Food("Tortellini All Forno", 34, "food", 350, "tortellini, piept pui, smantana, usturoi, vin alb, parmesan, mozzarella, ou", "pasta");
        Food fettuciniSomon = new Food("Fettucini cu Somon Fumee", 36, "food", 350, "fettucini, somon fume, rosii cherry, usturoi, smantana, marar", "pasta");

        pastaMenu.addProduct(spaghettiCarbonara);
        pastaMenu.addProduct(lasagna);
        pastaMenu.addProduct(penneConPollo);
        pastaMenu.addProduct(tortelliniAllForno);
        pastaMenu.addProduct(fettuciniSomon);

        Menu meatMenu = new Menu("Meat Menu");

        Food muschiDeVitaGratinat = new Food("Muschi de vita gratinat cu ciuperci si parmesan", 70, "food", 200, "muschi de vita tras la tigaie si gratinat cu ciuperci si parmesan servit cu sos de vin", "meat");
        Food pieptDeRata = new Food("Piept de rata in sos de fructe de padure", 38, "food", 180, "piept de rata, cartofi gratinati, morcovi, sparanghel, unt, ierburi aromatice", "meat");
        Food somonHaway = new Food("Somon Haway", 45, "food", 190, "somon si creveti rumeniti in ulei de masline si chilli serviti pe pat de ananas picant cu garnitura de sparanghel si sos de lamaie", "meat");
        Food muschiDeVitaAlsacian = new Food("Muschi de vita alsacian", 60, "food", 100, "muschi de vita, ciuperci, ceapa rosie, piper verde, rosii uscate, unt, coniac", "meat");
        Food doradaAllaIsolana = new Food("Dorada alla Isolana", 48, "food", 150, "pestele este dezosat si pregatit la cuptor,servit cu vinete, dovlecei, morcovi, ciuperci, masline, rosii cherry si cartofi", "meat");

        meatMenu.addProduct(muschiDeVitaGratinat);
        meatMenu.addProduct(pieptDeRata);
        meatMenu.addProduct(somonHaway);
        meatMenu.addProduct(muschiDeVitaAlsacian);
        meatMenu.addProduct(doradaAllaIsolana);

        Menu sideDishMenu = new Menu("Side Dish Menu");

        Food cartofiPrajiti = new Food("Cartofi prajiti", 8, "food", 150, "-", "sideDish");
        Food cartofCopt = new Food("Cartofi copt cu branza si marar", 14, "food", 250, "-", "sideDish");
        Food ciuperciLaGratar = new Food("Ciuperci la gratar", 11, "food", 100, "-", "sideDish");
        Food legumeLaGratar = new Food("Legume la gratar", 14, "food", 250, "-", "sideDish");
        Food risotto = new Food("Risotto cu busuoic si parmesan", 15, "food", 180, "-", "sideDish");

        sideDishMenu.addProduct(cartofiPrajiti);
        sideDishMenu.addProduct(cartofCopt);
        sideDishMenu.addProduct(ciuperciLaGratar);
        sideDishMenu.addProduct(legumeLaGratar);
        sideDishMenu.addProduct(risotto);

        Menu dressingMenu = new Menu("Dressings Menu");

        Food sosRosii = new Food("Sos de rosii cu busuioc", 5, "food", 50, "-", "dressing");
        Food tzatziki = new Food("Sos tzatziki", 4, "food", 50, "-", "dressing");
        Food sosAfine = new Food("Sos de afine", 8, "food", 70, "-", "dressing");
        Food mayo = new Food("Maioneza", 4, "food", 50, "-", "dressing");

        dressingMenu.addProduct(sosRosii);
        dressingMenu.addProduct(tzatziki);
        dressingMenu.addProduct(sosAfine);
        dressingMenu.addProduct(mayo);

        Menu dessertsMenu = new Menu("Desserts Menu");

        Food nugaGlacee = new Food("Nuga Glacee", 18, "food", 200, "inghetata de vanilie cu zahar caramelizat si nuci", "dessert");
        Food oreoCake = new Food("Tort Oreo", 18, "food", 200, "biscuit oreo, crema de branza, esenta de vanilie, cacao, frisca, ciocolata", "dessert");
        Food profiterol = new Food("Profiterol", 18, "food", 150, "Inghetata trasa prin miez de nuca servita cu gogosi cremoase si glazura de ciocolata", "dessert");
        Food merenghe = new Food("Merenghe", 17, "food", 200, "bezele, fructe de padure, pepene galben, portocala kiwi, ananas, menta", "dessert");
        Food lavaCake = new Food("Lava Cake", 20, "food", 180, "inghetata de vanilie cu nuci caramelizate, cacao, ciocolata fondanta", "dessert");

        dessertsMenu.addProduct(nugaGlacee);
        dessertsMenu.addProduct(oreoCake);
        dessertsMenu.addProduct(profiterol);
        dessertsMenu.addProduct(merenghe);
        dessertsMenu.addProduct(lavaCake);

        Ingredient lemon = new Ingredient("lemons", 10);
        Ingredient orange = new Ingredient("oranges", 20);
        Ingredient blueberrie = new Ingredient("blueberries", 6);
        Ingredient kiwi = new Ingredient("kiwi", 4);


        Menu drinksMenu = new Menu("Drinks Menu");

        Drink lemonade = new Drink("Basic lemonade", 12, "naturalDrink", 250, lemon);
        Drink orangeLemonade = new Drink("Orange Lemonade", 15, "naturalDrink", 250, orange);
        Drink blueberrieLemonade = new Drink("Blueberries Lemonade", 18, "naturalDrink", 250, blueberrie);
        Drink kiwiLemonade = new Drink("Kiwi Lemonade", 17, "naturalDrink", 250, kiwi);
        Drink water = new Drink("Apa plata Borsec", 5, "naturalDrink", 250, 20);

        Drink mineralWater = new Drink("Apa minerala Borsec", 5, "carbogazified", 250, 20);
        Drink pepsi = new Drink("Pepsi", 6, "carbogazified", 220, 10);
        Drink fanta = new Drink("Fanta de portocale", 6, "carbogazified", 220, 10);
        Drink sprite = new Drink("Sprite", 6, "carbogazified", 220, 10);
        Drink mountainDew = new Drink("Mountain Dew", 6, "carbogazified", 220, 10);

        drinksMenu.addProduct(lemonade);
        drinksMenu.addProduct(orangeLemonade);
        drinksMenu.addProduct(blueberrieLemonade);
        drinksMenu.addProduct(kiwiLemonade);
        drinksMenu.addProduct(water);
        drinksMenu.addProduct(mineralWater);
        drinksMenu.addProduct(pepsi);
        drinksMenu.addProduct(fanta);
        drinksMenu.addProduct(sprite);
        drinksMenu.addProduct(mountainDew);

        Cart myCart = new Cart();
        boolean flag = true;
        while (flag) {

            int command = in.nextInt();


            switch (command) {
                case 1:
                    pizzaMenu.showProducts();
                    System.out.println("==============================================");
                    pastaMenu.showProducts();
                    System.out.println("==============================================");
                    sideDishMenu.showProducts();
                    System.out.println("==============================================");
                    dressingMenu.showProducts();
                    System.out.println("==============================================");
                    dessertsMenu.showProducts();
                    System.out.println("==============================================");
                    drinksMenu.showProducts();
                    System.out.println("==============================================");
                    break;

                case 2:
                    System.out.println("From which menu, is your desired dish?");
                    in = new Scanner(System.in);
                    String name = in.nextLine();

                    if (name.equals("Pizza")) {
                        pizzaMenu.showProducts();

                        System.out.println("Which pizza would you like?");
                        in = new Scanner(System.in);
                        name = in.nextLine();
                        for (int i = 0; i < pizzaMenu.getProducts().size(); i++) {
                            if (pizzaMenu.getProducts().get(i).getName().equals(name)) {
                                myCart.addProduct(pizzaMenu.getProducts().get(i));
                                System.out.println("Your pizza has been added.");
                                break;
                            } else if (i == pizzaMenu.getProducts().size() - 1) {
                                System.out.println("Could not find product");
                            }
                        }
                    } else if (name.equals("Pasta")) {
                        pastaMenu.showProducts();
                        System.out.println("Which pasta would you like?");
                        in = new Scanner(System.in);
                        name = in.nextLine();
                        for (int i = 0; i < pastaMenu.getProducts().size(); i++) {
                            if (pastaMenu.getProducts().get(i).getName().equals(name)) {
                                myCart.addProduct(pastaMenu.getProducts().get(i));
                                System.out.println("Your pasta has been added.");
                                break;
                            } else if (i == pastaMenu.getProducts().size() - 1) {
                                System.out.println("Could not find product");
                            }
                        }

                    } else if (name.equals("Meat")) {
                        meatMenu.showProducts();
                        System.out.println("Which meat based product would you like?");
                        in = new Scanner(System.in);
                        name = in.nextLine();
                        for (int i = 0; i < meatMenu.getProducts().size(); i++) {
                            if (meatMenu.getProducts().get(i).getName().equals(name)) {
                                myCart.addProduct(meatMenu.getProducts().get(i));
                                System.out.println("Your meat has been added.");
                                break;
                            } else if (i == meatMenu.getProducts().size() - 1) {
                                System.out.println("Could not find product");
                            }
                        }
                        sideDishMenu.showProducts();
                        System.out.println("Which side dish would you like with your meat?");
                        in = new Scanner(System.in);
                        name = in.nextLine();
                        for (int i = 0; i < sideDishMenu.getProducts().size(); i++) {
                            if (sideDishMenu.getProducts().get(i).getName().equals(name)) {
                                myCart.addProduct(sideDishMenu.getProducts().get(i));
                                System.out.println("Your side dish has been added.");
                                break;
                            }
                        }
                    } else if (name.equals("Side dish")) {
                        sideDishMenu.showProducts();
                        System.out.println("Which side dish would you like?");
                        in = new Scanner(System.in);
                        name = in.nextLine();
                        for (int i = 0; i < sideDishMenu.getProducts().size(); i++) {
                            if (sideDishMenu.getProducts().get(i).getName().equals(name)) {
                                myCart.addProduct(sideDishMenu.getProducts().get(i));
                                System.out.println("Your side dish has been added.");
                                break;
                            } else if (i == sideDishMenu.getProducts().size() - 1) {
                                System.out.println("Could not find product");
                            }
                        }
                    } else if (name.equals("Dressing")) {
                        dressingMenu.showProducts();
                        System.out.println("Which dressing would you like?");
                        in = new Scanner(System.in);
                        name = in.nextLine();
                        for (int i = 0; i < dressingMenu.getProducts().size(); i++) {
                            if (dressingMenu.getProducts().get(i).getName().equals(name)) {
                                myCart.addProduct(dressingMenu.getProducts().get(i));
                                System.out.println("Your dressing has been added");
                                break;
                            } else if (i == dressingMenu.getProducts().size() - 1) {
                                System.out.println("Could not find product");
                            }
                        }
                    } else if (name.equals("Dessert")) {
                        dessertsMenu.showProducts();
                        System.out.println("Which dessert would you like?");
                        in = new Scanner(System.in);
                        name = in.nextLine();
                        for (int i = 0; i < dessertsMenu.getProducts().size(); i++) {
                            if (dessertsMenu.getProducts().get(i).getName().equals(name)) {
                                myCart.addProduct(dessertsMenu.getProducts().get(i));
                                System.out.println("Your dessert has been added");
                                break;
                            } else if (i == dessertsMenu.getProducts().size() - 1) {
                                System.out.println("Could not find product");
                            }
                        }
                    } else if (name.equals("Drinks")) {
                        drinksMenu.showProducts();
                        System.out.println("What drink would you like?");
                        in = new Scanner(System.in);
                        name = in.nextLine();
                        for (int i = 0; i < drinksMenu.getProducts().size(); i++) {
                            if (drinksMenu.getProducts().get(i).getName().equals(name)) {
                                if (drinksMenu.getProducts().get(i) instanceof Drink) {
                                    if (((Drink) drinksMenu.getProducts().get(i)).getStock() > 0) {
                                        myCart.addProduct(drinksMenu.getProducts().get(i));
                                        ((Drink) drinksMenu.getProducts().get(i)).setStock(((Drink) drinksMenu.getProducts().get(i)).getStock() - 1);
                                        System.out.println("Your drink has been added.");
                                        break;
                                    } else if (((Drink) drinksMenu.getProducts().get(i)).getStock() <= 0) {
                                        System.out.println("Insufficient stock. Order not processable");
                                    } else if (i == drinksMenu.getProducts().size() - 1) {
                                        System.out.println("Could not find product");
                                    }
                                }
                            }
                        }
                    } else {
                        System.out.println("Could not find menu");
                    }
                    break;

                case 3:
                    in = new Scanner(System.in);

                    myCart.showCartProducts();
                    System.out.println("Which product would you like removed from your order?");
                    in = new Scanner(System.in);
                    name = in.nextLine();
                    for (int i = 0; i < myCart.getProducts().size(); i++) {
                        if (myCart.getProducts().get(i).getName().equals(name)) {
                            for (int j = 0; j < drinksMenu.getProducts().size(); j++) {
                                if (drinksMenu.getProducts().get(j).getName().equals(myCart.getProducts().get(i).getName())) {
                                    ((Drink) drinksMenu.getProducts().get(j)).setStock(((Drink) drinksMenu.getProducts().get(j)).getStock() + 1);
                                }
                            }

                            myCart.removeProduct(myCart.getProducts().get(i));
                            System.out.println("Your product has been removed from the order.");
                        } else if (i == myCart.getProducts().size() - 1) {
                            System.out.println("Could not find product");
                        }
                    }

                    break;


                case 4:
                    float totalPrice = 0;
                    for (int i = 0; i < myCart.getProducts().size(); i++) {
                        totalPrice = totalPrice + myCart.getProducts().get(i).getTotalPrice();
                    }
                    System.out.println("Your current order is: ");
                    myCart.showCartProducts();
                    System.out.println("Your total to pay is: " + totalPrice + " RON.");
                    break;

                case 5:
                    flag = false;
                    System.out.println("Ending program..");
                    break;

            }
            in = new Scanner(System.in);
        }
    }
}
