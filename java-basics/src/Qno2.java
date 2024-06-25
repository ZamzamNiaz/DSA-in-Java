import java.util.*;;
public class Qno2 {
   
// printing sum of odd numbers



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value for n : ");
        int n = sc.nextInt();
       int sum = 0;
        for (int i=0; i<=n; i++){
          if (i%2!=0) {
            sum = sum +i;
          
          }
         
        }
    //     System.out.println("sum of odd numbers is " + n + " = " + sum);
//     }
    
//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.println("Enter a number : ");
//     int n = sc.nextInt();
//     int sum = 0;
//     for(int i = 0; i<=n; i++){
//         if (n%2 !=0) {
//             sum = sum + i;
//         }
//     }
//     System.out.println("Sum of Odd numbers is : " + n + " = " + sum);
//   }
// public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.println("Enter a number : ");
//     int n = sc.nextInt();
//    int  sum = 0;
//    for ( int i =0; i<=n; i++){
//     if (n%2 !=0) {
//         sum= sum+i;
//     }
//    }
//    System.out.println("Sum of Odd numbers is : " + n + " = " + sum);
// }

// //  checking of numbers that which one is greater in both:



// public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.println("ENTER TWO NUMBERS : ");
//     int a= sc.nextInt();
//     int b = sc.nextInt();
//     if (a>b) {
//         System.out.println("1st number is greater than second ");
        
//     }else{
//         System.out.println(" Second number is greater than 1st one");
//     }
    
// }

//  checking eligibility for vote:

// public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.println("Give your age to find out if you are eligible for vote or not : ");
//     int age = sc.nextInt();
//     if (age > 18) {
//         System.out.println("Eligible for vote");
        
//     }else{
//         System.out.println("Not eligible for vote");
//     }
// }


//  finding cicumfrence of a cirlce with given radius:

//  public static void main(String[] args) {
//     Scanner sc= new Scanner(System.in);
//     System.out.println("Give radius : ");
//     int radius = sc.nextInt();
//     double circum = 2* radius* Math.PI;
//     System.out.println("The circumfrence of a cirlce is : " + circum);
//  }

}
}


