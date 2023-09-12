package ArrayTest;

public class CopyArray {
    public static void main (String [] args){
        int [] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++){
            numbers[i] = i;
        }
        System.out.println("Original Array");
        for (int i : numbers)
            System.out.print(i + " ");

        System.out.println();
        //second array
        int [] reverse = new int[10];
        for (int i = 0; i < reverse.length; i++){
            reverse [i] = numbers [9 - i];
        }
        System.out.println("Second Array in reverse with Original");
        for (int i : reverse){
            System.out.print(i + " ");
        }
        System.out.println();

        //copy second array back to original array
        System.arraycopy(numbers,0,reverse,0,10);
        System.out.println("both array after copy");
        for (int i : numbers)
            System.out.print(i + " ");

        System.out.println();

        for (int i : reverse)
            System.out.print(i + " ");





    }
}
