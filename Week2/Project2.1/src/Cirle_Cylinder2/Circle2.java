package Cirle_Cylinder2;


public class Circle2 {
    private double radius = 1;

    public Circle2() {
    }

    public Circle2(double radius) throws IllegalArgumentException {
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


    public String toString() {

        return "Circle: radius=" + radius;
    }

    public boolean equals(Object circle) {
        Circle2 c = (Circle2)circle;
        return (c.getRadius() == this.radius);
    }
}

