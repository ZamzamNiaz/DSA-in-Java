public class patterns {
    public static void main(String[] args) throws Exception {


        // pattern questions 
       
        //   1. solid rectangle; 

    for( int i = 1; i<4; i++){
        for(int j = 1; j<5; j++){
        System.out.print("*");
    }
    System.out.println("*");
}











//  Hollow rectangle;

    int n= 4;
    int m = 5;

    for( int i= 1; i<= n; i++ ){
        for ( int j = 1; j<= m; j++){
            if (i== 1 || j==1|| i==n||j==m) {
                System.out.print("*");
                
            }else {
                System.out.print( " ");
            }
           
        }System.out.println();
    }










    //  half paramid:

       int n1 = 4;

       for( int i= 1; i<= n; i++ ){
        for ( int j = 1; j<= i; j++){
            System.out.print("*");
        }
        System.out.println();

    }












//    inverted half pyramid:
   for( int i=n; i>=1; i --){
    for ( int j=1; j<=i; j++){
        System.out.print("*");
    }
    System.out.println();
   }










//  inverted half roted pyramid;

      int n4= 4;
      for( int i=1; i<=n; i++){
        for( int j=1; j<=n-i; j++ ){
            System.out.print(" ");
        }
         for( int j=1; j<=i; j++ ){
            System.out.print("*");
      }
     System.out.println();
}










    //    half pyramid with numbers;

    int n5 = 5;
    for (int i=1; i<=n; i++){
        for ( int j=1; j<=i; j++){
            System.out.print(j+ " ");
        }
        System.out.println();
    }
    
int n6 = 5;
    for (int i=1; i<=n; i++){
        for ( int j=1; j<=n-i+1; j++){
            System.out.print(j);
        }System.out.println();
   
}










//  floyds triangle;

int n7 = 5;
int number= 1;

    for (int i=1; i<=n; i++){
        for ( int j=1; j<=i; j++){
            System.out.print(number + "  ");
            number++;
        }System.out.println();
   
}

    int n8 = 5;
    for( int i=1 ; i <=n; i++){
        for( int j=1; j<=i; j++){
           int  sum= i+j;
            if (sum % 2==0) {
                System.out.print("1");
                
            }else{
                System.out.print("0");
            }
        }
        System.out.println();
    }










    //  advance patterns 
    //    butterfly pattern:

    //  upper half

      int n9=5;
      for( int i=1; i<=n8; i++){
        for( int j=1; j<=i; j++){
            System.out.print( "*");
        }

        int spaces = 2 * (n-i);
        for ( int j=1; j<=spaces; j++ ){
            System.out.print(" ");
        }

        for( int j = 1; j<=i; j++){
            System.out.print("*");
        }
        System.out.println();
      }

    // //    lower half

      for( int i=n; i>=1; i--){
        for( int j=1; j<=i; j++){
            System.out.print( "*");
        }

        int spaces = 2* (n-i);
        for ( int j=1; j<=spaces; j++ ){
            System.out.print(" ");
        }

        for( int j = 1; j<=i; j++){
            System.out.print("*");
        }
        System.out.println();
      }










      
    int n10 = 5;
    for ( int i=1; i<=n; i++ ){
        for( int j=1; j<=n-i; j++){
        System.out.print(" ");
    }
     for ( int j=1 ; j<=5; j++){
        System.out.print("*");
     }
     System.out.println();
    }

    int n11=8;
    for( int i =1; i<=n; i++){
        for( int j=1; j<=i; j++ ){
            System.err.print("*");
        }
        System.out.println();
    }
}
}

