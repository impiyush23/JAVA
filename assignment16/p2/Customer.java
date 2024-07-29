package p2;

import p1.Account;

public class Customer {
        private Account account;
        private String customerName;
      public Customer(int acc,double initialBalance, String n){
            account = new Account();
            account.setAccountNumber(acc);
            account.setBalance(initialBalance);
            customerName=n;
        }
        public void deposit(double amt){
            account.setBalance(amt+account.getBalance());
        }
        public void withdraw(double amt){
            if(account.getBalance()-amt>0)
                 account.setBalance(account.getBalance()-amt);
            else
                System.out.println("Insufficient Balance");
        }
        public void checkBalance() {
            System.out.println("Bal :" +account.getBalance());
        }
        public static void main (String[] args){
        Customer c= new Customer(3976,4000,"Sonu");
        c.deposit(7000);
        c.checkBalance();
        c.withdraw(3000);
        c.checkBalance();
        c.withdraw(9000);
        c.checkBalance();
        }
}
