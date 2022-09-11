package test;

public class ReverseTheNumber {

	public static void main(String[] args) 
{
	int num = 456789;
	int res = 0;
	
	while (num>0) {
		int rem = num%10;   // 9  8    7 6    5  4
		res = res*10 + rem; // 9  90+8.....980+7  9870+6  98760+5   987650+4
		num = num/10;       // 45678  4567   456   45     4   0
					}
	System.out.println(res);
}

}
