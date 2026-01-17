package day2;
//condition statements
import java.util.*;

public class conditions {
    public static void main (String arg[]){
        Scanner sc= new Scanner (System.in);

        //If, Else
        //age >18

        /* 
        System.out.print("Eneter age:");
        int age = sc.nextInt();
        if (age >=18){
            System.out.println("You adult");
        }
        else{
            System.out.println("Not adult");
        }

        */

        /* 
        //largest of 3
        System.out.print("enter first number  = ");
        int a= sc.nextInt();
        System.out.print("enter second number = ");
        int b= sc.nextInt();
        System.out.print("enter third number  = ");
        int c= sc.nextInt();

        if (a>b && a>c){
            System.out.println(a +" is largest number");
        }
        if (b>a && b>c){ 
            System.out.println(b +" is largest number");
        }
        else{
            System.out.println(c +" is largest number");
        }
        */

        /* 
        //odd even
        System.out.print("Enter the number");
        int num= sc.nextInt();

        if (num%2==0){
            System.out.println(num +" is even number");
        } else{
            System.out.println(num +" is odd number");
        }
        */


        /* 
        //calculating income tax
        System.out.print("Enter your income in lakhs");
        int income=sc.nextInt();
        if (income<=5){
            System.out.println("0 tax");

        } else if (income>5 && income<=10){
            System.out.println(income*0.20f + "tax");

        }else if (income>10){
            System.out.println(income*0.30f + " lakh tax");
        }
            */

        /*
        // even odd using ternary operator
        int digit=sc.nextInt();
        String number=(digit%2==0)?"even":"odd";
        System.out.println("your digit is "+number);
        */
/* 
        // pass or fail using ternary
        System.out.print("enter marksout of 100 : ");
        int marks = sc.nextInt();
        String result= (marks>=33)?"pass":"fail";
        System.out.println("result = "+result);
*/
/* 
        //switch
        int elec=sc.nextInt();
        switch(elec) {
            case 1: System.out.println("fan turned ON");break;
            case 2: System.out.println("light turned ON");break;
            case 3: System.out.println("charging port turned ON");break;
            default: System.out.println("there are only 3 switches");
        }
*/
/* 
        // calculator
        System.out.print("enter 2 numbers");
        int p= sc.nextInt();
        int q = sc.nextInt();
        char operator= sc.next().charAt(0);
        
        switch (operator) {
            case '+': System.out.println("solution = "+ (p+q));
                break;
            case '-': System.out.println("solution = "+ (p-q));break;
            case '*':System.out.println("solution = "+ (p*q));break;
            case '/':System.out.println("solution = "+ (p/q));break;
            case '%':System.out.println("solution = "+ (p%q));break;    
        
            default:System.out.println("choose a correct operator +,-,*,/ or %");
                break;
                
        }
                */
        

    }
    
}
