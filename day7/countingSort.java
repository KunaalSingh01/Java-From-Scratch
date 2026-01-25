public class countingSort{

    //Counting Sort
    //Time Complexity = O(n+range of array)

    // first we take the min and max and identify range (0-max)
    // We count the frequency of numbers in array[] and store their count it in count[]
    // then traverse count[] and push numbers according to count.

    public static void countSort(int array[]){
        
        int max=Integer.MIN_VALUE;
        for (int i=0; i<array.length;i++){
            max=Math.max(max,array[i]);
        }
        int count[]=new int [max+1];
        for(int i=0;i<array.length;i++){
            count[array[i]]++;
        }
        
        int j=0;
        for(int i=0; i<count.length;i++){
            while(count[i]>0){
                array[j]=i;
                j++;
                count[i]--;
            }
        }
    }
    

    public static void printArray(int array[]){
        for (int i=0; i<array.length; i++){
            System.out.print(array[i]+" ");
        }
    }

    public static void main(String[] args) {
        int numbers[]={1,4,1,3,2,4,3,7};
        countSort(numbers);
        printArray(numbers);
    }
}
