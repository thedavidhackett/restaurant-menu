package com.company;

public class MenuItem {

    private double price;
    private String description;
    private String category;
    private boolean isNew;


    public MenuItem(double price, String description, String category) {
        this.price = price;
        this.description = description;
        this.category = category;
        this.isNew = true;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double aPrice) {
        this.price = aPrice;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    public void printIsNew(){
        if (this.isNew()){
            System.out.println("This item is new!");
        } else {
            System.out.println("This item is not new.");
        }

    }

    public void print() {
        System.out.println(this.getDescription() + ": " + this.getPrice());
    }

    public boolean equals(MenuItem itemToCompare) {
        if (itemToCompare == this) {
            return true;
        }

        if (itemToCompare == null) {
            return false;
        }

        if (itemToCompare.getClass() != this.getClass()) {
            return false;
        }

        MenuItem menuItemToCompare = (MenuItem) itemToCompare;

        return this.getDescription() == menuItemToCompare.getDescription();
    }
}
