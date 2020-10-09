package java_mph;
import java.util.Scanner;
import java.lang.Math;

public class Area_P_V{
	public double length = 0.0;
	public double width = 0.0;
	public double height = 0.0;
	public double side = 0.0;
	public double radius = 0.0;
	public int repeat = 0;
	
	@SuppressWarnings("unused")
	 void area()
	{
		Scanner In = new Scanner(System.in);
		
		System.out.println("Enter to find area of\n 1: circle\r\n"
						+ "2: square\r\n"
						+ "3: rectagle");
		
		int c = In.nextInt(); 
		
		switch(c) {
		case 1: circleA();
		case 2: squareA();
		case 3: rectangleA();
		}
		
		
		
		In.close();
		
	}

	private void rectangleA() {
		Scanner In = new Scanner(System.in);
		System.out.println("Enter Length and width \n");
		
		length = In.nextDouble();
		width = In.nextDouble();
		
		System.out.println("Area of Circle with radius " + radius + " is " + length * width );
		In.close();
	}




	private void circleA() {
		Scanner In = new Scanner(System.in);
		System.out.println("Enter radius \n");
		
		radius = In.nextDouble();
		
		System.out.println("Area of Circle with radius " + radius + " is " + (Math.PI * Math.pow(radius,2) ));
		
		In.close();
		
	}
	
	private void squareA() {
		
		Scanner In = new Scanner(System.in);
		System.out.println("Enter side \n");
		
		side = In.nextDouble();
		
		System.out.println("Area of Square with Side " + side + " is " + Math.pow(side,2));
		In.close();
		
	}


























	





	





	
}
