public class advRecursion {

    // Tower of Hanoi

    public static void towerOfHanoi (int n, String src, String helper, String
    dest){
    if (n==1) {
    System.out.println("transfer disk " + n+ " from"+ src+ " to"+ dest);
    return;
    }
    towerOfHanoi(n-1, src, dest, helper);
    System.out.println("Transfer disk "+ n+ " from"+ src +" to" + dest);
    towerOfHanoi(n-1, helper,src, dest);
    }
    public static void main(String[] args) {
    int n = 3;
    towerOfHanoi(n, " S", " H", " D");
    }








    // Print a string in reverse abcd:

    // public static void printRev (String str, int indx){
    // if (indx ==0) {
    // System.out.println(str.charAt(indx));
    // return;

    // }
    // System.out.println(str.charAt(indx));
    // printRev(str, indx-1);
    // }
    // public static void main(String[] args) {
    // String str = "abcd";
    // printRev(str, str.length()-1);
    // }









    // find the first and last accurance of an element in string

    // we will keep our first and last indexes value in static form so it changes
    // again and again in mmory
    // public static int first = -1;
    // public static int last = -1;

    // public static void getIndices(String str, char el, int idx) {
    // if (idx == str.length()) {
    // return;
    // }
    // if (str.charAt(idx) == el) {
    // if (first == -1) {
    // first = idx;
    // } else {
    // last = idx;
    // }
    // }
    // getIndices(str, el, idx + 1);
    // }

    // public static void main(String args[]) {
    // String str = "tabcdfghijakkk";
    // char el = 'a';
    // getIndices(str, el, 0);
    // System.out.println("First occurence : " + first);
    // System.out.println("Last occurence : " + last);
    // }









    // check if an array is sorted ( strictly increasing)

    // public static boolean isSorted(int arr[], int idx) {
    //     if (idx == arr.length - 1) {
    //         return true;
    //     }
    //       // the array is sorted
    //       if (arr[idx] < arr[idx + 1]) {
    //         return isSorted(arr, idx + 1);

    //     } else {
    //         return false;

    //     }
    // }

    // public static void main(String[] args) {
    //     int arr[] = { 1, 2, 3 };
    //     System.out.println(isSorted(arr, 0));
    //     ;
    // }
    // // time complexity of this arr is big = O(n)  (depends on arr lengt)













    // Qno ; move all the "x" to the end of the string  = "axbcxxd"

    // Zamzam here we make recursive function keep this in mind :

    // public static void moveX (String str , int indx, int count, String newString){

    //     // base case
    //     if (indx == str.length()) {
    //         for( int i=0; i<count ; i++){
    //             newString += 'x';
    //         }
    //     System.out.println(newString);
    //     return;
            
    //     }
    //     // to find the character at string 

    //     char currChar = str.charAt(indx);
    //     if (currChar == 'x') {
    //         count++;
    //         moveX(str, indx+1, count, newString);
    //     }else{
    //         newString += currChar;
    //         moveX(str, indx+1, count, newString);
    //     }
    // }

    // public static void main(String[] args) {
    //     String str = "axbcxxd";
    //     moveX(str, 0, 0, "");

    //     // time complexity is = O(n) = string length basically
    // }








    //  Remove duplicates in a string = abbcdda


}
