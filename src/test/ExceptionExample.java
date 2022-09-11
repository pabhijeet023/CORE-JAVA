package test;

public class ExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1,2,3,4,5,6};
		
	try {	System.out.println(array[7]);
	}
	catch (ArrayIndexOutOfBoundsException e ) {
		System.out.println(" iside the catch block");
	}
	 System.out.println("hi hello");
	}

}
