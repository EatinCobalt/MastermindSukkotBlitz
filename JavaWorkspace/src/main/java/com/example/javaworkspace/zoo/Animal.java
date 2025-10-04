package com.example.javaworkspace.zoo;

public class Animal {
    String name;
    String sound;
    String food;
    String getName() {
        return null;
    }
    String sound() {
        return null;
    }
    String food() {
        return null;
    }
    void speak() {
        System.out.println(getName() + " - " + sound());
    }
    void eat() {
        System.out.println(getName() + " eats " + food());
    }
}
