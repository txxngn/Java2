package Jar;

public class Circle implements Comparable<Circle> {// Step#2
     
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
 // clean up the code
    public String toString() {
        return this.getClass().getSimpleName() + ": The Radius=" + radius;
    }
 
    public boolean equals(Object circle) {
        if (circle==null)
            return false;
        if(this==circle)
            return true;
        
        Circle c = (Circle)circle;
        return (c.getRadius() == this.radius);
    }
    // session 3.2
    public int compareTo(Circle c) {// Step #3
 
        double thisArea = this.calcArea();
        double otherArea = c.calcArea();
 
        if (thisArea > otherArea) {
            return 1;
        } else if (thisArea < otherArea) {
            return -1;
        } else {
            return 0;
        }
    }
     //Session 3.2 adding comparable interface>>>>> Step#1
    public interface Comparable<Circle> {
    public int compareTo(Circle c);
    }
}
