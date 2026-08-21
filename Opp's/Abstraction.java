// Abstraction in Java
// Abstraction is a process of hiding the implementation details and showing only the functionality

abstract class Shape {
    // Abstract method
    abstract void draw();
    
    abstract double getArea();
    
    // Concrete method
    void display() {
        System.out.println("This is a shape");
    }
}

class Circle extends Shape {
    private double radius;
    
    public Circle(double radius) {
        this.radius = radius;
    }
    
    @Override
    void draw() {
        System.out.println("Drawing a circle");
    }
    
    @Override
    double getArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;
    
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    
    @Override
    void draw() {
        System.out.println("Drawing a rectangle");
    }
    
    @Override
    double getArea() {
        return length * width;
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);
        
        circle.draw();
        System.out.println("Circle Area: " + circle.getArea());
        circle.display();
        
        rectangle.draw();
        System.out.println("Rectangle Area: " + rectangle.getArea());
        rectangle.display();
    }
}
