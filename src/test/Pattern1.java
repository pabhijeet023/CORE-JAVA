package test;

public class Pattern1 {

	public static void main(String[] args) {
		int n =4;
		int m= 4;
		for ( int i =1; i<=n; i++) {
			
			for ( int j=1; j<=m; j++) {
				System.out.print("* ");
				
			}
			System.out.println();
			
			
		} System.out.println();
		
		for (int x=1; x<=5;x++) {
			
			int y= 1;
			while ( y<=x) {                  // y<= 5  for square matrix,  y<=x  triangular matrix
				System.out.print("* ");
				y++;
						  }
			System.out.println();
		} 
	}

}
