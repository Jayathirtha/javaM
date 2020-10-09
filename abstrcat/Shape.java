package abstrcat;

public abstract class Shape {

	protected double area;
	String name;

	public Shape() {

	}

	Shape(String name) {
		this.name = name;
	}

	public abstract void findArea();


	

	public void printShape() {
		System.out.println("Name= " + name);
		System.out.println("Area= " + area);
	}

}
