package com.company;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private Date lastUpdated;
    private ArrayList<MenuItem> menuItems;

    public Menu(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
        this.menuItems = new ArrayList<>();
    }

    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public void addMenuItem(MenuItem newItem) {
        for (MenuItem item : this.menuItems){
            if (item.equals(newItem)) {
                System.out.println("This item already exists on the menu!");
                return;
            }
        }
        this.menuItems.add(newItem);
    }

    public void removeMenuItem(MenuItem itemToRemove) {
        for(int i = 0; i < menuItems.size(); i ++) {
            if (menuItems.get(i).equals(itemToRemove)) {
                this.menuItems.remove(i);
                break;
            }
        }
    }

    public void printMenu() {
        for (MenuItem item : menuItems) {
            item.print();
        }
    }
}
