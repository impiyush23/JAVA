import java.util.Scanner;

public class UserInput {
    /*
     public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your name and age :");
            String name = sc.next();
            age = sc.nextInt();
            System.out.println("Name is:"+name);
            System.out.println("Age is :"+age);
     */
     /*
     public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your name and age :");
            String name = sc.next();
            int age = 0;
            if(sc.hasNextInt()){
                age = sc.nextInt();
            }
            System.out.println("Name is:"+name);
            System.out.println("Age is :"+age);
     */
    /*
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your name and age :");
            String name = sc.next();
            int age = 0;
            if(sc.hasNextInt()){
                age = sc.nextInt();
            }
            System.out.println("Name is:"+name);
            System.out.println("Age is :"+age);
    }
    */ // we can also use while (while we dont get any int type data loop should be run

     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter your name and age :");
         String name = sc.next();
         int age = 0;
         while(! sc.hasNextInt()){
             sc.next();
             age = sc.nextInt();
         }
         System.out.println("Name is:" + name);
         System.out.println("Age is :" + age);
     }
}

