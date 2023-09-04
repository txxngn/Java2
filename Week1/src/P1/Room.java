package P1;

public class Room {
    public double length;
    public double width;

    public Room() {
    }

    public Room(double newLength, double newWidth) {
        length = newLength;
        width = newWidth;
    }

    public String getDimensions() {

        return length + " x " + width;
    }

    public double getArea() {
        double area = length * width;
        return area;
    }

}

