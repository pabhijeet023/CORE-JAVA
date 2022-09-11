package test;

import java.util.Scanner;

public class EvenNumcheck {

	public static void main(String[] args) {
		Scanner x1 = new Scanner(System.in);
		System.out.println("Enter any Number = ");
		int a=x1.nextInt();
		
		if(a%2==0) {
			System.out.println("the number is even");
		}
		else {
		
			System.out.println("the number is odd");
		}
	}

}
 