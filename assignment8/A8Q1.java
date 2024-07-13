public class A8Q1 {
    private int accountNumber;
    private String customerName;
    private double balance;
    private static float rateOfInterest;

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static void setRateOfInterest(float rateOfInterest) {
        A8Q1.rateOfInterest = rateOfInterest;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getCustomerName() {
        return customerName;
    }
    public double getBalance(){
        return balance;
    }

    public static float getRateOfInterest() {
        return rateOfInterest;
    }
    public double getSimpleInterest(int time){
        return balance*rateOfInterest*time/100;
    }
    public static void main(String[] args) {
        A8Q1 a1 = new A8Q1();
        a1.setAccountNumber(3967285);
        System.out.println(a1.getAccountNumber());
        a1.setCustomerName("AAYUSH");
        System.out.println(a1.getCustomerName());
        a1.setBalance(254000);
        System.out.println(a1.getBalance());
        A8Q1.setRateOfInterest(8.15f);
        System.out.println(A8Q1.getRateOfInterest());

        System.out.println(a1.getSimpleInterest(2));
    }

}
