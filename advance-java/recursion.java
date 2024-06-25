public class recursion {


    // for ddecsending order print numb from 5-1

    // public static void printNumber(int n){
    //     if (n==0) {
    //         return; 
    //     }
    //     System.out.println(n);
    //     printNumber(n-1);
    // }
    // public static void main(String[] args) {
    //    int  n =5;
    //    printNumber(n);

    // }

    // for ascending order print 1-5

    // public static void printNumber(int n){
    //     if (n==6) {
    //         return; 
    //     }
    //     System.out.println(n);
    //     printNumber(n+1);
    // }
    // public static void main(String[] args) {
    //    int  n =1;
    //    printNumber(n);
    // }

    // print sum of first natural numbers

//     public static void printSum(int n){
//             if (n==10) {
//                 System.out.println();
//                 return; 
//             }
//             System.out.print(n);
//             printSum(n+1);
           
//         }
//         public static void main(String[] args) {
//            int  n =1;
//            printSum(n);


// }

// print factorial of number n;

// public static int calcFactorial (int n){
//    if (n==1 || n==0) {
//     return 1;
    
//    }

//    int fact_nm1 = calcFactorial(n-1);
//    int fact_n = n* fact_nm1;
//    return fact_n;

// }
// public static void main(String[] args) {
//     int n=5;
//     int ans= calcFactorial(n);
//     System.out.println(ans);

// }


// print the febnoci series till the nth term;

// febnoci series is takes sum of two numbers 0 1 1 2 3 5 7 12 ... and so onpubl

// public static void printFeb( int a, int b, int n){
//     if (n==0) {
//         return;
//     }
//     int c = a+b;
//     System.out.println(c);
//     printFeb(b, c, n-1);
// }
// public static void main(String[] args) {
//     int a=0, b=1;
//     System.out.println(a);
//     System.out.println(b);

//     int n=7;
//     printFeb(a, b, n-2);
// }


// print x^n (stack height = n )
// x^n is = x*x*x*x ...... till n

// public static int calPower (int x, int n){
//     if (n==0) {  // base case 1
//         return 1;

//     }
//     if (x==0) { // base case 2
//         return 0;
        
//     }

//     int xPownm1 = calPower(x, n-1);
//     int xPown = x* xPownm1;
//     return xPown;
// }

// public static void main(String[] args) {
//     int x = 2, n=5;
//     int ans = calPower(x, n);
//     System.out.println(ans);
// }


//  print x^n ( stack hieght = logn)

public static int calPower (int x, int n){
    if (n==0) {  // base case 1
        return 1;

    }
    if (x==0) { // base case 2
        return 0;
        
    }
    // if n is even
       if (n%2 == 0) {
        return calPower(x, n/2) * calPower(x, n/2);
       }else{
        // if n is odd

        return calPower(x, n/2) * calPower(x, n/2) *  x;
       }
}

public static void main(String[] args) {
    int x = 2, n=5;
    int ans = calPower(x, n);
    System.out.println(ans);
}

}
