package com.wipro.java.oops.polymorphism;

public class Animal {
	void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Subclass (Child class) 1
class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

// Subclass (Child class) 2
class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

