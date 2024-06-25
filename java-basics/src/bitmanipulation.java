public class bitmanipulation {
    public static void main(String[] args) {
        int n =5;  //0101
        int pos = 2;
        int bitMask = 1<<pos;

        // for get bit
     if ((bitMask & n) ==0) {
        System.out.println("Bit is zero");
        
     }else{
        System.out.println("bit is one");
     } 

    // for set bit

      int m =5;  //0101
    int position = 2;
    int bitMask2 = 1<<pos;
    
    int newNumb2 = bitMask | n;
    System.out.println(newNumb2);

    // clear bit
    int num =5;  //0101
    int posi = 2;
    int bitMask3 = 1<<pos;
    int newBitMask = ~(bitMask);
    int newNumb = newBitMask & n;
    System.out.println(newNumb);

        }
}
