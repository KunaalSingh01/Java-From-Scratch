package day1;
import java.util.*;
public class pq {
    public static void main (String srg[]){
        Scanner sc = new Scanner (System.in);
        
        /* 
        //Q1.In a program,input 3numbers:A,BandC.You have to output the average of these 3 numbers.
        System.out.println("TO get the average of 3 numbers:");
        System.out.print("Enter first number:");
        double a = sc.nextDouble();
        System.out.print("Enter second number:");
        double b = sc.nextDouble();
        System.out.print("Enter third number:");
        double c = sc.nextDouble();
        double avg = (a+b+c)/3;
        System.out.println("The average is:"+ avg);
        */

        /* 
        //to find are of the square:
        System.out.print("Enter the side of the square:");
        double s = sc.nextDouble();
        double area = s*s;
        System.out.println("Area of  square is:"+ area);
        */

        /* 
        //to add cost of 3 items  and add 18% gst to it
        System.out.print("Enter cost of pen:");
        float pen = sc.nextFloat();
        System.out.print("Enter cost of pencil:");
        float pencil = sc.nextFloat();
        System.out.print("Enter cost of eraser:");
        float eraser = sc.nextFloat();
        float total = pen + pencil + eraser;
        float gst = 0.18f * total;
        float price = gst + total;
        System.out.println("the price of all items = "+price);
        */

        // data type of result
        byte b = 4;
        char c = 'a';
        short s =512;
        int i = 1000;
        float f = 3.14f;
        double $1d = 99.9954;
        double result =(f*b)+(i%c)-($1d*s);
        System.out.println(result);

    }
}
