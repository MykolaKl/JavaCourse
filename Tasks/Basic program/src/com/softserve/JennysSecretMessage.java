package com.softserve;

public class JennysSecretMessage {
    public static void main(String[] args) {
        System.out.println(greet("Johnny"));
        System.out.println(greet("Jenny"));
    }

    public static String greet(String name) {
        if (name.equals("Johnny")) {
            return "Hello, my love";
        }
        return String.format("Hello, %s!", name);
    }
}