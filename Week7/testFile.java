import java.io.File;
public class testFile {
    public static void main (String [] args){

        File myFile = new File("C:\\Users\\Thai Nguyen\\JAVA\\test.txt");
        System.out.println("Does it exist: " +myFile.exists());
        System.out.println("Can it be read: " + myFile.canRead());
        System.out.println("Can it be write: " + myFile.canWrite());
        System.out.println("Is it a directory: " + myFile.isDirectory());
        System.out.println("Is it a File: " + myFile.isFile());
        System.out.println("Is it absolute: " + myFile.isAbsolute());
        System.out.println("Is it hidden: " + myFile.isHidden());


    }
}
