import java.util.*;
public class Array {

    //function with array
    public static void updateArrays(int Scores[], int notArray){
        notArray=15;
        for(int i=0;i<Scores.length;i++){
            Scores[i]+=10;
        }
    }
    public static void main(String arg[] ){
        Scanner sc= new Scanner(System.in);
        // Create operation in ARRAYS:
        int marks[]=new int[10];
        int num[]={1,2,3};
        String fruits[]={"apple","mango","orange"};

/* 
        // Input operation for arrays
        String subj[]=new String[10];
        subj[0]=sc.nextLine();
        subj[1]=sc.nextLine();
        subj[2]=sc.nextLine();


        //Output operations in Arrays:
        System.out.println("subjects are : "+subj[0]+ " "+subj[1]+" "+subj[2]);

 
        //to print length of array:
        System.out.println("Total length of array subjects = " + subj.length);
*//* 
        //Update operations in Arrays:
        System.out.println(num[0]);
        num[0]=num[1];
        System.out.println(num[0]);
        System.out.println((num[0]+num[1])/2);
*/


        // PASSING ARRAYS AS ARGUMENTS:
        // NOTE::IT FOLLOWS CALL BY REFERENCE:
        int testScore[]={35,80,76};
        int notArray=80;
        updateArrays(testScore,notArray);
        for(int i=0; i< testScore.length;i++){
            System.out.println("Scores : " + testScore[i]);
            System.out.println(notArray);
        }


    }
}
