import java.util.*;
public class practiceQuestions {
    //Question 1:
    //Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct

    public static boolean repeatingValues(int array[]){
        for (int i = 0 ;i<array.length; i++){
            for(int j=i+1; j<array.length; j++){
                if(array[i]==array[j]){
                    return true;
                }
            }
        }
        return false ;
    }
    //Question 2:
    //binary search for partially sorted array eg.[4,5,6,7,0,1,2]
    public static int partialSortedBinary(int array[], int target){
        int start=0;
        int end= array.length-1;

        while(start<=end){
            int mid = start + (end-start)/2;
            if(array[mid]==target){
                return mid;
            }
            if(array[mid]>=array[start]){
                if(target>= array[start] && target<array[mid] ){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }else{
                if(target>array[mid] && target<=array[end] ){
                    start=mid+1;
                }else{
                    end=mid-1;
                }
            }

        }
        return -1;
    }
    //Question 3 :
    //Buying and selling stocks to get maximum profit:
    public static int buySellStock(int price[]){
        int maxProfit=0;
        int buyPrice=Integer.MAX_VALUE; // +infinity
        for(int i=0; i<price.length;i++){
            if(buyPrice<price[i]){
                int profit= price[i]-buyPrice;
                maxProfit=Math.max(maxProfit, profit);
            }else{
                buyPrice=price[i];
            }
        }
        return maxProfit;
    }

    //Question 4:
    //Trapping RainWater Problem:
    public static int trappingRainwater(int height[]){
        //Auxiliary leftMax array
        int leftMax[]=new int [height.length];
        leftMax[0]=height[0];
        for (int i=1; i<height.length;i++){
            leftMax[i]=Math.max(height[i], leftMax[i-1]);
        }

        //Auxiliary leftMax array
        int rightMax[]=new int[height.length];
        rightMax[height.length-1]=height[height.length-1];
        for (int i=height.length-2; i>=0;i--){
            rightMax[i]=Math.max(height[i], rightMax[i+1]);
        }

        // loop to Calculate trapped water
        int trappedWater=0;
        for(int i=0; i<height.length;i++){
            //calculate water level
            int waterLvl=Math.min(leftMax[i], rightMax[i]);
            trappedWater += ((waterLvl-height[i])*1);
        }
        return trappedWater;
    }
    //Question 5:
    // finding triplets and their sum using hashmap

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        //Question 1:
        
        int numbers[]={1,2,6,8,3,8};
        System.out.println(repeatingValues(numbers));
        
        //Question 2:
        int values[]={4,5,6,7,0,1,2};
        int target=sc.nextInt();
        System.out.println(partialSortedBinary(values, target));
        
        
        
        
        //Question 3 :
        int priceToday[]={7,6,5,4,3,2,1};
        System.out.println("Max Profit = "+buySellStock(priceToday));

         
        //Question 4:
        int height[]={6,5,4,3,2,1,0};
        System.err.println(trappingRainwater(height));


        //Question 5:
        // finding triplets and their sum using hashmap
    }
}
