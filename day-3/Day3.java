import java.util.*;

/**
 * Day3
 */
public class Day3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
       
        // *** Sum of N natural Numbers ***
        // int n = sc.nextInt();
        // int result = 0;
        // int i = 1;
        // while(i <= n){

        //     result += i; // result = result + i
        //     i++;

        // }
        // System.out.print("Sum of n numbers");
        // System.out.println(result);

        
        // *** Pattern Problem-1 ***
        // System.out.print("Enter a row value: ");
        // int n = sc.nextInt();
        // System.out.print("Enter a column value: ");
        // int m = sc.nextInt();
        // System.out.println("\n");

            // for(int i = 0; i < n; i++){
                
            //     for(int j = 0; j < m; j++){
            //         System.out.print("  *  ");
            //     }
            //     System.out.print("\n");
            // }


        // *** Pattern problem 2 - Hollow pattern ****
        // System.out.print("Enter a row value: ");
        // int n = sc.nextInt();
        // System.out.print("Enter a column value: ");
        // int m = sc.nextInt();

        // for(int i = 1; i <= n; i++) {
        //     if(i == 1 || i == n) {
        //         for(int j = 1; j <= m; j++) {
        //             System.out.print("*");
        //         }
        //     }
        //     else {
        //         for(int j = 1; j <= m; j++) {
        //             if(j == 1 || j == m) System.out.print("*");
        //             else System.out.print(" ");
        //         }
        //     }
        //     System.out.print("\n");
        // }


        // *** Pattern problem 3 - Half pyramid ****
        System.out.print("Enter a row value: ");
        int n = sc.nextInt();
        System.out.print("Enter a column value: ");
        int m = sc.nextInt();

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
    
}