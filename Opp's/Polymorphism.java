// Polymorphism in Java
// Polymorphism means "many forms" - ability to perform a task in multiple ways

import java.util.ArrayList;
import java.util.List;

// Base class
abstract class Vehicle {
    abstract void start();
    abstract void stop();
    abstract void drive();
}

// Car class
class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car engine started with ignition key");
    }
    
    @Override
    void stop() {
        System.out.println("Car stopped by pressing brake pedal");
    }
    
    @Override
    void drive() {
        System.out.println("Car is driving on the road");
    }
}

// Bike class
class Bike extends Vehicle {
    @Override
    void start() {
        System.out.println("Bike engine started by kick start");
    }
    
    @Override
    void stop() {
        System.out.println("Bike stopped");
    }
    
    @Override
    void drive() {
        System.out.println("Bike is riding on the road");
    }
}

// Truck class
class Truck extends Vehicle {
    @Override
    void start() {
        System.out.println("Truck engine started");
    }
    
    @Override
    void stop() {
        System.out.println("Truck stopped");
    }
    
    @Override
    void drive() {
        System.out.println("Truck is carrying heavy loads");
    }
}

// Example of Method Overloading
class Calculator {
    // Method 1: Add two integers
    public int add(int a, int b) {
        return a + b;
    }
    
    // Method 2: Add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }
    
    // Method 3: Add two doubles
    public double add(double a, double b) {
        return a + b;
    }
    
    // Method 4: Add strings (concatenate)
    public String add(String a, String b) {
        return a + b;
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        System.out.println("=== Runtime Polymorphism (Method Overriding) ===");
        
        // Creating list of vehicles
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Car());
        vehicles.add(new Bike());
        vehicles.add(new Truck());
        
        // Same method call but different behavior
        for (Vehicle vehicle : vehicles) {
            vehicle.start();
            vehicle.drive();
            vehicle.stop();
            System.out.println();
        }
        
        System.out.println("=== Compile-time Polymorphism (Method Overloading) ===");
        
        Calculator calc = new Calculator();
        
        // Same method name but different parameters
        System.out.println("Add two integers: " + calc.add(5, 10));
        System.out.println("Add three integers: " + calc.add(5, 10, 15));
        System.out.println("Add two doubles: " + calc.add(5.5, 10.5));
        System.out.println("Add two strings: " + calc.add("Hello ", "World"));
    }
}
