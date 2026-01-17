import java.util.*;
public class patterns {
    public static void main(String[] args) {
        
    
    Scanner sc= new Scanner(System.in);

    /* 
    //print right angle triangle
    int key=sc.nextInt();
    for(int i=1;i<=key;i++){
        for (int j=1; j<=i;j++){
            System.out.print("*");
        }
        System.out.println(" ");
    }
        */

/* 
        // upside-down triangle (star pattern):
        int line=sc.nextInt();
        int use=line;
        for(int i=1; i<=line;i++){
            for(int j=use ; j>=1 ;j--){
                System.out.print("*");
            }
            System.out.println();
            use--;
        }
*/
/* 
        //print right triangle but with numbers
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            for (int j=1; j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }

        */

        //right angle triangle with continuous alphabets
        int c=sc.nextInt();
        char use= 'A';
        for(int i=1; i<=c;i++){
            for(int j=1; j<=i;j++){
                System.out.print(use); 
                use++;
            }
            System.out.println();
        }

}
}