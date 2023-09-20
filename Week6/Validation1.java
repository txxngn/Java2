import java.util.Scanner;

public class Validation1 {
    public static void main(String[] args) {

        //Standard validation
        Scanner in = new Scanner(System.in);
        boolean error;
        int mark;
        int [] array1 = new int[4];
        for (int i = 0; i < 4; i++) {
            do {
                error = false;
                try {
                    System.out.print("Enter mark " +  (i+1) +": ");
                    mark = in.nextInt();
                    array1[i] = mark;
                }
                catch (Exception e){
                    System.out.println("ERROR: "+ e);
                    error = true;
                    in.nextLine();//clear all the previous input buffer, it may contain
                }                  //Nếu k có dòng này nó sẽ keep reading the input that still remained-> infinity loop
            } while (error);
        }
        in.close();// if you got warning to close scanner

        System.out.println("array Elemnts");
        System.out.println("-------------");
        for (int i =0; i < 4; i++) {
            System.out.println(array1[i]);
        }
    }

}

