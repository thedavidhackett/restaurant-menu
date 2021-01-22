package com.company;

import java.util.Date;

public class Restaurant {

    public static void main(String[] args) {
	// write your code here
        MenuItem menuItem1 = new MenuItem(9.99, "Burrito", "food" );
        MenuItem menuItem2 = new MenuItem( 7.99, "Tacos", "food");
        MenuItem menuItem3 = new MenuItem(7.99,"Margarita", "drink");
        Menu menu = new Menu(new Date());
        menu.addMenuItem(menuItem1);
        menu.addMenuItem(menuItem2);
        menu.addMenuItem(menuItem3);

        System.out.println("Print out menu with all items");
        menu.printMenu();
        System.out.println("\nPrint one item");
        menuItem2.print();
        menu.removeMenuItem(menuItem2);
        System.out.println("\nPrint new menu");
        menu.printMenu();

        MenuItem menuItemDuplicate = new MenuItem(8.99, "Burrito", "food");
        System.out.println("\nAdd Duplicate Item");
        menu.addMenuItem(menuItemDuplicate);
        System.out.println("\nPrint Menu again");
        menu.printMenu();

    }
}
