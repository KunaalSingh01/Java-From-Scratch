import java.util.*;
public class palindrome {
    public static boolean palinDrome(String pali){
        for(int i=0; i<pali.length()/2;i++){
            if(pali.charAt(i)!=pali.charAt(pali.length()-1-i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String pali="abc";
        System.out.println(palinDrome(pali));
        
    }
}
