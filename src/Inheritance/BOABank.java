package Inheritance;

public class BOABank extends Bank {        // Child Class
 public int CreditCardNum;
 
 public void ccbalance() {
	 
	 System.out.println(" inside a CC Balance");
 }
 // method overriding
 public void CloseAccount(int CreditCardNum) {
	 System.out.println("inside BOABank class");
 }
 
}
