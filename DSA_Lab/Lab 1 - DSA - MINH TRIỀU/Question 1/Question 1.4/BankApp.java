public class BankApp {
   public static void main(String[] args) {
      BankAccount ba1 = new BankAccount(100.00); // create acct

      System.out.print("Before transactions, ");
      ba1.display(); // display balance

      ba1.deposit(74.35); // make deposit
      ba1.withdraw(20.00); // make withdrawal

      System.out.print("After transactions, ");
      // ba1.display(); // display balance
      double money = ba1.getBalance();
      System.out.println(money);

      BankAccount ba2 = new BankAccount(0);
      double transfer = ba1.getBalance();
      ba1.withdraw(transfer);
      ba2.deposit(transfer);

      System.out.println("Total in account 1: " + ba1.getBalance());
      System.out.println("Total in account 2: " + ba2.getBalance());
   } // end main()
} // end class BankApp
