public class BankApp {
    public static void main(String[] args) {
       BankAccount ba1 = new BankAccount(100.00); // create acct
 
       System.out.print("Before transactions, ");
       ba1.display(); // display balance
 
       ba1.deposit(74.35); // make deposit
       ba1.withdraw(20.00); // make withdrawal
 
       System.out.print("After transactions, ");
       double returned_cash = ba1.printBalance();
       System.out.println(returned_cash);
       BankAccount ba2 = new BankAccount(0);
       double move = ba1.printBalance();
       ba1.withdraw(move);
       ba2.deposit(move); 
       System.out.println("Cash_account 1: " + ba1.printBalance());
       System.out.println("Cash_account 2: " + ba2.printBalance());
    } // end main()
 } // end class BankApp
 