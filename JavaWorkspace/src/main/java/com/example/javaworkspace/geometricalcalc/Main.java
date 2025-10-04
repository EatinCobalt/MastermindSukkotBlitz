package com.example.javaworkspace.geometricalcalc;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle("circle", 5);
        Rectangle rectangle = new Rectangle("JKMN", 2, 4);
        Triangle triangle = new Triangle("ABC", 6, 7);
        Shape[] shapes = {circle, rectangle, triangle};
        for (Shape currentShape : shapes) {
            System.out.println(currentShape.getName() + " area  = " + currentShape.area() + " square units");
            if (currentShape == triangle) {
                System.out.println("couldnt calculate " + currentShape.getName() + " perimeter");
            }
            else {
                System.out.println(currentShape.getName() + " perimeter = " + currentShape.perimeter() + " units");
            }
        }
    }
}
