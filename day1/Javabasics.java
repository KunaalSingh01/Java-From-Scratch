package day1;
import java.util.*;
public class javabasics{
    public static void main(String arg[]){
        Scanner sc= new Scanner (System.in);
        /* 

        System.out.print("This is my first code.");
        System.out.println("why is this in same line?");
        System.out.println("I used 'ln' to change to next line ");
        System.out.print("or\nwe\ncan\nuse\n'BACKSLASH n'");


        //now we understand variables
        int a=5;
        int b = 10;
        int product= a*b;
        System.out.println("THE product of a and b is:" + product);
        String name = "Kunal";
        System.out.println("My name is :"+ name);
        */

        /* 
        // now we see different data types

        // 1. byte 1 byte [-128 to 127]
        byte z= -127;
        System.out.println(z);

        //2. short 2 byte [larger than byte smaller than int]
        short y= -32768;
        System.out.println(y);

        //3. int 4 byte [-2B to 2B]
        int x= 2000000000;
        System.out.println(x);

        //4. long 8 byte 
        long w=2100000000;
        System.out.println(w);

        //5. float 4 byte [decimal ];
        // as java is by default double we use casting to write float
        float v= 2.67f;
        System.out.println(v);

        //6.double 8 byte [larger decimal java is by default double ]
        double u=999.999;
        System.out.println(u);

        //7. boolean 2 byte [ true false]
        boolean t= true;
        System.out.println(t);

        //8.char 2 byte :  is used to write charaters in "" [@#$%^&*'A-z''numbers']
        char s= '@';
        System.out.println(s); 
        */


        /* 
        //Type conversion
        //compatible
        //destination > source

        int p = 2;
        float o= p;
        System.out.print(o);


        double i= sc.nextFloat();
        System.out.println(i);
        

        //its possible but tere is precision loss so not recommended
        long z= 1234567890;
        float y=z;
        System.out.println(y);
        */

        /* */
        // type casting

        float m = 2.43f;
        int n= (int) m;
        System.out.println(n);

        char l= '@';
        int k=l;
        System.out.println(k);

        char j='9';
        float g=j +3;
        System.out.println(g);



    }    

}