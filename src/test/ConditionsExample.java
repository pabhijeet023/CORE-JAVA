package test;

public class ConditionsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=17;                                        // if else-if else statement
		if (a>=18) {
			
			System.out.println("you are eligible for Voting");
		}
		else if(a==17) {                                          // == assignment operator
			System.out.println("please try again next year");
		}
		else {
			System.out.println("you are not eligible for voting");    // cannot give condition in else block
		}
	}

}
