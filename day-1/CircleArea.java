import java.util.*;

class CircleArea{
    public static void main (String[] args){
        System.out.print("Enter Radius of the Circle: ");
        Scanner sc = new Scanner(System.in);
        float r = sc.nextInt();
        System.out.print("Radius: ");
        System.out.print(r);

        double a = Math.PI * r * r;

        System.out.print("\nArea of the Circle: ");
        System.out.print(a);

    }
}