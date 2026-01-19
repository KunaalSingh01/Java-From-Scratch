public class buySellStock {
    public static int buySellStock(int currPrice[]){
        int buyPrice=Integer.MAX_VALUE;
        int maxProfit=0;
        for (int i=0; i<currPrice.length;i++){
            // for profit we sell only when selling>buying:
            if(buyPrice<currPrice[i]){
                int profit= currPrice[i]-buyPrice;
                maxProfit=Math.max(maxProfit, profit);
            }else{
                //update buyPrice
                buyPrice=currPrice[i];
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int price[]={7,1,5,3,6,4};
        System.out.println("Maximum profit = "+ buySellStock(price));
    }
    
}
