// Using Kandane's Algorithm to check the maximum sum of the sub array
//Time Complexity=O(n)
// does not work for arrays with all -ve values

public class Kadanes_Algo {
    public static void kadaneAlgo(int array[]){
        
        int maxSum=Integer.MIN_VALUE;
        int currentSum=0;

        for(int i=0; i<array.length;i++){
            //currentSum=array[i]+currentSum;
            // if(currentSum<0){
            //     currentSum=0;
            // }
            //for handling arrays with all -ve values
            currentSum=Math.max(array[i], array[i]+currentSum);
            
            maxSum=Math.max(currentSum, maxSum);
        }
        
        System.out.println("Max sum of sub arrays = "+ maxSum);
    }

    public static void main(String[] args) {
        int numbers[]={-2,-3,-7,-34,-8};
        kadaneAlgo(numbers);
    }
}

