package abstrcat;

public class TestAbstract {

public static void main(String[] args) {
	
	Shape s = new Circle("cir1" , 4.5f);
	
	s.printShape();
	
	
	Shape s1 = new Rectangle("r1",4f,5f);
	
	s1.printShape();
	
}

}
