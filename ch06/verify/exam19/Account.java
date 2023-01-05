package e_java.ch06.verify.exam19;

public class Account {
   private int balance;
   int MIN_BALANCE = 0;
   int MAX_BALANCE = 1000000;

   public int getBalance() {
      return balance;
   }

   public void setBalance(int balance) {
      if (balance > MIN_BALANCE && balance < MAX_BALANCE) {
         this.balance = balance;
      }
   }
}
