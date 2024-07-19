public class HCF {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int H=0;
        for(H=a<b?a:b; H>=1;H--){     // or H= Math.min(a, b) can also be use
            if(a%H==0&&b%H==0) {
                break;
            }
        }
        System.out.println("HIGHEST COMMON FACTOR:"+H);

    }
}
