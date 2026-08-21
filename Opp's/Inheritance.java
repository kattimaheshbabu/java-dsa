// Inheritance in Java
// Inheritance is a mechanism in which one class acquires the properties and behaviors of another class

// Parent/Superclass
class Animal {
    String name;
    int age;
    
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    void eat() {
        System.out.println(name + " is eating");
    }
    
    void sleep() {
        System.out.println(name + " is sleeping");
    }
    
    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

// Child/Subclass - inherits from Animal
class Dog extends Animal {
    String breed;
    
    public Dog(String name, int age, String breed) {
        super(name, age);  // Calling parent constructor
        this.breed = breed;
    }
    
    void bark() {
        System.out.println(name + " is barking: Woof! Woof!");
    }
    
    @Override
    void display() {
        super.display();  // Calling parent method
        System.out.println("Breed: " + breed);
    }
}

// Another Child/Subclass - inherits from Animal
class Cat extends Animal {
    String color;
    
    public Cat(String name, int age, String color) {
        super(name, age);
        this.color = color;
    }
    
    void meow() {
        System.out.println(name + " is meowing: Meow! Meow!");
    }
    
    @Override
    void display() {
        super.display();
        System.out.println("Color: " + color);
    }
}

public class Inheritance {
    public static void main(String[] args) {
        // Creating Dog object
        Dog dog = new Dog("Buddy", 5, "Golden Retriever");
        dog.display();
        dog.eat();
        dog.sleep();
        dog.bark();
        
        System.out.println();
        
        // Creating Cat object
        Cat cat = new Cat("Whiskers", 3, "Orange");
        cat.display();
        cat.eat();
        cat.sleep();
        cat.meow();
    }
}
