package com.example.javaworkspace.zoo;

public class Dog extends Animal {
    public Dog(String name, String sound, String food) {
        this.name = name;
        this.sound = sound;
        this.food = food;
    }
    String getName() {
        return name;
    }
    String sound() {
        return sound;
    }
    String food() {
        return food;
    }
}