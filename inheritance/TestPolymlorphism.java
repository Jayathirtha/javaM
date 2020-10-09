package inheritance;

import java.util.Scanner;

public class TestPolymlorphism {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);

	    
	    
	    
	do {
		System.out.println("enter 1 for permanent or 2 for consultant");
		int ch = s.nextInt();
		switch (ch) {
		case 1: Employee e = new PermanentEmployee();
				System.out.println("enter empid and name");
				e.setEmpid(s.nextInt());
				e.setEmpname(s.nextLine());
				System.out.println("enter emp base sal");
				((PermanentEmployee) e).setBaseSal(s.nextDouble());
				
		case 2: System.out.println("enter empid and name");		
				Employee e = new ConsultantEmployee();
			break;

		default:System.out.println("enter 1 or 2");
			break;
		}
	}
		
	}

}
