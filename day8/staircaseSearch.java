public class staircaseSearch {

    //Time Complexity= O(n+m)
    //if n>>m = O(n)
    //if m>>n = O(m)
    public static boolean staircaseSearch(int matrix[][], int key){
        int i =matrix.length-1; int j = 0;
        while (i>=0 && j<matrix[0].length){
            if(key==matrix[i][j]){
                System.out.println("key found at ("+i+","+j+")");
                return true;
            }
            else if(key>matrix[i][j]){
                j++;
            }
            else if(key<matrix[i][j]){
                i--;
            }
            
        }
        System.out.println("key not found");
        return false;
    }
    public static void main(String arg[]){

        int matrix[][]={{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};
        int key =3;
        System.out.println(staircaseSearch(matrix,key));
    }
}
