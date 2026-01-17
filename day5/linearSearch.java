import java.util.*;
public class linearSearch {

    //Linear search = simple searching of 1 memory block at a time till the no. is found
    // time complexity = O(n)
    public static int linearSearch(int array[], int key){
        for (int i=0; i<array.length; i++){
            if (array[i]==key){
                return i;
            }
        }
        return -1;
    }

    public static int linearSearch(String array[], String key){
        for(int i=0; i<array.length;i++){
            if(array[i].equals(key)){
                return i;
            }
        }
        return -1;
    }

    public static void main (String arg[]){
        Scanner sc= new Scanner (System.in);

        //Linear search array numbers
        int marks[]={15,20,36,25,49,50,17,33};
        int find=20;
        int index= linearSearch(marks,find);
        if(index==-1){
            System.out.println("not found");
        }else{
            System.out.println("number is found at "+ index );
        }

        // linear search with string
        String fruits[]={"apple","banana","mango","pineapple","orange","pear","kiwi"};
        System.out.print("Search the fruit in the list: ");
        String fnd=sc.nextLine();
        int indx=linearSearch(fruits,fnd);
        if (indx==-1){
            System.out.println("not found");
        }else{
            System.out.println(fnd+" found at index : "+ indx);
        }


    }
}
