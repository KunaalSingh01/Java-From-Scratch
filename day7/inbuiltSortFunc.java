import java.util.Arrays; // for Inbuilt Sort 
import java.util.Collections; // for Inbuilt Sorting in reverse order 
public class inbuiltSortFunc {

    public static void printArray(int array[]){
        for (int i=0; i<array.length; i++){
            System.out.print(array[i]+" ");
        }
    }

    public static void printArray(Integer array[]){
        for (int i=0; i<array.length; i++){
            System.out.print(array[i]+" ");
        }
    }

    //TIME COMPLEXITY  OF INBUILT SORTING = O(n log n)
    public static void main(String[] args) {
        int array[]={5,4,1,3,2,-7};
        Arrays.sort(array);    // default ascending  sorting
        printArray(array);
        System.out.println();
        Arrays.sort(array,2,6);   // to select the (starting index) and (ending index) and sorting only that values
        printArray(array);

        // to print reverse order
        // Collections.reverseOrder : Does not work on primitive Data Types
        // so we will use object data Types (Non- Primitive)
        Integer arr[]={0,2,3,1,5,4};
        Arrays.sort(arr,2,6,Collections.reverseOrder());
        printArray(arr);



    }
}
