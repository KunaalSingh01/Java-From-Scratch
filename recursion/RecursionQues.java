public class RecursionQues {
        public static Boolean isSorted(int arr[], int i){
            if(arr[i]==arr.length-1){
                return true;
            }
            if(arr[i]>arr[i+1]){
                return false;
            }
            return isSorted(arr, i+1);
        }
        public static void main(String arg[]){
            int arr[]={1,3,6,1,8,9};
            System.out.println(isSorted(arr, 0));
    }
}
