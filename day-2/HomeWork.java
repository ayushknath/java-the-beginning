import java.util.*;

public class HomeWork {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Multiplicatin Table
        // System.out.println("MULTIPLICATION TABLE");
        // System.out.print("Enter a number: ");
        // int num = sc.nextInt();
        // for(int i = 1; i <= 10; i++){
        //     int result = num * i;
        //     System.out.print(num);
        //     System.out.print(" X ");
        //     System.out.print(i);
        //     System.out.print(" = ");
        //     System.out.println(result);
        // }

        // Calculator
        float result = 0;

        for(int i = 1;; i++) {
            // Ask user to input two numbers
            System.out.print("\nEnter two numbers: ");
            float num1 = sc.nextFloat();
            float num2 = sc.nextFloat();

            // Ask user about the type of operation they want to perform
            System.out.println("\nWhat do you want to do?");
            System.out.println("1. Addition\n2. Subtraction\n3. Multiplication\n4. Division");
            int op_type = sc.nextInt();

            // Perform calculation
            switch(op_type) {
                case 1: 
                    result = num1 + num2;
                    break;
                case 2:
                    result = num1 - num2;
                    break;
                case 3:
                    result = num1 * num2;
                    break;
                case 4:
                    result = num1 / num2;
                    break;
                default: System.out.println("Invalid choice!");
            }

            // Display result of the selected operation
            System.out.print("\nResult: ");
            System.out.println(result);

            // Ask user if they want to continue
            System.out.print("Do you wish to continue? [yes/no] ");
            String quit_option = sc.next();
            
            if("no".equals(quit_option)) break;
        }
    }
}
