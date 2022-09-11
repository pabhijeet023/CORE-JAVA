package test;

public class Arrayexample {

	public static void main(String[] args) {
		
		int [] array1 = {10,20,30,40,50};   // declaration of array
		System.out.println("total number in this array are "+array1.length);             // print the length of array
		System.out.println("the second number in the array is "+array1[1]);              // print the second number in array
		
		System.out.println("the Last number in the array is "+array1[array1.length-1]);     // print the last number in the array
		
		String[] array2 = {"abc","pqr","xyz"};                                               // declaration of String array
		
		
		String str2="Clean World Green World";
		String[] array3 = str2.split(" ");                                                // to split a string into string array
		System.out.println("the third word of the string array is "+ array3[2]);
		for (int num1:array1) {                                              // for each loop.
			System.out.println(num1);
		}
		
	}

}
