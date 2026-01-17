import java.util.*;
public class reverseArray {

    // public static void reverseArray(int array[]){
        
    //     for (int i=(array.length)-1; i>=0;i--){
    //         System.out.print(array[i]);
    //     }
    // }

    //Reverse using swap
    public static void reverseArray(int array[]){
        int start=0; int end=array.length-1;
        while(start<end){
            int temp=array[start];
            array[start]=array[end];
            array[end]=temp;
            start++;
            end--;

        }
    }
    public static void main(String arg[]){
        int number[]={1,2,3,4,5,6};
        reverseArray(number);
        for (int i=0; i<number.length;i++){
            System.out.print(number[i]+" ");
        }
    }
}
