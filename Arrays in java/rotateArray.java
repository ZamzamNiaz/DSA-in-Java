import java.util.*;
public class rotateArray {
    // QNO 4
// left rotate the array by one place
public static void rotateArr(int arr[], int n){
    int temp = arr[0];
    for(int i=0; i<n-1; i++){
        arr[i] = arr[i+1];
    }
     arr[n-1] = temp;
     for(int i=0; i<n; i++){
        System.out.print(arr[i] +" ");
     }
    }


public static void main(String[] args) {
    int arr[] = {1, 2,3, 4,5};
    int n = 5;
    rotateArr(arr, n);
}







// QNO 5 
   // left rotate an array by D places







   // QNO 6
   // move all the zeros to the end of array
}
