public class pairsArray {
    public static void pairSet(int array[]){
        int totalPairs=0;
        for (int i=0; i<array.length;i++){
            int current=array[i];
            for(int j=i+1; j<array.length;j++){
                System.out.print("("+current+","+array[j]+") ");
                totalPairs++;
            }
            System.out.println();
        }
        System.out.println(totalPairs);
    }

    public static void main(String arg[]){
        int numbers[]={1,2,3,4,5,6};
        pairSet(numbers);
    }
}
