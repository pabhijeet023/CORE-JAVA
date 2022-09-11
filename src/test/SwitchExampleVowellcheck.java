package test;

public class SwitchExampleVowellcheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "clean world Green World";
		 int count=0;
		   for (int index=0; index<str.length();index++) 
		   {
			   char ch = str.charAt(index);
			   switch(ch){
			   case 'a':
			   case 'e':
			   case 'i':
			   case 'o':
			   case 'u':
				   count++;
				   break;
			   			}
		   }
			
			   System.out.println("the Vowell count is " + count);
			   								}
		  
			}
		   


