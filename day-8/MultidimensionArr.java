import java.util.*;

public class MultidimensionArr {
    public static void main(String[] args) {
        /*
         * 1 2 3
         * 4 5 6
         * 7 8 9
         */
        Scanner sc = new Scanner(System.in);

        // int[][] arr2D = {
        // {1, 2, 3},
        // {4, 5},
        // {7, 8, 9}
        // };

        // Input
        int[][] arr = new int[3][3];

        // System.out.println(arr.length); // .length only shows the row value in 2D arrays

        for (int row = 0; row < arr.length; row++) {
            // for each column of every row, take input
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = sc.nextInt();
            }
        }

        // for loop to print 2D array
        // for (int row = 0; row < arr.length; row++) {
        //     for (int col = 0; col < arr[row].length; col++) {
        //         System.out.print(arr[row][col] + " ");
        //     }
        //     System.out.println();
        // }

        // for-each loop to print 2D array 
        // for (int[] element : arr) {
        //     for (int col = 0; col < element.length; col++) {
        //         System.out.print(element[col] + " ");
        //     }
        //     System.out.println();
        // }
        
        // toString() method to print 2D array
        for (int[] element : arr) {
           System.out.println(Arrays.toString(element));
        }
    }
}
