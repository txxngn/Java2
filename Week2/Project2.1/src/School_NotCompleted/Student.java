package School_NotCompleted;

public class Student {//this is the parent class

    public String name = " ";
    public int mark1 = 0;
    public int mark2 = 0;

    public Student(String name, int mark1, int mark2) {
        this.name = name;
        this.mark1 = mark1;
        this.mark2 = mark2;
    }

    public double calcAvg() {
        double avg = (mark1 + mark2) / 2;
        return avg;
    }

    @Override
    public String toString() {

        return "This is the information of " + name + "\nThe average is " + calcAvg();
    }
}

