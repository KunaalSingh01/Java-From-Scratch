import java.util.*;
public class function {
    // public static void calculateSum(){
    //     Scanner sc = new Scanner(System.in);
    //     int a= sc.nextInt();
    //     int b= sc.nextInt();
    //     int sum= a+b;
    //     System.out.println(sum);
    // }
    // public static int calculateProduct(int num1,int num2){
    //     int product = num1*num2;
    //     return product;

    // }
    public static int factorial(int num){
        int fact =1;
        for(int i = 1; i<=num;i++){
            fact*=i;
        }
        // System.out.println("factorial = "+ fact);
        return fact;
    }

    public static void Binomial(int n , int r){
        double n_fact=factorial(n);
        double r_fact= factorial(r);
        double k_fact= factorial(n-r);
        double Binomial= (n_fact/(r_fact*k_fact));
        System.out.println("Binomial coefficient  = "+ Binomial );
    }

    public static boolean Primecheck(int numb){
        
        
        if(numb<=1){
            return false;
        }else{
        for(int i =2 ; i<=Math.sqrt(numb); i++){
            if(numb%i==0){
                return false;
            }
        }
        }
        return true;

    }

    // range prime
    public static void rangePrime(int range){
        for(int i = 1; i<= range;i++ ){
            if(Primecheck(i)){
                System.out.print(i+" ");
            }
        }
    }

    //Binary to Decimal
    public static int bin_Deci(int bin){
        int deci=0;
        int j=0;
        while(bin>0){
            int last_Digit= bin%10;
            deci=(int)(deci+(last_Digit*(Math.pow(2, j))));
            bin=bin/10;
            j++;
        }
        return deci;
    }

    //Decimal to Binary
    public static void deci_Bin(int decimal){
        int value=0; int j=0;
        while(decimal>0){
            int last_Digit= decimal%2;
            value=(int)(value+last_Digit*(Math.pow(10, j)));
            decimal=decimal/2;
            j++;
        }

        System.out.println("BINARY = "+value);
    }

    
    public static void main (String arg[]){
        //calculateSum();
        /* 
        Scanner sc= new Scanner (System.in);
        int p=sc.nextInt();
        int q=sc.nextInt();
        int multiply= calculateProduct(p, q);
        System.out.println(multiply);

        */

        // factorial
        Scanner sc= new Scanner(System.in);
        // int value=sc.nextInt();
        // factorial(0);
        // factorial(value);
        //


        // BINOMIAL COEFFICIENT nCr= n!/r!(n-r)!

        //Binomial(2 ,3);
        
/* 
        // Prime no.
        int x=sc.nextInt();
        System.out.println(Primecheck(x));
        // print prime numbers till given range
        int range=sc.nextInt();
        rangePrime(range);
*/
/* 
        // Binary to decimal
        int bin=sc.nextInt();
        System.out.println(bin_Deci(bin));
*/
        //Decimal to Binary
        deci_Bin(8);
    }
}
