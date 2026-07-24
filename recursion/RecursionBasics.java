import java.util.*;
public class RecursionBasics{

    //To print number in descending order using recursion... 
    public static void printDec(int n){
        if(n==1){
            System.out.println(n);
            return ;
        }
        System.out.print(n+" ");
        printDec(n-1);
    }
    public static void printInc(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        printInc(n-1);
        System.out.print(n+" ");
    }

    // public static int factorial(int num){
    //     int fact=1;
    //     for (int i=1; i<=num; i++){
    //         fact=fact*i;
    //     }
    //     return fact;
    // }

    public static int fact(int num){
        if (num==0){
            return 1;
        }
        int fnm1=fact(num-1);
        int fn= num * fnm1;
        return fn;
    }
    // print sum of n natural numbers
    public static int add(int numb){
        if (numb==1){
            return 1;
        }
        int summ1=add(numb-1);
        int add = numb + summ1;
        return add;
    }

    public static int fibbo(int num){
        if (num==0 || num==1){
            return num;
        }
        int fib1=fibbo(num-1);
        int fib2=fibbo(num-2);
        int fibSum= fib1+fib2;
        return fibSum;
    }
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printDec(n);
        printInc(n);
        // System.out.println(factorial(4));
        System.out.println(fact(4));
        System.out.println(add(4));
        System.out.println(fibbo(6));
    }
}
