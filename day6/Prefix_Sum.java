import java.util.*;
// Maxx SubArray Sum - II (Prefix Sum Method)

//Time Complexity= O(n^2)
public class Prefix_Sum{

    public static void prefixSum(int array[]){
        // calculate prefix sum array
        int largest=Integer.MIN_VALUE;int Prefix[]=new int[50];
        Prefix[0]=array[0];
        for (int i =1; i<array.length;i++){
            Prefix[i]=array[i]+ Prefix[i-1];
    }
    //calculate and compare sum:
    
    for(int i=0; i<array.length;i++){
        int start=i;
        for(int j=i;j<array.length;j++){
            int end=j;int sum=0;
            sum= start==0? Prefix[end]:Prefix[end]-Prefix[start-1];
            if(sum>largest){
            largest=sum;
        }
        }
        
    }
    System.out.println("largest = " + largest);
}

public static void main (String arg[]){
    int numbers[]= {-2,4,6,-8};
    prefixSum(numbers);
}
}
