package test;

public class ExceptionExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1,2,3,4,5,6};
		int num = 5;
		
		try {	
			int rem= num/0;      //          as exception is on int rem, it will directly execute the catch block for it & will not execute 2 nd line.
			System.out.println(array[7]);
		}
		catch (ArrayIndexOutOfBoundsException e ) {           // e is a object
			System.out.println(" iside the catch block");
		}
		catch (ArithmeticException e) {
			System.out.println("inside the arithmatic catch block");
		}
		
		finally {                                        // this will be always executed irrespective of exception.
		 System.out.println("hello World");
		}
		 System.out.println("hi hello");
		
	}

}
