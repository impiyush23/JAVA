package p2;
import p1.Account;
     public class Customer {
     private String customerName;
     Account account = new Account();
      // now methods of this class is able to use Accounts method
     public void deposit(double amt){
     account.setBalance(account.getBalance()+amt);
     }
     public void withdraw(double amt){
      if(account.getBalance()-amt>0)
       account.setBalance(account.getBalance()-amt);
      else
       System.out.println("Insufficient Balance");
     }
     public void checkBalance(){
      System.out.println("YOUR BALANCE IS:"+account.getBalance());
     }
     public Customer(String name, double initialBalance, int acc){
         //account= new Account();
         customerName=name;
         account.setBalance(initialBalance);
         account.setAccountNumber(acc);
     }
     public void displayCustomer(){
      System.out.println("Your Account is Opened");
      System.out.println("Account Holder:"+customerName);
      System.out.println("Account Number:"+account.getAccountNumber());
      System.out.println("Initial Balance:"+account.getBalance());
     }

      public static void main(String[] args) {
       Customer c1 = new Customer("Naveen",5000,39764482);
       c1.displayCustomer();
       c1.deposit(7000);
       c1.checkBalance();
       c1.withdraw(4000);
       c1.checkBalance();
       c1.withdraw(9000);
       c1.checkBalance();
      }

}
