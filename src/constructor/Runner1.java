package constructor;

public class Runner1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  Employee E1 = new Employee();
		  E1.Name="Mike";
		  E1.EmpID= 1000;
		  E1.Department ="HR";
		  System.out.println(E1.Name);
		  System.out.println(E1.EmpID);
		  System.out.println(E1.Department);
		  
		  Employee E2 = new Employee();
		  E2.Name= "Jack";
		  E2.EmpID = 1001;
		  E2.Department="HR";
		  E2.Display();                     // using method no need to write printing statements again and again.
		   
		  Employee E3 = new Employee("Abhijeet", 1145, "Purchase");  // using parametrized constructor we can initialize objects.
		  E3.Display();
		  
		  Employee E4 = new Employee ("Vaibhav", 1234, "Purchase");
		  E4.Display();

	}

}
