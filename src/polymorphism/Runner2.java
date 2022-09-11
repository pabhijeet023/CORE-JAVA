package polymorphism;

public class Runner2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overloading1 E5 = new Overloading1();
		  int Rectanglearea = E5.getarea(4,5);
		  int squarearea = E5.getarea(5);
		  float sqarea = E5.getarea(4.6f);
		  System.out.println(squarearea);

	}

}
