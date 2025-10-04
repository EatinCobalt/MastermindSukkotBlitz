package com.example.javaworkspace.geometricalcalc;

public class Rectangle extends Shape{
    private double length;
    private double width;
    private String name;
    public Rectangle(String name, double length, double width) {
        this.length = length;
        this.width = width;
        this.name = name;
    }
    double area() {
        return length * width;
    }
    double perimeter() {
        return (width + length) * 2;
    }
    String getName() {
        return name;
    }
}