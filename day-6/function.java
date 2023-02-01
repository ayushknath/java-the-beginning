import java.util.*;
public class function {
    // public static int Addtwonumber(int a , int b){
    //     int sum = a+b;
    //     return sum ;
       
    // }
    public static int Factorial(int n){
        int Fact = 1;
        for(int i = n; i>1 ; i--){
            Fact = Fact*i;
        }
        return Fact;
    }

    public static void main (String[] args){
    //     Scanner sc = new Scanner(System.in);
    //     int a =sc.nextInt();
    //     int b =sc.nextInt();
    //     System.out.println(Addtwonumber(a,b));

        //*** Factorial */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Factorial(n));
    }
    
}
