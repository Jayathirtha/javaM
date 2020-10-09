package java_mph;

import java.util.Scanner;

public class TestEmployeeAdress {

	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		
		Employee emp = new Employee();
		
		
		Address a = new Address();
		
		System.out.println("enter Empl details id,name, salary\n");
		
		emp.setId(S.nextInt());
		emp.setName(S.next());
		emp.setSalary(S.nextDouble());
		
		System.out.println("enter adress state city pin code\n");;
		a.setState(S.next());
		a.setCity(S.next());
		a.setPincode(S.next());
		
		System.out.println("enter adress line \n");
		
		S.nextLine(); // collect residue one extra scan
		
		a.setLine(S.nextLine());
		
		
		emp.setAd(a);
		
		emp.empInfo();
		
		S.close();

	}

}
