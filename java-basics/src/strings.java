import java.util.*;
public class strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your string");
        String name = sc.nextLine();
        System.out.println(name);

        String firstName= "Zamzam ";
        String lastName = "Niaz Ahmed";
        String fullName = firstName+ lastName;
        System.out.println(fullName);

        //  for printing the length of character:

        for (int i= 0; i<fullName.length(); i++){
            System.out.println(fullName.charAt(i));
        }


        // Take an array of Strings input from the user & find the cumulative (combined) length of all those strings.
 

    //  Scanner sc = new Scanner(System.in);
    //  System.out.println("Print an array of Strings");
    //  String arr = sc.nextLine();

    //  for (int i=0; i<arr.length(); i++){
    //     System.out.println(arr.charAt(i));
    //  }
    //    System.out.println("The length of string is " + arr.length());


    // Input a string from the user. Create a new string called ‘result’ in which you will replace the letter 
    // ‘e’ in the original string with letter ‘i’. 
    
    // Scanner sc = new Scanner(System.in);
    // System.out.println("Give a string as an input : ");
    // String size = sc.next();


    // String result = "";
    // for(int i =0; i<size.length(); i++){
    //     if(size.charAt(i) == 'e') {
    //         result += 'i';
    //       } else {
    //         result += size.charAt(i);
    // }

    
    // }
    // System.out.println(result);

    // Input an email from the user. You have to create a username from the email by deleting
    //  the part that comes after ‘@’. Display that username to the user.


    // Scanner sc = new Scanner(System.in);
    // System.out.println("Enter your email : ");
    // String mail = sc.nextLine();
    // String userName ="";

    // for(int i =0; i<mail.length();i++ ){
    //     if (mail.charAt(i) == '@') {
    //         break;
    //     }else {
    //         userName += mail.charAt(i);
    //       }
   
    // }
    // System.out.println(userName);


}
}
