package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.print("Area of circle is: ");
        Circle.area(a);
        System.out.print("\nCircumference of circle is: ");
        Circle.circumference(a);

    }
}
