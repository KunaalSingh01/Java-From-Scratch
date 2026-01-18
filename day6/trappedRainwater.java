public class trappedRainwater {
    //To calculate the volume of water trapped between the given bars
    //Time Complexity=O(n);
    //Here we will use Auxiliary Arrays(Helping arrays)
    
    public static int trappedWater(int array[]){
        //Auxiliary Array to calculate left maximum boundary
        int leftMax[]= new int[array.length];
        leftMax[0]=array[0];
        for(int i =1; i<array.length;i++){
            leftMax[i]=Math.max(array[i], leftMax[i-1]);
        }
        //Auxiliary Array to calculate right maximum boundary
        int rightMax[]=new int [array.length];
        rightMax[array.length-1]=array[array.length-1];
        for(int i=array.length-2; i>=0; i--){
            rightMax[i]=Math.max(array[i], rightMax[i+1]);
        }
        //Loop to calculate trapped water
        int trappedLiquid=0;
        for (int i=0; i<array.length;i++){
            //1st we calculate water_level= minimum of (left maximum and right maximum)
            int waterLevel=Math.min(leftMax[i], rightMax[i]);

            //trapped water = (water_level) - (height of bar)
            // 1= width of bar  because area= trapped water * width
            trappedLiquid =  trappedLiquid + ((waterLevel- array[i])*1);
        }
        
        return trappedLiquid;
    }

    public static void main(String[] args) {
        int height[]={4,2,0,6,3,2,5};
        System.out.println(trappedWater(height));
    }
}
