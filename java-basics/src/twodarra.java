import java.util.*;
public class twodarra {
    
    public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter numbers of rows and colmns");
    //     int row = sc.nextInt();
    //     int colm= sc.nextInt();
    //     int [][] numbers= new int[row][colm];
    //     System.out.println("Enter numbers in rows and colomns");

    //     // input

    //     for(int i =0 ; i<row; i++){
    //         for(int j=0;j<colm; j++){
    //           numbers[i][j]=  sc.nextInt();
    //         }
    //     }

    //     int x = sc.nextInt();
    //     System.out.println("Enter value for x");

    // for(int i=0; i<row; i++){
    //     for(int j=0; j<colm; j++){
    //            if (numbers[i][j]==x) {
    //             System.out.println("x found at location ("+ i +","+ j +")" );
                
    //            }
    //     }
    // }

     Scanner sc = new Scanner(System.in);
     System.out.println("enter number of rows and colomns");
     int rows = sc.nextInt();
     int colm = sc.nextInt();
    


     int [][] matrix = new int[rows][colm];
     System.out.println("Give numbers for rows and colmns");
     for(int i=0; i<rows; i++){
        for(int j=0; j<colm; j++){
        matrix[i][j]= sc.nextInt();
        }
     }


    //  For a given matrix of N x M, print its transpose.
       System.out.println("Transpose for given matrix is : ");
    for(int i=0; i<rows; i++){
        for(int j=0; j<colm; j++){
            System.out.print(matrix[i][j]+ " ");
        }
    }
    System.out.println();

    }
}
