public class practiceQuestions {

    public static void printArray(int array[]){
        for (int i=0; i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }

    // To print the given array in descending order
    //1st Bubble sort
    public static void bubbleSortD(int array[]){
        for(int i =0; i<array.length-1;i++){
            for(int j=0; j<array.length-1-i;j++){
                if(array[j]<array[j+1]){
                    int temp = array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
        
    }
    // selection sort descending order 
    public static void selectionSortD(int array[]){
        
        for(int i=0;i<array.length-1;i++){
            int  smallest=i;
            for(int j=i+1;j<array.length;j++){
                if(array[j]>array[smallest]){
                    smallest=j;
                }
            }
            int temp= array[i];
            array[i]=array[smallest];
            array[smallest]=temp;
        }
    }

    //Insertion Sort

    public static void insertionsSortD(int array[]){
        for (int i=1; i<array.length;i++){
            int temp=array[i];
            int prev= i-1;
            while(prev>=0 && array[prev]<temp){
                array[prev+1]=array[prev];
                prev--;
            }
            array[prev+1]=temp;
        }
    }

    //Counting Sort descending order
    public static void countSortD(int array[]){
        int maxNumb=Integer.MIN_VALUE;
        for(int i=0; i<array.length;i++){
            maxNumb=Math.max(array[i],maxNumb);
        }

        int count[]=new int[maxNumb+1];
        for(int i=0; i<array.length;i++){
            count[array[i]]++;
        }

        int j=0;
        for(int i=count.length-1; i>=0; i--){
            while(count[i]>0){
                array[j]=i;
                j++;
                count[i]--;
            }
        }
    }


    public static void main(String[] args) {
        int unsorted[]={3,6,2,1,8,7,4,5,3,1};
        countSortD(unsorted);
        printArray(unsorted);
    }
}
