public class lexicographicOrder {
    public static void lexicoOrder(String array[]){
        String largest = array[0];
        for(int i=1; i<array.length;i++){
            if(largest.compareTo(array[i])<0){
                largest= array[i];
            }
        }
        System.out.println("largest value in alphabetic order = "+ largest );
    }
    public static void main (String arg[]){
        String fruits[] ={"apple","banana","mango","pear"};
        lexicoOrder(fruits);

    }
}
