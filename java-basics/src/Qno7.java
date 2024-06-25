import java.util.Scanner;

public class Qno7 {
    //  write the program to enter numbers till the user wants  
    // and at the end it should display the count of positive, negative and zeros entered. :

    public static void main(String[] args) {
         int positive = 0;
        int negative =0;
        int zero = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 to start and 0 to stop : ");
        int input = sc.nextInt();
        while(input ==1){
           System.out.println("Enter your numbers : ");
           int number= sc.nextInt();
           if (number>0) {
            positive++;
           }else if (number<0) {
            negative++;
           }else{
            zero++;
           }
             System.out.println("Enter 1 to start and 0 to stop : ");
             input = sc.nextInt();
        }
        System.out.println("Positives = " + positive);
        System.out.println("Negatives = " + negative);
        System.out.println("zeros = " + zero);

    }
}
      

