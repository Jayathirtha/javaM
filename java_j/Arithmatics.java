package java_mph;

public class Arithmatics {
	
	public double a;
	public double b;
	
	
	
	void evalNUm() {
		
		System.out.println("inside eval-----------------------------------------------");
		System.out.println("Num1 + Num2 = \n"+ (a+b));
		System.out.println("Num1 + Num2 = \n"+ (a+b));
		System.out.println("Num1 * Num2 = \n" + (a*b));
		System.out.println("Num1 / Num2 = \n" + (a/b));
		System.out.println("--------------------------------------------------------");
	}
	
	void addNum(double a, double b) {
		System.out.println("Num1 + Num2 = \n"+ (a+b));
	}
	
	void subNum(double a, double b) {
		System.out.println("Num1 - Num2 = \n" + (a-b));
	}
	
	void mulNum(double a, double b) {
		System.out.println("Num1 * Num2 = \n" + (a*b));
	}
	
	void divNum(double a, double b) {
		System.out.println("Num1 / Num2 = \n" + (a/b));
	}
}
