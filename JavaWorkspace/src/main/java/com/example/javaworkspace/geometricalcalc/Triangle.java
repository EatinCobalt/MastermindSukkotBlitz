package com.example.javaworkspace.geometricalcalc;

public class Triangle extends Shape {
    private double base;
    private double height;
    private String name;
    public Triangle(String name, double base, double height) {
        this.base = base;
        this.height = height;
        this.name = name;
    }
    double area() {
        return base * height * 0.5;
    }
    String getName() {
        return name;
    }
}