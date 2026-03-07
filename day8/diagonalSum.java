public class diagonalSum{
    public static int diagonalSum(int matrix[][]){
        int sum=0;
        /* 
        //TIME COMPLEXITY = O(n^2)
        for(int i=0; i<= matrix.length-1; i++){
            for(int j =0; j<=matrix[0].length-1;j++){
                //primary diagonal
                if(i==j){
                    sum+=matrix[i][j];
                }
                //secondary diagonal
                else if(i+j==matrix.length-1){
                    sum+=matrix[i][j];
                }
            }
        }
            */

        //time complexity = O(n)
        for(int i=0; i<= matrix.length-1;i++){
            //primary diagonal
            sum+=matrix[i][i];
            //secondary
            if(i!=matrix.length-1-i){
                sum+=matrix[i][matrix.length-1-i];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int matrix[][]={{1,2,3},{5,6,7},{9,10,11}};
        System.out.print(diagonalSum(matrix));
    }
}