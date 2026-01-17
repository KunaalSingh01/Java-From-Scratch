import java.util.*;
public class patterns2 {

    public static void hollowSquare(int sides){
        for(int i=1; i<=sides;i++){
            for(int j=1; j<=sides;j++){
                if(j==1||i==1||j==sides||i==sides){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void pyramiD(int size){
        for (int i=1; i<=size;i++){
            for (int j=1; j<=i;j++){
                System.out.print("x");
            }
            System.out.println();
        }
    }

    //inverted & rotated pyramid
    public static void invertedRPyramid(int size){
        for(int i=1; i<=size;i++){
            int k=1;
                while(k<=(size-i)){
                    System.out.print(" ");
                    k++;
                }
            for(int j=1; j<=i;j++){
                
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void invertNumPyramid(int size){
        for(int i=1; i<=size;i++){
            for (int j=1;j<=(size-i+1);j++){
                System.out.print(j);
            }
            System.out.println();
        }
    } 
    public static void fakeFloydTriangle(int size){
        int k=1;
        for (int i=1;i<=size; i++){   
            for (int j=1; j<=i;j++){
                if(i<=(size-1)){
                System.out.print(k+" ");
                k++;
                }else{
                    System.out.print(k);
                    k++;
                }
            }
            System.out.println();
        }
    }
    public static void triangle01(int size) {
        for(int i=1; i<=size;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
        
    }

    //BUTTERFLY PATTERN
    public static void butterFly(int size){
        for (int i=1; i<=size; i++){
            
                int m=1;
                while(m<=i){
                    System.out.print("* ");
                    m++;
                }
                int k=1;
                while(k<=(2 *(size-i))){
                    System.out.print("  ");
                    k++;
                }

                int n=1;
                while(n<=i){
                    System.out.print("* ");
                    n++;
                }
            
            System.out.println();
        }

        for (int i=size; i>=1; i--){
            
                int m=1;
                while(m<=i){
                    System.out.print("* ");
                    m++;
                }
                int k=1;
                while(k<=(2 *(size-i))){
                    System.out.print("  ");
                    k++;
                }

                int n=1;
                while(n<=i){
                    System.out.print("* ");
                    n++;
                }
            
            System.out.println();
        }
    }

    //RHOMBUS
    public static void rhomBus(int size){
        for(int i=1;i<=size; i++){
            int k=1;
            while(k<=(size-i)){
                System.out.print(" ");
                k++;
            }
            int j=1;
            while(j<=size){
                System.out.print("*");
                j++;
            }
            System.out.println();
        }
        
    }

    //HOLLOW RHOMBUS
    public static void hollowRhombus(int size){
        for(int i=1; i<=size; i++){
            for(int k=1; k<=(size-i); k++){
                System.out.print(" ");
            }
            for(int j=1; j<=size;j++){
                if(i==1||i==size||j==1||j==size){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

        //Diamond PATTERN
        public static void diaMond(int size){
            //FULL PYRAMID
            for(int i=1; i<=size; i++){
                for(int k=1; k<=(size-i);k++){
                    System.out.print(" ");
                }
                for(int j=1;j<=(2*i)-1;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
                //REVERSE FULL PYRAMID
            for(int i=size; i>=1; i--){
                for(int k=1; k<=(size-i);k++){
                    System.out.print(" ");
                }
                for(int j=1;j<=(2*i)-1;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }

        //hollow diamond
        public static void hollowDiamond(int size){
            //FULL PYRAMID
            for(int i=1; i<=size; i++){
                for(int k=1; k<=(size-i);k++){
                    System.out.print(" ");
                }
                for(int j=1;j<=(2*i)-1;j++){
                    if(j==1||j==(2*i)-1){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
                //REVERSE FULL PYRAMID
            for(int i=size; i>=1; i--){
                for(int k=1; k<=(size-i);k++){
                    System.out.print(" ");
                }
                for(int j=1;j<=(2*i)-1;j++){
                    if(j==1||j==(2*i)-1){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    public static void main(String arg[]){
        Scanner sc= new Scanner(System.in);
/*
        //print square.
        int a=sc.nextInt();
        for (int i=1; i<=a; i++){
            for(int j=1; j<=a; j++){
                System.out.print("* ");
            }
            System.out.println("");
        }

        //print rectangle
        int length=sc.nextInt();
        int breadth=sc.nextInt();
        for (int i =1; i<=breadth; i++){
            for (int j=1; j<=length;j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
         */
/* 
        // HOLLOW RECTANGLE
        int length=sc.nextInt();
        int breadth=sc.nextInt();
        for(int i=1; i<=breadth; i++){
            for(int j= 1; j<=length; j++){
                if(j==1||i==1||j==length||i==breadth){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
                
            }
            System.out.println("");
        }
   */ /*     
        // HOLLOW SQUARE
        int sides= sc.nextInt();
        hollowSquare(sides);
*/ /* 
        //Pyramid
        int size=sc.nextInt();
        pyramiD(size);
        //inverted & rotated Pyramid
     */ /* 
        // inverted rotated pyramid
        int bada=sc.nextInt();
        invertedRPyramid(bada);

        */

        // Invert pyramid with numbers
        // int size=sc.nextInt();
        // invertNumPyramid(size);

        // // fake floyd triangle
        // int size=sc.nextInt();
        // fakeFloydTriangle(size);

        //01 triangle
        // triangle01(7);
/* 
        //ButterFly
        butterFly(2);
        

        //Rhombus
        rhomBus(4);

        //HOLLOW RHOMBUS
        hollowRhombus(4);
*/
        //Diamond
        diaMond(5);
        //Hollow Diamond
        hollowDiamond(4);
    }
}
