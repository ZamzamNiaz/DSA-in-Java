public class arrayIntro {
    
public static void main(String[] args) {

    // QNO 1
    // print the largest element in array
    int n =5;
    int arr[] = {3, 2, 1, 5, 2};
    int largest = arr[0];

    for(int i =0; i<n; i++){
        if (arr[i] >largest) {
            largest = arr[i];
        }
    }
    System.out.println(largest);










// QNO 2
 
// find second largest element in an array , without sorting
//     int n = 6;
//     int secondLargest = -1;
//    int arr[] = {1, 2, 4,7, 7,5};
//    int largest = arr[0];
//    for(int i=0; i<n; i++){
//     if (arr[i] > largest) {
//         largest = arr[i];
//     }
//    }
//    for(int i=0; i<n; i++){
//     if (arr[i] > secondLargest && arr[i] != largest) {
//         secondLargest = arr[i];
//     }
    
//    }
//    System.out.println(secondLargest);
} 
}