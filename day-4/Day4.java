import java.io.ObjectOutput;
import java.io.OutputStream;
import java.util.*;

public class Day4{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Pattern : Inverted Half Pyramid
        // System.out.print("Enter n: ");
        // int n = sc.nextInt();
        
        // for(int i = n; i >= 1; i--){
        //     for(int j = 1; j <= i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // *** Half Pyramid with Number***
        // System.out.print("Enter n: ");
        // int n = sc.nextInt();

        // for(int i = 1; i <= n; i++){
        //     for(int j = 1; j <= i; j++){

        //         System.out.print(j);
        //     }
        //     System.out.println();
//         }

                //***olta number hela */
                // System.out.print("Enter n:");
                //      int n = sc.nextInt();
           
                // for(int i=n; i>=1; i--){
                //     for(int j=1; j<=i; j++){
                //         System.out.print(j);
                //     }
                //     System.out.println();
                // }

            //  *** Floyd's Tringle ***
            // System.out.print("Enter n:");
            // int n = sc.nextInt();

            // int k = 1;
            // for(int i = 1; i <= n; i++){
            //     for(int j = 1; j <= i; j++){
            //         System.out.print(k++);
            //         System.out.print(" ");
            //     }
            //     System.out.println();
            // }

            // *** 0-1 Triangle***
            System.out.print("Enter n:");
            int n = sc.nextInt();

            for(int i = 1; i <= n; i++){
                if(i % 2 != 0){
                    for(int j = 1; j <= i; j++){
                    if(j % 2!=0) System.out.print("1 ");
                    else System.out.print("0 ");
                    }
                }
                else{
                    for(int j = 1; j <= i; j++){
                        if(j % 2!=0) System.out.print("0 ");
                        else System.out.print("1 ");
                    }
                }
                System.out.println();
            }
          
        }
    }    