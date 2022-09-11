package test;

public class Reversaexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  String str = " clean world green world";
  String result = " ";
   for(int index=str.length()-1;index>=0;index--) {
	   char ch = str.charAt(index);
	   result = result + ch;
   													}
	    
	   System.out.println(result);
   }
 
}


