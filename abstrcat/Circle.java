package abstrcat;

public class Circle extends Shape {

	float radius;

	public Circle() {

	}

	public Circle(String name, float radius) {
		super(name);
		this.radius = radius;
	}

	@Override
	public void findArea() {
		area = 3.14f * radius * radius;
	}

	public boolean equals(Object obj) { // cirlce s1, s1.equals("hhahahahahh") == flase as it dosent match
		// let s1.name = jai s1.equals("jai") ==fasle as string with other clss

		// s1.equals(234) == false
		// like u orderd coffe but gt different
		// but if u orderd any beverage u got cofffe then its ok i can drink it

		// can be instance of base or child but i dont want anything else

		return ((obj instanceof Circle) && (this.name == ((Circle) obj).name) ? true : false);
		// ((Shape)obj) explicite conversions
		// phase approach
		// im 1st checking passed thing "obj" is wether belongs to same class type or
		// not
		// (obj instanceof Shape) u will get exception
	}

	@Override
	public String toString() {
		findArea();
		return "Circle [radius=" + radius + ", area=" + area + ", name=" + name + ", toString()=" + super.toString()
				+ "]";
	}

	@Override
	public void printShape() {
		findArea();
		System.out.println("Radius= " + radius);
		super.printShape();
	}

}