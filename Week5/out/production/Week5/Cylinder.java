/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author canad
 */
public class Cylinder extends Circle {
    private double height = 1;

    public Cylinder() {
        super();
    }

    public Cylinder(double radius, double height) {
        super(radius);
        setHeight(height);
    }

    public void setHeight(double height) {
        if (height > 0)
            this.height = height;
        else
            throw new IllegalArgumentException("Invalid value for height.");
    }

    public double getHeight() {
        return height;
    }
    //2 * PI * radius^2 + height * 2 * PI * radius   (cylinder's surface area formula)
    public double calcArea() {
        return 2 * super.calcArea() * height * 2 * Math.PI * getRadius();
    }
    // For Question #2
    public double calcVolume() {
        return  super.calcArea() * height;
    }

    public String toString() {
        return "Cylinder: radius= " + getRadius()+ "   Height=  "+height;
    }
    public boolean equals(Object cylinder) {// For Question#4
        Cylinder cy = (Cylinder)cylinder;
        return (cy.getRadius() == this.getRadius())&&(cy.getHeight()== this.height);
    }


}
