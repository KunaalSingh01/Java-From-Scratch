import java.util.*;
public class sumOfSubArray {

    //Max SubArray Sum I (Brute Force Method)
    //Time Complexity=O(n^3)
    public static void sumOfSubArray(int array[]){
        int tp=0; int largest=Integer.MIN_VALUE;
        for (int i=0; i<array.length ;i++){
            int start=i;
            for(int j=i; j<array.length;j++ ){
                int end=j; int sum=0;
                for(int k=start; k<=end ;k++){
                    System.err.print( array[k]+" ");
                    sum=sum+array[k];
                    
                }
                System.err.print("      sum = "+ sum);
                if(sum>largest){
                        largest=sum;
                    }
                tp++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("maximum sum = "+largest);
        System.out.println(tp);
    }

    public static void main(String arg[]){
        int numbers[]={2,-4,6,-8,};
        sumOfSubArray(numbers);
    }

}
