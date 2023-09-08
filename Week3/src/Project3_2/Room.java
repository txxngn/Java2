package Project3_2;
public class Room  { //need to implement testroom
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



    public void getColor(String color){
        System.out.println("Room color is " + color);
    }


    public void getColor() {
        
    }


    public interface RoomInterface{
        public void getColor();

    }
    
}
    
    
    

