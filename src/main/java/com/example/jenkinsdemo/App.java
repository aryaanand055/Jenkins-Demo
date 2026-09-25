package com.example.jenkinsdemo;

public class App {

    public static void main(String[] args) {
        System.out.println(greet("Jenkins"));
    }

    public static String greet(String name) {
        if (name == null || name.isBlank()) {
            return "Hello, Jenkins... This is Arya here...";
        }
        return "Hello, " + name.trim();
    }
}
