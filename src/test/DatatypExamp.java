package test;

public class DatatypExamp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num1=10, num2=20;
int sum=num1+num2;
int mult = num1*num2;
float div=(float) num1/num2;                         // Casting
System.out.println("The sum of the number is "+sum);
System.out.println("The sum of the number is "+mult);
System.out.println("The div of the number is "+ div);

String str1 = "Clean World Green World";
System.out.println(str1);
System.out.println("The length of the string is "+str1.length());         // to print the length of string

char ch1 = str1.charAt(0);                                                // to print 1st character of string
System.out.println("The first character is "+ch1);

char ch2= str1.charAt(str1.length() -1);                                  // to print the last character of the string
System.out.println("the last char of the string is "+ch2);

System.out.println("the uppercase string is "+ str1.toUpperCase());        // to convert the string into uppercase
System.out.println("the lowercase string is "+ str1.toLowerCase());        // to convert the string into lowercase

	}

}
