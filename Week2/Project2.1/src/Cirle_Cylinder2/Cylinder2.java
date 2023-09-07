package Cirle_Cylinder2;


public class Cylinder2 extends Circle2 {
    private double height = 1;

    public Cylinder2() {

        super();
    }

    public Cylinder2(double radius, double height) {
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


    public double calcArea() {

        return 2 * super.calcArea() * height * 2 * Math.PI * getRadius();
    }

    public double calcVolume(){
        return height* super.calcArea();
    }

    public String toString(){
        return "The Circle area is " + super.calcArea() + " has Cylinder with area of " + calcArea() + " and volume of " +calcVolume();
    }

    public boolean equals(Object cylinder) {
        Cylinder2 cy = (Cylinder2) cylinder;
        return (cy.getHeight() == this.height) && (cy.getRadius() == this.getRadius());
    }
}
