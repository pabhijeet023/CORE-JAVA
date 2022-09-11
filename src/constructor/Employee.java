package constructor;

public class Employee {
	public String Name;
	public int EmpID;
	public String Department;
   public Employee() {
	   System.out.println(" this is a default constructor");
   }
   public Employee(String P1, int P2, String P3 ) {
	  Name=P1;     // if not used 'this' it will be taken java directly
	  EmpID=P2;
	  Department=P3;
   }
	public void Display() {
		System.out.println(Name);
		System.out.println(EmpID);
		System.out.println(Department);
	}
}
