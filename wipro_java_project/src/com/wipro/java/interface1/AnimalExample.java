package com.wipro.java.interface1;

// Define the Animal interface
interface Animal {
    void eat();       // Method for eating
    void makeSound(); // Method for making sound
}

// Dog class implements the Animal interface
class Dog implements Animal {
    @Override
    public void eat() {
        System.out.println("Dog is eating.");
    }

    @Override
    public void makeSound() {
        System.out.println("Dog says: Woof Woof!");
    }
}

// Cat class implements the Animal interface
class Cat implements Animal {
    @Override
    public void eat() {
        System.out.println("Cat is eating.");
    }

    @Override
    public void makeSound() {
        System.out.println("Cat says: Meow Meow!");
    }
}

class AnimalExample {
    public static void main(String[] args) {
        // Create objects of Dog and Cat
        Animal dog = new Dog();
        Animal cat = new Cat();
        
        // Call the methods of Dog and Cat
        System.out.println("Dog:");
        dog.eat();       // Calls Dog's eat method
        dog.makeSound(); // Calls Dog's makeSound method
        
        System.out.println("\nCat:");
        cat.eat();       // Calls Cat's eat method
        cat.makeSound(); // Calls Cat's makeSound method
    }
}
