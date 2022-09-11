package test;

public class Breakkeywrd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 2;
		while (num<=10) {
			if (num==6) {                     // to exclude 6 from the list
							break;
			}else {
			System.out.println(num);}
			num = num+2;
				}
		System.out.println("After while loop");
	}
	

}
