
package Cirle_Cylinder;

public class Circle {
     
    private double radius = 1;
 
    public Circle() {   
    }
 
    public Circle(double radius) throws IllegalArgumentException {
        setRadius(radius);
    }
 
    public void setRadius(double radius) {
        if (radius > 0)
            this.radius = radius;
        else
            throw new IllegalArgumentException("Invalid value for radius.");
    }
 
    public double getRadius() {

        return radius;
    }
 
    public double calcArea() {

        return Math.PI * Math.pow(radius, 2);
    }
     
    public double calcCircumference() {

        return 2 * Math.PI * radius;
    }
 
    public String toString() {

        return "Circle: radius=" + radius;
    }
 
    public boolean equals(Object circle) {
        Circle c = (Circle)circle;
        return (c.getRadius() == this.radius);
    }
}
