package ArrayTest;

public class RaggedArray { //Arrays in array - Arrays that not equal in an array
    public static void main(String[] args) {
        int[][] num = { {1, 2, 3, 4}, {8, 9}, {5, 6, 7} }; //để ý 2 [] [] lúc initialize
        // printing the array
        for (int i = 0; i < num.length; i++) {     //loop through row first
            for (int j = 0; j < num[i].length; j++) {//notice num[i] because rows having various lengths.  //loop through column second
                System.out.print(num[i][j]+"\t");    //i (first bracket) is for row, j (second bracket) is for column
            }
            System.out.println();
        }

        //row 1 : {1, 2, 3, 4}
        //row 2 : {8, 9}
        //row 3 : {5, 6, 7}


    }
}
