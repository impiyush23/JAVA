package world;
import java.time.LocalDateTime;
public class PrintRoot {
    public static void main(String[] args) {
        double x1,x2;
        int a=4,b=9,c=-1;
        x1 = (-b+Math.sqrt(b*b-4*a*c))/(2*a);
        x2 = (-b-Math.sqrt(b*b-4*a*c))/(2*a);
        System.out.println("Root 1st :"+x1+" ,"+"Root 2nd :"+x2);

    }
}
