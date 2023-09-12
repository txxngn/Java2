package ArrayTest;

import java.util.Arrays;

public class Sorting_Example {
    public static void main(String[] args) {
        double[] list = {-2, 4.5, 5, 1, 2, -3.3};
        Arrays.parallelSort(list);// sort and parallelSort are same in this case
        for (double n : list) {
            System.out.print(n + "\t");
        }
        System.out.println();
        System.out.println();

        //*****************************
        double[] list2 = {9, 5, 0, 1, 2, 4};
        Arrays.parallelSort(list2, 1, 3);// sort a partial array from 1 to (3-1=2)
        for (double n : list2) {
            System.out.print(n + "\t");
        }
        System.out.println();
        System.out.println();

        //*********************
        double[] list3 = {9, 5, 0, 1, 2, 4};
        Arrays.parallelSort(list3);
        for (double n : list3) {
            System.out.print(n + "\t");
        }
        System.out.println();
        System.out.println();

        System.out.println(Arrays.binarySearch(list3, 9));// search for 9 in array and return index
        //**************************************************
        double[] list4 = {9, 5, 0, 1, 2, 4};

        double[] list5 = {9, 5, 0, 1, 2, 4};
        System.out.println();
        System.out.println(Arrays.equals(list4, list5));
        System.out.println();
        System.out.println();

        //*********************************************
        double[] list6 = {0, 0, 0, 0, 0, 0, 0};
        double[] list7 = {0, 0, 0, 0, 0, 0, 0};
        Arrays.fill(list6, 5);
        Arrays.fill(list7, 1, 5, 8);// from index 1 till (5-1=4)
        System.out.println("list6");
        for (double n : list6) {
            System.out.print(n + "\t");
        }
        System.out.println();
        System.out.println();

        System.out.println("list7");
        for (double n : list7) {
            System.out.print( n + "\t");
        }
        System.out.println();
        System.out.println();

        //****************
        System.out.println(Arrays.toString(list7));

        //*********************
        double[] list8 = {0, 0, 0, 0, 0, 0, 0};
        System.arraycopy(list7, 0, list8, 0, list7.length);

        System.out.println(Arrays.toString(list8));
    }
}
