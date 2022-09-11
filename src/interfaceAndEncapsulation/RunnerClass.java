package interfaceAndEncapsulation;

import abstraction.Browser;
import abstraction.Chrome;
import polymorphism.Overloading1;

public class RunnerClass {

	public static void main(String[] args) {
  

	
	// Interface Implementation
	HondaCar car1 = new HondaCar();
	car1.Start();
	
	CarInterface car2 = new HondaCar();
	car2.Start();
	
	// Encapsulation
	
	EncapsulationEx En = new EncapsulationEx();
	En.setBalance(30000);                     // to initiqlize balance
	System.out.println(En.getBalance());     // to print balance
	
	
	
	}

}
