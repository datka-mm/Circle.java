package com.company.smartWatch;

import com.company.subCategory.SubCategory;

public class SmartWatch extends SubCategory {

    private String guarantee;
    private int chargeSupportTime;

    public SmartWatch(String name, String version, String brand, String guarantee, int chargeSupportTime) {
        super(name, version, brand);
        this.guarantee = guarantee;
        this.chargeSupportTime = chargeSupportTime;
    }

    public String getGuarantee() {
        return guarantee;
    }

    public void setGuarantee(String guarantee) {
        this.guarantee = guarantee;
    }

    public int getChargeSupportTime() {
        return chargeSupportTime;
    }

    public void setChargeSupportTime(int chargeSupportTime) {
        this.chargeSupportTime = chargeSupportTime;
    }
}
