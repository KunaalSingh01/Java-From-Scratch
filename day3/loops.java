import java.util.*;
public class loops {
    public static void main (String arg[]){
        Scanner sc = new Scanner (System.in);
        /* 
        // to print hello 10 times using while loop
        int counter=0;
        while(counter<10){
            System.out.println("hello");
            counter++;
        }

        */
/* 
        // print from 1 to n using while loop
        
        int pointer=1;
        System.out.print("Enter the value of n : ");
        int n=sc.nextInt();
        while(pointer<=n){
            System.out.print(pointer+" ");
            pointer++;
    
        }
*/
/* 
        //sum of first n natural numbers
        int num =1;
        System.out.print("enter the number: ");
        int range= sc.nextInt();
        int sum=0;
        while(num<=range){
            sum=sum+num;
            num++;
        }
        System.out.println("sum is : "+sum);
*/
/* 
//even number print
        int i=1; 
        int n = sc.nextInt();
        while (i <= n) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            } 
            i++;
            
        }
*/
/* 
//to print a square pattern using for loop
        int square= sc.nextInt();
        for(int i=1; i<=square;i++){
            for(int j=1; j<=square;j++){
                System.out.print("*");
            }
            System.out.println();
        }
*/
/* 
//to print a hollow square


        int hollow=sc.nextInt();
        for(int i=1; i<=hollow;i++){
            if(i==1 || i==hollow){
                for(int j=1; j<=hollow;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
            else{
            System.out.print("*");
            for(int j=1; j<=(hollow-2);j++){
                System.out.print(" ");
            }
            System.out.println("*");
            }
        }

        */
/* 
        // print reverse of a number

        int num= sc.nextInt();
        while(num>0){
            int a=num%10;
            System.out.print(a);
            num=num/10;
        }
*/
/* 
        //store a reverse number

        int n=sc.nextInt();
        int i=0;
        while(n>0){
            int lastdigit=n%10;
            i=(i*10)+lastdigit;
            n=n/10;
        }
        System.out.println("reverse : "+i);

        */
/* 
        //keep asking for user input (numbers) till user input multiple of 10

        do{
            
            System.out.print("Enter the number :");
            int numb=sc.nextInt();
            if(numb%10==0){
                
                break;
            }
        }while(true);
        System.out.println("loop exit");
        */


        // //to  print 1 to n but not the multiple of 5

        // int n =sc.nextInt();
        // for(int i=0; i<=n; i++){
        //     if(i%5==0){
        //         continue;
        //     }
        //     System.out.print(i+" ");
        // }
/* 
        // to print table of a number

        System.out.print("Enter a number : ");
        int q= sc.nextInt();
        for (int i =1; i<=10;i++){
            System.out.println((q)+" * "+(i)+" = "+(q*i));
        }
            */
/* 
        //to find if a number is prime or not


        int check= sc.nextInt();
        if(check==2){
            System.out.println("Its a prime number");
        }else{

                boolean isPrime=true;
            for(int i =2; i<=Math.sqrt(check);i++){
                if(check%i==0){
                    isPrime=false;
                }
            }
            if (isPrime==true){
                System.out.println("it's a prime no.");
            }else{
                System.out.println("Not a Prime no.");
            }
        }
            */
/* 
        // factorial print
        int ok= sc.nextInt();
        int fact=1;
        for (int i=1; i<=ok; i++){
            fact=fact*i;
        }
        System.out.println("factorial of "+ ok +" is : "+ fact);
        */
        
        
        
        //to ask for values for values add add even values together and odd values together
        int x=0; int y=0;int choice;
        do {

            System.out.print("enter number :");
            int n= sc.nextInt();
            
            if(n%2==0){
                x=x+n;
            }else{
                y=y+n;
            }
            System.out.println(" 1 = continue ; 0 = end : ");
            choice=sc.nextInt();


        }while (choice==1);
        System.out.println("sum of even numbers is : "+ x);
        System.out.println("sum of odd numbers is : "+ y);



    }
}
