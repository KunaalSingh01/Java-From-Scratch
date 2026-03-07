public class practiceQues {
    // print no. of 7's in 2D array
    public static int repeatValueCount(int matrix[][], int key){
        int count=0;
        for(int i=0; i<matrix.length;i++){
            for(int j=0; j<matrix[0].length;j++){
                if(matrix[i][j]==key){
                    count++;
                }
            }
        }
        System.out.println("total key value present = "+ count);
        return count;
    }

    // print sum of second row of array
    public static int sumOfRow(int nums[][]){
        int j=0; int sum=0;
        while(j<nums[0].length){
            sum+=nums[1][j];
            j++;
        }
        return sum;
    }
    // find transpose of the matrix.
    public static void transpose(int matrix[][]){
        for(int i = 0 ; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                System.out.print(matrix[j][i]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String arg[]){
        int matrix[][]={ {4,7,8},{8,8,7} };
        int key=8;
        // System.out.println(repeatValueCount(matrix, key));

        int nums[][]= { {1,4,9},
                        {11,4,3},
                        {2,2,3} };
        // System.out.println(sumOfRow(nums));
        // transpose(nums);

    }

}
