package ArrayTest;

public class ArrayTest {
    public static void main (String [] args){
        char Firstname[] = new char[10];
        char Lastname[] = new char[10];
        double marks[] = new double[10];

        for (int i = 0; i < Firstname.length; i++){
            Firstname[i] = (char)('A' + i); //nó cộng được là cộng ascii của A là 65, cộng lên 66 r cast char
            Lastname[i] = (char)('B' + i);
            marks [i] = 50.0 + (i*5);
            System.out.printf( "%2c %2c %.2f\n", Firstname[i], Lastname[i], marks[i] );

        }




    }
}
