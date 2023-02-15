package com.company.computer;

import com.company.subCategory.SubCategory;

public class Computer extends SubCategory {

    private int price;
    private String ssd;

    public Computer(String name, String version, String brand, int price, String ssd) {
        super(name, version, brand);
        this.price = price;
        this.ssd = ssd;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getSsd() {
        return ssd;
    }

    public void setSsd(String ssd) {
        this.ssd = ssd;
    }
}
