package inheritance;

class Employee{  
    float salary=40000;  
   }
class Programmer extends Employee{
    int bonus=10000;  
    public static void main(String args[]){  
      Programmer p=new Programmer();  
      System.out.println("Programmer salary is:"+p.salary);
      System.out.println("Bonus of Programmer is:"+p.bonus);
      /********************************/
      Employee e1= new Employee();
      System.out.println("Employee salary is:"+e1.salary);  
      //System.out.println("Bonus of Employee is:"+e1.bonus); //-> k ra


      /************************************************ */
      Programmer p2= (Programmer) new Employee();// this is what? //typecasting employee to programmer (typecasting object)
      System.out.println("Employee salary is:"+p2.salary);
      System.out.println("Bonus of Employee is:"+p2.bonus);


      Employee e2= (Employee) new Programmer();
      System.out.println("Employee salary is:"+e2.salary);
      //System.out.println("Bonus of Employee is:"+e2.bonus);  //-> k ra
   }  
   }  