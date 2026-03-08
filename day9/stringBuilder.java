import java.util.*;
public class stringBuilder{
// to convert the first letter of any word in a sentence to capitals;

    public static String upperCase(String str){
        StringBuilder sb= new StringBuilder ("");

        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for(int i=1 ; i<str.length();i++){
            if(str.charAt(i)==' '&& i<str.length()-1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }else{
                sb.append(str.charAt(i));
            }
        }

        return sb.toString();
    }
//to compress a given string i.e. aaabbc=a3b2c
    public static String compress(String str){
        StringBuilder sb=new StringBuilder("");
        

        for(int i=0; i<str.length();i++){
            Integer count=1;
            while( i<str.length()-1 && str.charAt(i)==str.charAt(i+1) ){
                count++;
                i++;
            }
            sb.append(str.charAt(i));
            if(count>1){
                sb.append(count);
            }

        }
        return sb.toString();

    }
    public static void main (String arg[]){
            // StringBuilder sb= new StringBuilder("");
            // for(char ch ='A'; ch<='z';ch++){
            //     sb.append(ch+" ");
            // }
            // System.out.print(sb);
            // System.err.println(sb.length());

            // String intro="hello, my name is kunaal ";
            // System.out.println(upperCase(intro));

            String letters= "aaabbcccdde";
            System.out.print(compress(letters));
    }

}