package com.company;

public class MenuItem {

    private float price;
    private String description;
    private boolean isNew;

    public MenuItem(float price, String description) {
        this.price = price;
        this.description = description;
        this.isNew = true;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }
}
