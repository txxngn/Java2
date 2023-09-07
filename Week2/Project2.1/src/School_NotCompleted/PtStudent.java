package School_NotCompleted;

public class PtStudent extends Student {// this is the child class
    public String CompanyName = " ";
    public double Hrate = 0;
    public int HoursPerWeek = 0;
    public PtStudent(String name, int mark1, int mark2, String CompanyName, double Hrate, int HoursPerWeek) {
        super(name, mark1, mark2);
        this.CompanyName = CompanyName;
        this.Hrate = Hrate;
        this.HoursPerWeek = HoursPerWeek;
    }
    public double MonthlyPayment() {
        return (Hrate * HoursPerWeek * 4);
    }
    @Override
    public String toString() {
        return ("\nThis is a part time student\n"+super.toString() + "\nMonthly Salary is " + MonthlyPayment());
    }
}