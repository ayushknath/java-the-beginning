import java.util.*;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr1 = new int[3][3];
        int[][] arr2 = new int[3][3];
        int[][] res = new int[3][3];

        // Input 1st array
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }

        // Input 2nd array
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }

        // Mulitply matrix
        for(int row = 0; row < res.length; row++) {
            for(int col = 0; col < res[row].length; col++) {
                for(int k = 0; k < 3; k++) {
                    res[row][col] += arr1[row][k] * arr2[k][col];
                }
            }
        }

        // Show matrix
        for(int row = 0; row < res.length; row++) {
            for(int col = 0; col < res[row].length; col++) {
                System.out.print(res[row][col] + " ");
            }
            System.out.println();
        }
    }
}
