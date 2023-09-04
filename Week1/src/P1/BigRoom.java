package P1;

public class BigRoom {
    private double length = 5.0;
    private double width = 4.0;

    BigRoom() {
    }

    BigRoom(double newLength, double newWidth) {
        length = newLength;             //dù variable là private nhưng parameter là "newLength", là khác tên
        width = newWidth;               //nên k nhất thiết phải có this ở đây
    }

    public void setLength(double newLength) {
        length = newLength;
    }
    public double getLength() {
        return length;
    }

    public void setWidth(double newWidth) {
        width = newWidth;
    }

    public double getWidth() {
        return width;
    }


    public String getDimensions() {
        return length + " x " + width;
    }

    public double getArea() {
        double area = length * width;
        return area;
    }

    public String toString() {
        return getWidth() + "X  " + getLength();
    }                                   //tạo method toString là để format output khi print object name
                                        //Nếu k có method toString, vẫn in được object nhưng nó in ra memory location của object
}                                       //K CẦN GỌI method toString, hệ thống tự hiểu nếu mình in tên object trong main


