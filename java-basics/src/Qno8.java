import java.util.Scanner;

public class Qno8 {
    
    //     Two numbers are entered by the user, x and n.
//      Write a function to find the value of one number raised to the power of another i.e. xn.

//   public static int findPower( ){

//   }


public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println(" Enter two values for n and x : ");
    int n = sc.nextInt();
    int x = sc.nextInt();
    int base = x;
    int exponent = n;
    double result = Math. pow(base, exponent);
    System.out.println(base + " raise to the power" + exponent + " is " + result);
   
   
}
}
