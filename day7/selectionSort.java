import java.util.*;
//SELECTION SORT
//Time Complexity : O()
//We find the smallest and swap it with the current first (ith) value.
// it eliminates extra swaps of bubble sort
// consider smallest as index not array value.
public class selectionSort {
    public static void selectionSort(int array[]){
        for(int i=0; i<array.length-1;i++){
            int smallest=i;
            for(int j=i+1;j<array.length;j++){
                if(array[j]<array[smallest]){
                    smallest=j;
                }
            }
            int temp=array[i];
            array[i]=array[smallest];
            array[smallest]=temp;
        }
    }

    public static void printArray(int array[]){
        for (int i=0; i<array.length; i++){
            System.out.print(array[i]+" ");
        }
    }

    public static void main(String[] args) {
        int unsorted[]={5,4,1,3,2};
        selectionSort(unsorted);
        printArray(unsorted);
    }
}
