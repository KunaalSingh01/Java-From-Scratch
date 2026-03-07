import java.util.*;
public class shortestPathString{
    public static double shortestPath(String path){
        int y=0; int x=0;
        for(int i=0; i<path.length();i++){
            int direction= path.charAt(i);
            if(direction=='N'){
                y++;
            }
            else if(direction=='S'){
                y--;
            }
            else if(direction=='E'){
                x++;
            }
            else if(direction=='W'){
                x--;
            }
        }

        double X1=x*x;
        double Y1=y*y;

        double shortestDistance= Math.sqrt(X1+Y1);
        return shortestDistance;
    }
    public static void main (String arg[]){
        Scanner sc= new Scanner(System.in);
        String str=sc.next();
        System.out.println(shortestPath(str));
    }
}