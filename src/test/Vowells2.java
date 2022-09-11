package test;

public class Vowells2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "clean world Green World";
		char[] array = {'a','p','e','x','o'};
		 int count=0;
		   for (int index=0; index<array.length;index++) {
			   
			   char ch =array[index];
			   if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' )
			   {
			   count++;
			   			}
		  
			}
		   System.out.println("the total number of vowells are " + count);

	}

}
