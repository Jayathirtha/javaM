package java_mph;

import java.util.Scanner;

public class Perimeter extends Area_P_V {
	
	
	@SuppressWarnings("unused")
	 void perimeter()
	{
		Scanner In = new Scanner(System.in);
		
		System.out.println("Enter to find perimeter of \n1: circle\r\n"
						+ "2: square\r\n"
						+ "3: rectangle");
		
		int c = In.nextInt(); 
		
		switch(c) {
		case 1: circleP();
		case 2: squareP();
		case 3: rectangleP();
		}
		
		
		
		In.close();
		
	}

	 void rectangleP() {
		
			Scanner In = new Scanner(System.in);
			System.out.println("Enter Length and width \n");
			
			length = In.nextDouble();
			width = In.nextDouble();
			
			System.out.println("perimeter of rectangle with length and width " + length+" " + width  + " is " + 2 * (length + width) );
			In.close();
		
	}

	private void squareP() {
		Scanner In = new Scanner(System.in);
		System.out.println("Enter side \n");
		
		side = In.nextDouble();
		
		
		System.out.println("perimeter of square with side " + side + " is " + (4 * side) );
		In.close();
	
		
	}

	private void circleP() {
		Scanner In = new Scanner(System.in);
		System.out.println("Enter radius \n");
		
		radius = In.nextDouble();
		
		
		System.out.println("perimeter of circle with radius " + radius  + " is " + (2 * Math.PI * radius) );
		In.close();
		
	}
	
		
}
