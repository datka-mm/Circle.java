package com.company.subCategory;

public class SubCategory {

    private String name;
    private String version;
    private String brand;


    public SubCategory(String name, String version, String brand) {
        this.name = name;
        this.version = version;
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
