package java_mph;

import java.util.Scanner;

public class Volume extends Area_P_V {
	
	private double height = 0;
	
	
	@SuppressWarnings("unused")
	 void volume()
	{
		Scanner In = new Scanner(System.in);
		
		System.out.println("Enter choice to find volume of \n1: circle\r\n"
						+ "2: square\r\n"
						+ "3: rectangle");
		
		int c = In.nextInt(); 
		
		switch(c) {
		case 1: circleV();
		case 2: squareV();
		case 3: rectangleV();
		}
		
		
		
		In.close();
		
	}

	private void rectangleV() {
		Scanner In = new Scanner(System.in);
		System.out.println("Enter Length and width and height \n");
		
		length = In.nextDouble();
		width = In.nextDouble();
		height = In.nextDouble();
		
		
		System.out.println("Volume of rectangle with length, width and Height " + length+" " + width + " " + height + " is " +  (length * width * height) );
		In.close();
		
	}

	private void squareV() {
		Scanner In = new Scanner(System.in);
		System.out.println("Enter side \n");
		
		side = In.nextDouble();
		
		
		
		System.out.println("Volume of square with side " + side + " is " + Math.pow(side,3) );
		In.close();
	}
		

	private void circleV() {
		Scanner In = new Scanner(System.in);
		System.out.println("Enter radius \n");
		
		radius = In.nextDouble();
		
		
		
		System.out.println("Volume of circle with radius " + radius + " is " + ((4.0/3) * Math.PI * Math.pow(radius , 3) ));
		In.close();
		
	}
}
