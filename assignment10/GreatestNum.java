public class GreatestNum {
    public static void main(String[] args) {
        int j, num;
        int max = Integer.parseInt(args[0]); // first number
        for (j = 1; j < args.length; j++) {
            num = Integer.parseInt(args[j]); // 2nd number
            if(max < num) {
                max = num;
            }
        }
        System.out.println(max);
    }
}
