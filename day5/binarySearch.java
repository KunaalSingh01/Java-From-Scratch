import java.util.*;
public class binarySearch {
    //Binary Search it uses the middle value to search for key
    // time complexity=O(log n)
    public static int binarySearch(int array[],int key){
        int start=0; int end=(array.length)-1;
        while(start<=end){
            int mid=(start+end)/2;
            if (array[mid]==key){
                return mid;
            }if(array[mid]<key){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return -1;
    }
    public static void main(String arg[]){
        int marks[]={1,2,3,4,5,6,7,8,9,10};
        int key=7;
        int index=binarySearch(marks,key);

        if (index==-1){
            System.out.println(" no.not found");
        }else{
            System.out.println("key found at : "+ index);
        }
    }
}
