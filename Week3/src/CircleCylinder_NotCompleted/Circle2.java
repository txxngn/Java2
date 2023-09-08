package CircleCylinder_NotCompleted;

public class Circle2 extends GeoShape {
     
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
 
    
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }
     
    public double calcCircumference() {
        return 2 * Math.PI * radius;
    }
 // clean up the code
    public String toString() {
        return this.getClass().getSimpleName() + ": radius=" + radius;
    }
 
    public boolean equals(Object circle) {
        Circle2 c = (Circle2)circle;
        return (c.getRadius() == this.radius);
    }
}
