package inheritance;

// Parent class
class Shape {
     String color;
     public Shape() {
        }
        
    public Shape(String color) {
        this.color = color;
    }

    public void displayColor() {
        System.out.println("Color: " + color);
    }
}

// Child class
class Circle extends Shape {
    private double radius;


    public Circle() {
        
    }
    public Circle(String color, double radius) {
        this.color=color;
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public void displayArea() {
        System.out.println("Area: " + getArea());
    }
}

// Main class
public class InheritanceExample {
    public static void main(String[] args) {
        Circle circle = new Circle("Red", 5.0);
        circle.displayColor();
        circle.displayArea();
    }
}

