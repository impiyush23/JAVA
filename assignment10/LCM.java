public class LCM {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int L;
        for( L=a>b?a:b ; L<a*b ;L++){
            if(L%a==0 && L%b==0)
                break;
        }
        System.out.println("LCM IS:"+L);

    }
}
