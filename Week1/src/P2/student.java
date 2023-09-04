package P2;

public class student {
    private String name;
    private double age;

    public student(String name, double age) {
        this.name = name;                        //this bắt buộc dùng ở đây vì parameters trong constructor "student"
        this.age = age;                          //có tên giống với variable nên machine bị confused
    }                                            //ở file BigRoom k cần dùng this vì parameter khác với variable

    public student() {
    }

    public String getName() {
        return this.name;
    }

    public double getAge() {
        return this.age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(double age) {
        this.age = age;
    }

}
