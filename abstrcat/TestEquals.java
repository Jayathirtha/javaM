package abstrcat;

public class TestEquals {

	public static void main(String[] args) {
				Circle c1 = new Circle("jai", 5);
				Circle c2 = new Circle("jai", 5);
				
				
				System.out.println(c1.equals(c2));//true
				System.out.println(c1.equals("jai")); //false as jai is plain String obj not circle or shAPE
				
				
				
				
				Rectangle r2 = new Rectangle("jai" ,0f,0f);
				
				Rectangle r1 = new Rectangle("jai",5f,6f);
				
				System.out.println(r1.equals(r2));//true 
				
				System.out.println(c1.equals(r1));//false [//obj instanceof Shape] [java.lang.ClassCastException: class abstrcat.Rectangle cannot be cast to class abstrcat.Circle]
	
	
				// test toString
				
				System.out.println(c1);
	
	
				// hashcode is noting but int for of hexa value present in obj adress
				
				System.out.println(r2); //abstrcat.Rectangle@41a4555e
				System.out.println(r2.hashCode());    //1101288798
				System.out.println(Integer.toHexString(1101288798)); //41a4555e == abstrcat.Rectangle@41a4555e
				System.out.println(Integer.toHexString(r1.hashCode()));
	} 

}
