import java.io.OutputStream;
import java.util.*;

public class Day5 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        // *** Pattern Practice-1
        // for(int i = 1; i <= n; i++){

        // int k = i;
        // for(int j =1; j <= n-i; j++){
        // System.out.print(" ");
        // }
        // for(int j =1; j <= i; j++){
        // System.out.print(k);
        // System.out.print(" ");
        // }
        // k++;
        // System.out.println();
        // }

        // *** Pattern Practice-2
        // for(int i=1;i<=n; i++){
        // for(int j=1;j<=n-i;j++){
        // System.out.print(" ");

        // }
        // int k=i;
        // for(int j=1;j<=i+(i-1);j++){
        // if(j==i) {
        // k = 1;
        // System.out.print(k);
        // }
        // else if(j<i) {
        // System.out.print(k--);
        // }
        // else {
        // System.out.print(++k);
        // }
        // System.out.print(" ");
        // }
        // System.out.println();
        // }

        // *** Butterfly pattern *** //
        int k = 1;
        for (int i = 1; i <= 2 * n; i++) {
            if (i <= n) {
                for (int j = 1; j <= 2 * n; j++) {
                    if (j <= i || j > (2 * n - i)) {

                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
            } else {
                for (int j = 1; j <= 2 * n; j++) {
                    if (j <= (i - k) || j > ((2 * n) - (i - k)))
                        System.out.print("* ");
                    else
                        System.out.print("  ");
                }
                k = k + 2;
            }
            System.out.println();
        }
    }
}
