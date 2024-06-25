import java.util.HashSet;



public class recursion3 {

    // QNO 15
    // Print all the unique subsequences of a string 

    public static void subSequences(String str , int indx, String newString , HashSet <String> set){
        //     // base case 
            if (indx == str.length()) {
                if (set.contains(newString)) {
                    return;
                }else{
                    System.out.println(newString);
                    set.add(newString);
                    return;
                }
               
                
            }
            char currChar = str.charAt(indx);
    
            // to be
            subSequences(str, indx+1, newString+currChar, set);
    
            // not to be
            subSequences(str, indx+1, newString, set);
        }
    
        public static void main(String[] args) {
         String str = "aaa";
         HashSet <String> set = new HashSet<>();
         subSequences(str, 0, "", set);
}













   // QNO 16
   // Print keypad combinations
  //  public static String [] keypad = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};
  //  public static void printComb(String str, int indx, String combination){
  //     // base case
  //     if (indx == str.length()) {
  //       System.out.println(combination);
  //       return;
  //     }
  //   char currChar = str.charAt(indx);
  //   String mapping = keypad[currChar - '0'];
  //   for(int i=0; i<mapping.length(); i++){
  //       printComb(str, indx+1, combination+mapping.charAt(i));
  //   }
  //  }

  //  public static void main(String[] args) {
  //    String str = "2";
  //    printComb(str, 0, "");

  //    // time complexity = O(4^n)= 4 choices of comb, n= length of str
  //  }












  // QNO 17
  // print all permutations of a string
  // permutations = all posible combinations of a string
  // can solve it by taking factorial, if "abc" = 3!, if 'abcd' = 4!
  
  // public static void printPermu(String str, String permutations){
  //   // base case 
  //   if (str.length()==0) {
  //     System.out.println(permutations);
  //     return;
  //   }
  //     for(int i=0; i<str.length(); i++){
  //       char currChar = str.charAt(i);
  //       String newStr = str.substring(0, i) + str.substring(i+1);
  //       printPermu(newStr, permutations+currChar);
  //     }
  // }

  // public static void main(String[] args) {
  //   String str = "abc";
  //   printPermu(str, "");

  //   // Time complexity is = O(n!)
  // }










   // QNO 18
  // Count total paths in a maze to move form (0, 0 ) to (m, n)

  // public static int countPaths(int i, int j, int n, int m){

  //   // two base cases
  //   if (i==n || j==m) { // base case 1
  //     return 0;
      
  //   }
  //   if (i== n-1 && j== m-1) { // base case 2
  //      return 1;
  //   }

  //   // move downwards
  //        int downPath =  countPaths(i+1, j, n, m);

  //    //  move right   
  //        int rightPath = countPaths(i, j+1, n, m);
  //        return downPath+ rightPath;
  // } 

  // public static void main(String[] args) {
  //   int n=3 , m=3;
  //   int totalPaths =  countPaths(0, 0, n, m);
  //   System.out.println(totalPaths);
  // }












  // QNO 19 
  // place tiles of size 1xm in a floor of size nxm , n=4 , m=2;
  // public static int placeTiles (int n , int m){

  //   // base case 1
  //   if (n== m ) {
  //     return 2;
  //   }
  //   if (n < m) {
  //     return 1; 
  //   }

  //   // vertical tiles ;
  //   int verticalPlacement = placeTiles(n-m, m);

  // // horizontal tiles
  // int horizontalPlacement = placeTiles(n-1, m) ;
  // return verticalPlacement + horizontalPlacement;
  // }

  // public static void main(String[] args) {
  //   int n = 4, m =2;
  //   System.out.println(placeTiles(n, m));

  //   // time complexity could be better by solving it DP method
  // }











  // QNO 20 
   
  // find the number of ways in which you can invite n people into your party, single or in pairs
  // public static int callGuests(int n){
  //   // base case
  //   if (n<=1) {
  //     return 1;
  //   }

  //   // single guests
  //   int single = callGuests(n-1);

  //   // for pairs
  //    int pair = (n-1 )* callGuests(n-2);

  //    return single + pair ;
  // }

  // public static void main(String[] args) {
  //   int n = 5;
  //   System.out.println(callGuests(n));
  // }

  }


