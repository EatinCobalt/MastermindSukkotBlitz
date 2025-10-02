package com.example.javaworkspace.zoo;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Rex", "woof", "meat");
        Cat cat = new Cat("Bob", "meow", "fish");
        Bird bird = new Bird("Pierre", "chirp", "seeds");
        Animal[] animals = {dog, cat, bird};
        for (int i = 0; i < 3; i++) {
            Animal currentAnimal = animals[i];
            currentAnimal.speak();
            currentAnimal.eat();
        }
    }
}