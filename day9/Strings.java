import java.util.*;
public class Strings {
    //String is used to store text.
    //String is Immutable.
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        char arr[]={'a','b','c','d','e'};
        System.err.println(arr);

        String name="Kunaal";
        String lastName= new String("Singh");
        String fullName= sc.nextLine();
        // Concatenation in String
        // concatenation is used to connect multiple variables/Stings together.
        // Simply by using '+' sign
        System.out.println(name+"\n"+lastName+"\n"+fullName);
        System.out.println(fullName.length());  // .length() in string is a function not a property like array that is why "()" are used.

        //.charAt(); function: it is used to get a single character from the string at a given Index.
        System.out.println(fullName.charAt(3));
        
    }
}
