public class recursion {

//     // QNO 1 = print numbers from 5 - 1;

    public static void printNumb(int n){

    //     // base case
        if (n==0) 
        return;
     System.out.println(n);

         printNumb(n-1);
     }


     public static void main(String[] args) {
        int n = 5;
         printNumb(n);
        
     }








//     // QNO 2 = print numbers from 1 -5

//     // public static void printnumb(int n){

//     //     //base case
//     //     if (n==6) 
//     //     return;

//     //     System.out.println(n);
//     //     printnumb(n+1);

//     // }
//     // public static void main(String[] args) {
//     //     int n = 1;
//     //     printnumb(n);
//     // }









//     // QNO 3 =print sum of first natural numbers

//     // public static void printSum(int i , int n, int sum){
        
//     //     // base case
//     //     if (i==n) {
//     //         sum += i;
//     //         System.out.println(sum);
//     //         return; 
//     //     }

//     //     sum += i;
//     //     printSum(i+1, n, sum);
//     // }

//     // public static void main(String[] args) {
//     //     int n = 6;
//     //     printSum(1, 5, 0);
//     // }











//     // QNO 4  =print factorial of number n;

//     //   public static int calcFactorial(int n){

//     //     // base 
//     //     if (n==1 || n ==0) {
//     //         return 1;
//     //     }

//     //     int fact_nm1 = calcFactorial(n-1);
//     //     int fact_n = n*fact_nm1;
//     //     return fact_n;
//     //   }

//     //   public static void main(String[] args) {
//     //      int n = 5;
//     //      int ans = calcFactorial(n);
//     //      System.out.println(ans);
//     //   }












//          // QNO 5 =print fibnocci series


//      // public static void printFibnocci (int a , int b, int n){

//     //     if (n==0) {
//     //         return;
//     //     }
//     //     int c = a+b;
//     //     System.out.println(c);
//     //     printFibnocci(b, c, n-1);

//     // }

//     // public static void main(String[] args) {
//     //     int a=0, b =1;
//     //     System.out.println(a);
//     //     System.out.println(b);
//     //    int n= 7;
//     //     printFibnocci(a, b, n-2);
//     // }











      //QNO 6
//     // calcuate x^n (stack height is n)

//     // public static int calcPower(int x, int n){
//     //     if (n==0) {
//     //        return 1;
//     //     }
//     //     if (x==0) {
//     //         return 0;  
//     //     }

//     //     int xPownm1 = calcPower(x, n-1);
//     //     int xPow = x * xPownm1;
//     //     return xPow;
//     // }

//     // public static void main(String[] args) {
//     //     int x =2 , n=5;
//     //     int ans =calcPower(x, n);
//     //     System.out.println(ans);
//     // }
















//    QNO 7 

//     // print x^n (stack height is logn)
//     public static int calcPower(int x, int n){
//             if (n==0) {
//                return 1;
//             }
//             if (x==0) {
//                 return 0;  
//             }
//             if (n%2 ==0) {
//                 return calcPower(x, n/2) * calcPower(x, n/2);
                
//             }else{
//                 return calcPower(x, n/2) * calcPower(x, n/2) * x;
//             }
    
//         }
    
//         public static void main(String[] args) {
//             int x =2 , n=5;
//             int ans =calcPower(x, n);
//             System.out.println(ans);
        }

