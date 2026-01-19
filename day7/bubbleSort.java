import java.util.*;
// time complexity O(n^2)
// works by swapping the with next value if 1st > next.
public class bubbleSort {
    public static void bubbleSort(int array[]){
        for(int i=0; i<array.length-1;i++){
            int swap=0;
            for(int j=0;j<array.length-1-i;j++){
                if(array[j]>array[j+1]){
                    //to check if we enter in this loop or not.
                    swap++;
                    //swap
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
            //for sorted array: 
            if(swap==0){
                break;
            }
        }
    }

    public static void printArray(int array[]){
        for(int i=0; i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }


    public static void main(String[] args) {
        int array[]={5,4,0,-7,3,1,2,1,5};
        bubbleSort(array);
        printArray(array);
    }
}
