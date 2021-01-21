package com.company;

import java.util.Date;

public class Menu {
    private Date lastUpdated;

    public Menu(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public MenuItem[] getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(MenuItem[] menuItems) {
        this.menuItems = menuItems;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
}
