package ReadManyObjects;

import java.io.*;
import java.util.*;
public class ScribbleMain {
    public static void main(String[] args) {
        //Writing Object

        /*Write a Scribble class that implements Serializable
    When the application opens it read scribble.dat and if there it
    prints it before asking for a new name and note
    Then it asks the user for a Scribble name and note and saves
    it to the file scribble.dat
    note: only one Scribble Object is saved in the file.*/


        //Read scribble from file and print it
        ObjectInputStream input = null;
        try{
            input = new ObjectInputStream(new FileInputStream("scribble.dat"));
            Scribble scribble = (Scribble) input.readObject();
            System.out.println(scribble);
        }catch(Exception e){
            System.out.println("Error reading scribble");
        }finally {
            if(input != null){
                try{
                    input.close();
                }catch
                (Exception e){
                    System.out.println("Unable to close input");
                }
            }
        }
        //get name and note from user to create a new scribble
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter scribble name: ");
        String name = scan.nextLine();
        System.out.println("Enter scribble note: ");
        String note = scan.nextLine();
        Scribble scribble = new Scribble(name, note);

        //write scribble to the file
        ObjectOutputStream output = null;
        try{
            output = new ObjectOutputStream(new FileOutputStream("scribble.dat"));
            output.writeObject(scribble);
        }catch (Exception e){
            System.out.println("Error writing scribble");
        }finally {
            if(output != null){
                try{
                    output.close();
                }catch(Exception e){
                    System.out.println("Error closing output");
                }
            }
        }


    }
}
