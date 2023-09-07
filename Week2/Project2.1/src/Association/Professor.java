package Association;
public class Professor {
   private String firstName;
   private String lastName;
   private Student[] students;
   public Professor(){}
   public Professor(String fname, String lname, Student[] S) {
        firstName = fname;
        lastName = lname;
        students=S;
    }
   
    public String getfirstName() {
    return firstName;
  }
    public String getlastName() {
    return lastName;
  }
    public Student[] getstudents() {
    return students;
  }  //check cái này
    
     public void setfirstName(String fname){
          firstName=fname;  
      }
        
      public void setlastName(String lname){
          lastName=lname; 
                } 
      
      public void setstudents(Student[]s){
           students=s;
                } 
      
      public String toString() {
    return getfirstName() + "  " + getlastName();

    
    
}
}

