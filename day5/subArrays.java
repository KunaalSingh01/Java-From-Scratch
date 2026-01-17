import java.util.*;
public class subArrays {
    public static void subArray(int array[]){
        int tp=0;
        for (int i=0; i<array.length ;i++){
            int start=i;
            for(int j=i; j<array.length;j++ ){
                int end=j;
                for(int k=start; k<=end ;k++){
                    System.err.print( array[k]+" ");
                    
                }
                tp++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println(tp);
    }

    //sum of sub array:
    public static void sumOfsubArray(int array[]){
        int tp=0; 
        for (int i=0; i<array.length ;i++){
            int start=i;
            for(int j=i; j<array.length;j++ ){
                int end=j;int sum=0;
                for(int k=start; k<=end ;k++){
                    System.err.print( array[k]+" ");
                    sum=array[k]+sum;
                }
                System.out.print("    sum = "+sum);
                tp++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println(tp);
    }

    public static void main(String arg[]){
        int numbers[]={1,2,3,4};
        sumOfsubArray(numbers);
    }

}
