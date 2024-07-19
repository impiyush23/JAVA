public class SumOfDigits {
    public static void main(String[] args) {
        int sum=0, rem;

        int num = Integer.parseInt(args[0]);
            while (num != 0) {
                rem = num % 10;
                sum= rem+sum;
                num = num / 10;
                System.out.println(rem);
            }
        System.out.println("SUM IS :"+sum);
        }
    }

