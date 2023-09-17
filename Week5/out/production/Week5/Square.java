
public class Square {

    private double side = 1;

    public Square() {
    }

    public Square(double side) throws IllegalArgumentException {
        setSide(side);
    }

    public void setSide(double side) {
        if (side > 0)
            this.side = side;
        else
            throw new IllegalArgumentException("Invalid value for side.");
    }

    public double getSide() {
        return side;
    }

    public double calcArea() {
        return side*side;
    }

    public double calcSqPerimeter() {
        return  side*4;
    }

    public String toString() {
        return "Square: side=" + side;
    }

    public boolean equals(Object square) {
        Square s = (Square)square;
        return (s.getSide() == this.side);
    }
}
