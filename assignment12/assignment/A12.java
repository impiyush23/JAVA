package assignment;
import java.util.Scanner;

public class A12 {
    Scanner sc;
    public void driver(){
        f7();            //FROM HERE I CAN RUN ANY FUNC(Provides: code orgaization, reusbility,
                         // modularity,encapsulation,abstraction,maintenance&testing
    }
    public void f1(){
        sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
            System.out.print(i+" ");
    }
    public void f3(){
        sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        for(int i=n;i>=1;i--)
            System.out.print(i+" ");
    }
    public void f4(){
        sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
            System.out.print(2*i-1+" ");
    }
    public void f5(){
        sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        for(int i=n;i>=1;i--)
            System.out.print(2*i-1+" ");
    }
    public void f6(){
        sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
            System.out.print(2*i+" ");
    }
    public void f7(){
        sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        for(int i=n;i>=1;i--)
            System.out.print(2*i+" ");
    }
    public void f8(){
        sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
            System.out.print(i*i+" ");
    }
    public void f9(){
        sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
            System.out.print(i*i*i+" ");
    }
    public void f10(){
        sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        for(int i=1;i<=10;i++)
            System.out.println(n+" x "+i+" = "+n*i);
    }

    public static void main(String[] args) {
        A12 a12 = new A12();
        a12.driver();  // calling from here
    }
}

