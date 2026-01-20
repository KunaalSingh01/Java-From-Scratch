public class insertionSort {
    public static void insertionSort(int array[]){
        for (int i=1; i<array.length;i++){
            int temp=array[i];
            int prev=i-1;
            // loop for checking the left values and comparing with temp
            while(prev>=0 && array[prev]>temp){
                //shifting to left
                array[prev+1]=array[prev];
                prev--;
            }
            //Insertion
            array[prev+1]=temp;
        }
    }

    public static void printArray(int array[]){
        for (int i=0; i<array.length; i++){
            System.out.print(array[i]+" ");
        }
    }
    
    public static void main(String[] args) {
        int nums[]= {5,4,1,3,2};
        insertionSort(nums);
        printArray(nums);
    }
}
