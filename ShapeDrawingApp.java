
// Shape Drawing App: Create a system with an abstract class Shape, then extend it to different types of shapes (Circle, Rectangle, etc.), using polymorphism to draw them.

// Main class to run the program
public class ShapeDrawingApp {
    public static void main(String[] args) {
        // Polymorphism: We use the Shape reference to hold different shape objects
        Shape[] shapes = new Shape[3];  // Create an array of Shape references

        shapes[0] = new Circle();       // Assign Circle object
        shapes[1] = new Rectangle();    // Assign Rectangle object
        shapes[2] = new Triangle();     // Assign Triangle object

        // Loop through each shape and draw it
        for (Shape shape : shapes) {
            shape.draw();  // Polymorphic call: executes the correct draw() method
        }
    }
}

// Abstract class: cannot be instantiated directly
abstract class Shape {
    // Abstract method: must be implemented by all subclasses
    public abstract void draw();
}

// Subclass 1: Circle
class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Circle.");
        // You can add drawing logic here if needed
    }
}

// Subclass 2: Rectangle
class Rectangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle.");
        // Add rectangle-specific drawing logic here
    }
}

// Subclass 3: Triangle
class Triangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Triangle.");
        // Add triangle-specific drawing logic here
    }
}
