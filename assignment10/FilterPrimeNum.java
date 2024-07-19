public class FilterPrimeNum {
    public static void main(String[] args) {
    int a,j;
        for(j=0;j<args.length;j++){
             a = Integer.parseInt(args[j]);
             int i;
             for(i=2; i<args.length;i++){
                 if(a%i==0)
                     break;
             }
             if(i==a)
                System.out.println("Prime No. :"+a);
        }

    }

}
