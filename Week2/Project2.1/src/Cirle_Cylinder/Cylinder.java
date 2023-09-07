package Cirle_Cylinder;
public class Cylinder extends Circle {
    private double height = 1;
 
    public Cylinder() {

        super();    //super() sẽ lấy tất cả thông tin từ parent class
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

        return 2 * super.calcArea() * height * 2 * Math.PI * getRadius();   //lý do k dùng công thức trên vì k có radius
    }                                                               //radius trong parent là private nên phải dùng super
}     //super.calcArea() = PI * radius^2
        //lý do có super. là vì : nhìn vào method, nó cũng tên là calcArea()
        //nếu k có super nó sẽ thành loop, cái "super." nó hiểu là lấy method calcArea ở class parent
        //lý do khúc sau k dùng super mà dùng getRadius() vì chỉ có 1 method getRadius() nên nó sẽ k bị nhầm lẫn
