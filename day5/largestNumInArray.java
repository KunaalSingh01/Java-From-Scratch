// for finding largest number in array
import java.util.*;

public class largestNumInArray {
    public static int findLargest(int array[]){
        int largest=Integer.MIN_VALUE;
        for (int i=0; i<array.length;i++){
            if(array[i]>largest){
                largest=array[i];
            }
        }
        return largest;
    }
    public static void main(String arg[]){
        int numbers[]={100,2,3,6,89,99,5,3,5,-777,32};
        System.out.println(findLargest(numbers));
    }
}