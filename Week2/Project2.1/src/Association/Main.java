package Association;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //int array1[]= new int[10];
        Professor Parray[]=new Professor[2];
        Student Sarray[]=new Student[2];
        
        Student S1 = new Student();  
        S1.setfirstName("John");
        S1.setlastName("Smith");
        S1.setprofessors(Parray);
        
        Student S2 = new Student("Alex","Peter",Parray); 
        Sarray[0]=S1;
        Sarray[1]=S2;
        Professor P1 = new Professor("A","B",Sarray);
        Professor P2 = new Professor("C","D",Sarray);
       
       Parray[0]=P1;
       Parray[1]=P2;
        
        System.out.println(S1);
        System.out.println(S2.getfirstName());
        System.out.println(S2.getlastName());
        System.out.println(Arrays.toString(S2.getprofessors()));  //Arrays.toString() return the string representation of arr




    }

}
