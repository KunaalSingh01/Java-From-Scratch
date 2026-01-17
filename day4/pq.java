import java.util.*;
public class pq {

            //Question 1 :Write a Java method to compute the average of three numbers.
    public static int avg(int num1, int num2 ,int num3){
        int avg=(num1+num2+num3)/3;
        return avg;
    }

    public static boolean isEven(int number){
        
        if (number%2==0){
            return true; 
        }else{
            return false;
        }
    }

                //method to check if a number is a palindrome or not
    public static void checkPalindrome(int value){
        int original=value;
        int rev=0;
        while(value>0){
            int last_digit=value%10;
            rev=(rev*10)+last_digit;
            value=value/10;
        }
        if (original==rev){
            System.out.println("It's a Palindrome");
        }else{
            System.out.println("It's not a Palindrome");
        }
    }
                //add digits of a number
    public static int addDigits(int num){
        int sum=0;
        while(num>0){
            int digit=num%10;
            sum=sum+digit;
            num/=10;
        }
        return sum;
    }
        
        
    
    public static void main (String arg[]){
        Scanner sc = new Scanner(System.in);
/* 
                //Question 1 :Write a Java method to compute the average of three numbers.
        int a= sc.nextInt();
        int b=sc.nextInt();
        int c= sc.nextInt();
        System.out.println(avg(a,b,c));
*/
/*
                // method for even on not
        System.out.print("Enter a number to see if its even : ");
        int number=sc.nextInt();
        System.out.println(isEven(number));
*/
/* 
                //method to check if a number is a palindrome or not
        System.out.print("Enter a number to check if it's palindrome or not :");
        int palin=sc.nextInt();
        checkPalindrome(palin);
*/
        // int a = 2;
        // int b= 34;
        // System.out.println(Math.abs( -23.813f));
        // System.out.println(Math.max(a,b));
        // System.out.println(Math.min(a,b));
        
                // to add the digits of a number
        int enter= sc.nextInt();
        System.out.println(addDigits(enter));


    }

}
