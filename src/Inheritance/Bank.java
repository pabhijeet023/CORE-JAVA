package Inheritance;

public class Bank {           // Parent Class
	public int AccountNum;
	
	public void AccountBalance(){
		System.out.println("Inside Account Balance");
		
		}
 public int Getbalance() {
	 return 100;
	  }
 //method overriding 
 public void CloseAccount(int AccountNum) {
	 System.out.println("inside Bank class");
 }
}
