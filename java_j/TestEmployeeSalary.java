package java_mph;

public class TestEmployeeSalary {

	public static void main(String[] args) {
		EmployeeSalary EmpA = new EmployeeSalary(1, "Akshay", 20000);
		
		EmpA.setEmpName("vinod");
		
		EmpA.calcSalary();
		
		
		EmployeeSalary empB = new EmployeeSalary(2, "binod", 22000);
		
		empB.calcSalary();
		
	
	}

}
