package com.example.javaworkspace.zoo;

public class Cat extends Animal {
    public Cat(String name, String sound, String food) {
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