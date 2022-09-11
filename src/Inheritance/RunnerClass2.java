package Inheritance;

public class RunnerClass2 {

	public static void main(String[] args) {
	
		Bank B1 = new Bank();   // Object of Bank Class
		B1.AccountBalance();
		
		int Bal = B1.Getbalance();
		System.out.println("The Balance is "+ B1.Getbalance());
		System.out.println("The balance is "+ Bal);
		 
		BOABank B2 = new BOABank();
		B2.ccbalance();
		B2.AccountBalance();        // object of Child class accessing 
									//method of parent class via inheritance.
	
	// Method Overriding
		
		B1.CloseAccount(123456);       // B1 belongs to Bank class
		B2.CloseAccount(123456);      // B2 belongs to BOA class
	
		BankOfIndia B3 = new BankOfIndia();
		B3.Account();
	
	}

}
