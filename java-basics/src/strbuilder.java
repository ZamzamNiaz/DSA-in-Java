public class strbuilder {
    public static void main(String[] args) {
        
StringBuilder sb = new StringBuilder("zamzam niaz");
 
// get the charachte at any index

sb.charAt(0);
System.out.println(sb);

// set charachter at any index

sb.setCharAt(0, 'j');
System.out.println(sb);


// insert any charachter 

 sb.insert(0, "mallah");
 System.out.println(sb);

// you can delete any char at certain index

sb.delete(0, 4);
System.out.println(sb);

// you cann append any char 

sb.append('m');
sb.append('a');
sb.append('l');
sb.append('l');
sb.append('a');
sb.append('h');

System.out.println(sb.length());


    }
}
