public class IsPrime {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int i;
        for(i=2; i<=a-1; i++){
            if(a%i==0)
                break;
        } // end of loop
        if(i==a)
            System.out.println("PRIME");
        else
            System.out.println("NOT PRIME");
    }
}
