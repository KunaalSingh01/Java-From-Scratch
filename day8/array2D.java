import java.util.*;
public class array2D{
    // searching an a value O(n^2)
    // simple brute force search  
    public static boolean search2DArray(int array[][] , int key){
        for(int i=0; i<array.length;i++){
            for(int j=0; j<array[0].length;j++){
                if(key==array[i][j]){
                    System.out.println("found "+key+ " at index : "+ "("+i+","+j+")" );
                    return true;
                }
            }
        }
        return false;

    }
    // to search the largest number in matrix
    public static void largest2DArray(int array[][] , int key){
        int largest =Integer.MIN_VALUE;
        for(int i=0; i<array.length;i++){
            for(int j=0; j<array[0].length;j++){
                if(largest<array[i][j]){
                    largest=array[i][j];
                }
            }
        }
        System.out.println("largest number is : "+ largest );


    }
    

    public static void main(String[] args) {
        //Create a 2D Array
        int matrix[][]=new int[3][3];
        // to get size of rows
        int n= matrix.length; 
        // to get size of column ((matrix[0].length gives the size of [0] row which is equal to column))
        int m= matrix[0].length;

        //Input a 2D Array
        Scanner sc= new Scanner(System.in);
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                matrix[i][j]=sc.nextInt();
            }
        }

        //output the 2D Array
        for(int i=0;i<n;i++){
            for(int j=0; j<m;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        int key = 5;
        largest2DArray(matrix, key);

    }
}