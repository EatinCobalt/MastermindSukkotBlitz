package com.example.javaworkspace.geometricalcalc;

public class Circle extends Shape {
    private double radius;
    private String name;
    public Circle(String name, double radius) {
        this.radius = radius;
        this.name = name;
    }
    double area() {
        return radius * radius * Math.PI;
    }
    double perimeter() {
        return 2 * Math.PI * radius;
    }
    String getName() {
        return name;
    }
}