package com.company;

public class MenuItem {

    private float price;
    private String description;
    private String category;
    private boolean isNew;


    public MenuItem(float price, String description) {
        this.price = price;
        this.description = description;
        this.isNew = true;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float aPrice) {
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
}
