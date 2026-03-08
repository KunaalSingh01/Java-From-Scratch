import java.util.*;
public class practiceQues {
    public static int vowelCount(String str){
        int count =0;
        for(int i=0; i<str.length();i++){
            char ch= str.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                count++;
            }
        }
        return count;
    }

    public static boolean anaGram(String str1, String str2){
        StringBuilder sb= new StringBuilder(str2);
        if(str1.length()!=str2.length()){
            return false;
        }
        for(int i=0; i<str1.length();i++){
            char ch=str1.charAt(i);
            boolean found=false;
            for(int j=0; j<sb.length();j++){
                if(ch==sb.charAt(j)){
                    sb.deleteCharAt(j);
                    found=true;
                    break;
                }
                
            }
            if(!found){
                return false;
            }
        }
        
        return true;
    }
    public static void main(String[] args) {
        String q1=" this is a random sentence with vowels in it. IT SHOuLD NOT COUNT CaPITAL VOWELS";
        System.out.println(vowelCount(q1));

        String q2_1="racer";
        String q2_2="caret";
        System.out.println(anaGram(q2_1, q2_2));

    }
}
