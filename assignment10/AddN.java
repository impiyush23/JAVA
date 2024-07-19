public class AddN {
    public static void main(String[] args) {
        int sum = 0; // ALWAYS INITIALIZE BEFORE LOOP
        for(int i=0;i<args.length;i++){
            sum = sum + Integer.parseInt(args[i]);
            System.out.println(sum);
        }
    }
}
