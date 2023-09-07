package Association2;
// Student class
class Student {
    private String name;
    private int rollNumber;

    public Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rollNumber;
    }
}

// School class
class School {
    private String name;
    private Student[] students;

    public School(String name) {
        this.name = name;
        students = new Student[100]; // assuming a maximum of 100 students
    }

    public void addStudent(Student student) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                students[i] = student;
                break;
            }
        }
    }

    public void displayStudents() {
        System.out.println("Students in " + name + " school:");
        for (Student student : students) {
            if (student != null) {
                System.out.println("Name: " + student.getName() + ", Roll Number: " + student.getRollNumber());
            }
        }
    }
}

// Main class
public class AssociationExample {
    public static void main(String[] args) {
        // Create school
        School school = new School("ABC School");

        // Create students
        Student student1 = new Student("John", 101);
        Student student2 = new Student("Emma", 102);
        Student student3 = new Student("Michael", 103);

        // Add students to school
        school.addStudent(student1);
        school.addStudent(student2);
        school.addStudent(student3);

        // Display students in the school
        school.displayStudents();
    }
}
