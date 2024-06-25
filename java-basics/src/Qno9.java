import java.util.Scanner;

public class Qno9 {
    // Write a function that calculates the Greatest Common Divisor of 2 numbers

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Give two values a and b,  to find ot there GCD : ");
//         int a = sc.nextInt();
//         int b= sc.nextInt();
    

//         while(a != b) { 
//             if(a>b) {
//                 a = a -b;
//             } else {
//                 b = b - a;
//             }
//         }
//         System.out.println("GCD is : "+ b);
// }



//  same code to get step by step answer look at sout: print code

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Give two values for a and b to find GCD : ");
    int a = sc.nextInt();
    int b = sc.nextInt();

    while (a!=b) {
        if (a>b) {
            a = a-b;
        }else{
            b= b-a;
        }
        System.out.println(" GCD : " + b);
    }
   
}

}