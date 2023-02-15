package com.company.phone;

import com.company.subCategory.SubCategory;

public class Phone extends SubCategory {

    private String capacity;
    private int screen;

    public Phone(String name, String version, String brand, String capacity, int screen) {
        super(name, version, brand);
        this.capacity = capacity;
        this.screen = screen;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    public int getScreen() {
        return screen;
    }

    public void setScreen(int screen) {
        this.screen = screen;
    }
}
