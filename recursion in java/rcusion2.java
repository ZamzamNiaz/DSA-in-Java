

public class rcusion2 {

    // QNO 8
    // tower of henoi
    // rules:
    // u can take only one disk at one time
    // bigger disk should be below and smaller would be on it

    public static void towerOfHanoi (int n , String src, String helper, String
    dest){
    if (n==1) {
    System.out.println("Transfer disk " +n+ " form "+src+" to "+ dest );
    return;
    }
    towerOfHanoi(n-1, src, dest, helper);
    System.out.println("Transfer disk " +n+ " form "+src+" to "+ dest );
    towerOfHanoi(n-1, helper, src, dest);

    }

    public static void main(String[] args) {
    int n = 3;
    towerOfHanoi(n, "S", "H", "D");

    // time complexity is O(2^n)
    }











    // QNO 9
    // print a string in reverse = abcd

    // public static void revStr( String str, int indx){
    // if (indx==0) {
    // System.out.println(str.charAt(indx));
    // return;
    // }
    // System.out.print(str.charAt(indx));
    // revStr(str, indx-1);
    // }

    // public static void main(String[] args) {
    // String str = "zyxwvutsrqponmlkjihgfedcba";
    // revStr(str, str.length()-1);

    // // time complexity = O(n)
    // }












    // QNO 10
    // find the first and last accurance of an element in a string = abbaacdaefaah

    // public static int first = -1;
    // public static int last = -1;
    // public static void findOccurance (String str, int indx, char element){
    // // base case
    // if (indx == str.length()) {
    // System.out.println(first);
    // System.out.println(last);
    // return;
    // }
    // char currChar = str.charAt(indx);
    // if (currChar == element) {
    // if (first == -1) {
    // first = indx;
    // }else{
    // last = indx;
    // }
    // }
    // findOccurance(str, indx+1, element);
    // }

    // public static void main(String[] args) {
    // String str = "abbaacdaefaah";
    // findOccurance(str, 0, 'a');

    // // time complexity is = O(n)
    // }











    // QNO 11
    // check if an array is sorted ( strictly increasing)

    // public static boolean isSorted(int arr[], int indx){

    // if (indx == arr.length-1) {
    // return true;

    // }
    // if (arr[indx] < arr[indx+1]) {
    // // array is sorted till now
    // return isSorted(arr, indx+1);

    // }else{
    // return false;
    // }
    // }

    // public static void main(String[] args) {
    // int arr[] = {1, 2, 3, 4, 4, 5};
    // System.out.println( isSorted(arr, 0));
    // }

    // time complexity is = O(n) = length of array












    // QNO 12
    // move all 'x' at the end of string
    // public static void moveAllX(String str, int indx, int count, String newString) {
    //     // base case;

    //     if (indx == str.length()) {
    //         for (int i = 0; i < count; i++) {
    //             newString += 'x';
    //         }
    //         System.out.println(newString);
    //         return;
    //     }
    //     char currChar = str.charAt(indx);
    //     if (currChar == 'x') {
    //         count++;
    //         moveAllX(str, indx + 1, count, newString);

    //     } else {
    //         newString += currChar;
    //         moveAllX(str, indx + 1, count, newString);
    //     }
    // }

    // public static void main(String[] args) {
    //     String str = "abxxcxdcxxd";
    //     moveAllX(str, 0, 0, "");

    //     // time complexity = O(n) = equals to string lenght
    // }













    // QNO 13
    // Remove dubplicates in a string = 'abbccda'

    // public static boolean[] map = new boolean[26];
    // public static void removeDuplicates(String str, int indx, String newString){
    //     // base case
    //     if (indx == str.length()) {
    //         System.out.println(newString);
    //         return;
            
    //     }
    //     char currChar = str.charAt(indx);
    //     if (map[currChar - 'a'] == true) {
    //     removeDuplicates(str, indx+1, newString);
    //     }else{
    //         newString +=currChar;
    //         map[currChar -'a'] = true;
    //         removeDuplicates(str, indx+1, newString);
    //     }
    // }

    // public static void main(String[] args) {
    //     String str = "abbccda";
       
    //     removeDuplicates(str, 0, "");

    //     // time complexity is O(n)
    // }

















    // QNO 14  IMPORTANT QUESTION FOR INTERVIEWS 
    // Print all the sub-sequences of a string
    
    // public static void subSequences(String str , int indx, String newString){
    //     // base case 
    //     if (indx == str.length()) {
    //         System.out.println(newString);
    //         return;
            
    //     }
    //     char currChar = str.charAt(indx);

    //     // to be
    //     subSequences(str, indx+1, newString+currChar);

    //     // not to be
    //     subSequences(str, indx+1, newString);
    // }

    // public static void main(String[] args) {
    //  String str = "abcd";
    //  subSequences(str, 0, "");

    //  // time complexity = O(2^n) = by recursive tree
    // }
}











    
