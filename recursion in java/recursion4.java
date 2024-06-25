import java.util.ArrayList;

public class recursion4 {

      // QNO 21

  // Print all the subsets of a set of first n natural numbers , n=123
   public static void printSubset(ArrayList<Integer>subset){
    for(int i=0; i<subset.size(); i++){
      System.out.print(subset.get(i)+" ");

    }
    System.out.println();
   }
  public static void findSubsets (int n , ArrayList<Integer>subset){

    // base case
    if (n==0) {
      printSubset( subset);
      return;
    }

    // if want to add
     subset.add(n);
     findSubsets(n-1, subset);

     // won't add 
     subset.remove(subset.size()-1);
     findSubsets(n-1, subset);
  }

  public static void main(String[] args) {
    int n = 3;
    ArrayList<Integer> subset = new ArrayList<>();
    findSubsets(n, subset);

    // time complexity is = O(2^n)
    
  }

}
