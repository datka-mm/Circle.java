package com.company;  /*Circle деген класс тузунуз, анын PI деген свойствасы, area
        жана circumference деген статик методдору болсун.
        areaны табуу учун: PI * (radius * radius)
        circumferenceти табуу учун PI * 2 * radius деген формулалар колдонулат*/

public class Circle {
    private static final double PI = Math.PI;

    public Circle() {

    }

    static void area(int radius) {
        System.out.println(PI * (radius * radius));
    }

    static void circumference(int radius) {
        System.out.println(PI * 2 * radius);
    }
}


