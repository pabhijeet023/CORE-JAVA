package test;

public class Primenumcheck {

	public static void main(String[] args) 
{
	 int num=26;
	 boolean flag = true;
  for(int i=2;i<num;i++) 
   {
	  int num2=num%i;
	  if(num2==0) 
	  {
		  System.out.println("the number is not prime");
		  flag=false;
		  break;
	  }
	  
   }
  	 if (flag==true) {
	  	System.out.println("the number is prime");
  	 				 }
  
    		
}
							}


