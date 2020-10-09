package abstrcat;

public class Rectangle extends Shape {
	
	float length;
	float width;
	



	public Rectangle(String name, float length, float width) {
		super(name);
		this.length = length;
		this.width = width;
	}

	public Rectangle() {
	
	}
	
	@Override
	public void findArea() {
		area = length * width;
			}
	
	
	
	@Override
	public boolean equals(Object obj) {
		
		return ((obj instanceof Rectangle) && (this.name == ((Rectangle) obj ).name)? true : false);
		//  ( obj ).name)? compliler freaks out as obj is written for general so we need to casst it same class before
	}
	
	@Override
	public void printShape() {
		findArea();
		System.out.println("area of rectangle = "+ area);
		super.printShape();
	}

}
