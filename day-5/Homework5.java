import java.util.*;

public class Homework5 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        // *** Ayush's code starts here *** //

        /* Pattern 1 - Hollow rhombus
         *     *****
         *    *   *
         *   *   *
         *  *   *
         * *****
         */

        //  for(int i = 1; i <= n; i++) {
        //     for(int j = 1; j <= n - i; j++) {
        //         System.out.print(" ");
        //     }
        //     for(int j = 1; j <= n; j++) {
        //         if(i == 1 || j == 1 || i == n || j == n) System.out.print("*");
        //         else System.out.print(" ");
        //     }
        //     System.out.println();
        //  }

        /* Pattern 2 - Diamond
         * 
         *    *
         *   ***
         *  *****
         * *******
         *  *****
         *   ***
         *    *
         */

        // for(int i = 1; i <= (2 * n) - 1; i++) {
        //     for(int j = 1; j <= n - i || j <= n - ((2 * n) - i); j++) {
        //         System.out.print(" ");
        //     }
        //     if(i <= n) {
        //         for(int j = 1; j <= i + (i - 1); j++) {
        //             System.out.print("*");
        //         }
        //     }
        //     else {
        //         int k = (2 * n) - i;
        //         for(int j = 1; j <= k + (k - 1); j++) {
        //             System.out.print("*");
        //         }
        //     }
        //     System.out.println();
        // }

         // *** Ayush's code end here *** //
    }
}
