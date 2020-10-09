package inheritance;

import interfacess.Employee;
import interfacess.Organization;

public class TestOrgEmpTax {

	public static void main(String[] args) {
		
		
		
	Organization o = new Organization(10000, 4000) ;
	o.print();
	Organization p = new Organization(12000, 4500) ;
	p.print();
	
	
	Employee E = new Employee(20000, 5000);
	
	E.print();
	
	}

}
