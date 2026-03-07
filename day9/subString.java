public class subString {
    public static String subString(String str, int start, int end){
        String substr="";
        for(int i=start; i<end;i++){
            substr += str.charAt(i);
        }
        return substr;
    }
    public static void main (String arg[]){
        String word= "Hello Duniyaa";
        //System.out.println(subString(word, 6, 10));

        //inbuilt function .substring()
        System.out.println(word.substring(0, 5)); 
    }

    
}
