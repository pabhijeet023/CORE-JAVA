package test;

public class Forloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int i;
   for (i=0;i<=100;i++) {
	   if(i==6) {
		   
		   continue;                // use of continue keyword to exclude specific number using If condition.
	   }
	   System.out.println(i);
   }
	}

}
