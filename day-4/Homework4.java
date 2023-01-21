import java.util.*;

public class Homework4 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        // *** Codes for homework by Ayush Kumar Nath *** //

        /* Pattern 1

         *    ****
         *   ****
         *  ****
         * ****
         */

        // for(int i = 1; i <= n; i++) {
        //     for(int j = 1; j <= n - i; j++) {
        //         System.out.print(" ");
        //     }
        //     for(int j = 1; j <= n; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }


        /* Pattern 2 
         * 
         *     1
         *    2 2
         *   3 3 3
         *  4 4 4 4
         * 5 5 5 5 5
        */

        // int k = 1;
        // for(int i = 1; i <= n; i++) {
        //     for(int j = 1; j <= n - i; j++) {
        //         System.out.print(" ");
        //     }
        //     for(int j = 1; j <= i; j++) {
        //         System.out.print(k);
        //         System.out.print(" ");
        //     }
        //     k++;
        //     System.out.println();
        // }

        
        /* Pattern 3
         * 
         *         1
         *       2 1 2
         *     3 2 1 2 3
         *   4 3 2 1 2 3 4
         * 5 4 3 2 1 2 3 4 5
         */

        // for(int i = 1; i <= n; i++) {
        //     int k = i;

        //     for(int j = 1; j <= n - i; j++) {
        //         System.out.print("  ");
        //     }
        //     for(int j = 1; j <= i + (i - 1); j++) {
        //         if(j < i) System.out.print(k--);
        //         else if(j == i) {
        //             k = 1;
        //             System.out.print(k);
        //         }
        //         else System.out.print(++k);

        //         System.out.print(" ");
        //     }
        //     System.out.println();
        // }

        // *** Ayush Kumar Nath's code ends here *** //
    }
}
