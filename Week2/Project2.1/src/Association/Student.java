package Association;
import java.util.Arrays;
public class Student {
    private String firstName;
    private String lastName;
    private Professor[] professors;
 public Student(){}
        public Student(String fname, String lname, Professor[] p) {
        firstName = fname;
        lastName = lname;
        professors=p;
    }
    public void setfirstName(String fname){
        firstName=fname;
    }

    public void setlastName(String lname){
        lastName=lname;
    }

    public void setprofessors(Professor[]p){
        professors=p;
    }

    public String getfirstName() {
        return firstName;
    }

    public String getlastName() {
        return lastName;
    }

    public Professor[] getprofessors() {
        return professors;
    }  //check cái này

      
    public String toString() {
        return getfirstName() + "  " + getlastName()+" "+ Arrays.toString(getprofessors()); //Arrays.toString() return the string representation of arr

}
}
