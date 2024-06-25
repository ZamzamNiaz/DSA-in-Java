public class linearSearch {
    //QNO 7
    // Linear search:
      public static int linearsearch(int arr[], int n, int numb){
        for(int i=0; i<n; i++){
            if (arr[i] == numb) {
                return i;
            }
          
        }
        return -1;
      }
    public static void main(String[] args) {
        int arr[] = { 1, 2,5, 6,4,3};
        int n =6;
        int numb = 10;
        System.out.println(linearsearch(arr, n, numb));
    
    }










    // QNO 8
    // Find the union and intersection of two sorted arrays

}
