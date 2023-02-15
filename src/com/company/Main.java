package com.company;

import jdk.security.jarsigner.JarSigner;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        JustClass justClass = new JustClass();
        justClass.name = "Sanzhar";
        System.out.println(justClass.secondMethod());

    }
}
