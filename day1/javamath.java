package day1;
// now we will see input in java and perform few elementary math problems

import java.util.*;
public class javamath {
    public static void main (String arg[]){
        Scanner sc= new Scanner(System.in);
         
        // sum of 2 numbers
        /* 
        System.out.print("Enter first number:");
        int a= sc.nextInt();
        System.out.print("Enter second number:");
        int b= sc.nextInt();
        int sum= a+b;
        System.out.println("The sum of 2 numbers is:"+sum); 
        */

        //Product of 2 numbers
        /* 
        System.out.print("Enter first number:");
        int c=sc.nextInt();
        System.out.print("Enter second number:");
        int d= sc.nextInt();
        int product = c*d;
        System.out.println("Prouct of 2 number is: "+ product);
        */

        // To find Area of circle 3.14*radius**2
        System.out.print("Enter the radius of the circle: ");
        float r= sc.nextFloat();
        float area= 3.14f*r*r;
        System.out.println("Area of the circle is : "+ area);

        


    }
    
}
