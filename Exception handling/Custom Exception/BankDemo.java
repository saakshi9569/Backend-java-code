public class BankDemo
{
   public static void main(String args[]){
      CheckingAccount c=new CheckingAccount(101);
      System.out.println("Depositing $500...");
      c.deposit(500.00);
      try
      {
        System.out.println("\nWithdrawing $100...");
        c.withdraw(100.00);
        System.out.println("\nWithdrawing $100...");
        c.withdraw(600.00);
      }catch(InsufficientFundsException e){
        System.out.println("Sorry, but you are short $" + e.getAmount());
        e.printStackTrace();// Printing exception details
      }
   }
}
/* Creating a custom checked exception */
class InsufficientFundsException extends Exception
{
   private double amount; // Stores the amount of money that is missing
   public InsufficientFundsException(double amount){ // Constructor to initialize the missing amount
      this.amount=amount;
   }
   public double getAmount(){ // Returns the missing amount
      return amount;
   }
}
/*-------CheckingAccount--------- */
class CheckingAccount{
   private double balance;// Stores the current account balance
   private int number;// Stores the account number
   public CheckingAccount(int number)  // Constructor to initialize the account number
   {
      this.number=number;
   }
   public void deposit(double amount){ // Method to deposit money into the account
      balance +=amount;
   }
   // Method to withdraw money from the account
   // throws declares that this method may throw an exception
   public void withdraw(double amount) throws InsufficientFundsException
   {
      if(amount<=balance){
         balance -=amount;
      }else{
         double needs=amount-balance;
         throw new InsufficientFundsException(needs);// Throwing a custom exception with the missing amount
      }
   }
   public double getBalance(){  // Returns the current account balance
      return balance;
   }
   public int getNumber(){  // Returns the account number
      return number;
   }
}
/*
Depositing $500...

Withdrawing $100...

Withdrawing $100...
Sorry, but you are short $200.0
InsufficientFundsException
	at CheckingAccount.withdraw(BankDemo.java:47)
	at BankDemo.main(BankDemo.java:12)

*/
