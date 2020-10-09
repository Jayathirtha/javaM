package inheritance;

public class Employee {
	private int Empid;
	private String Empname;
	private double salary;   // may be total sal
	
	public Employee(int empid, String empname) {
		super();
		Empid = empid;
		Empname = empname;
	}

	public Employee() {
		super();
	}

	public int getEmpid() {
		return Empid;
	}

	public void setEmpid(int empid) {
		Empid = empid;
	}

	public String getEmpname() {
		return Empname;
	}

	public void setEmpname(String empname) {
		Empname = empname;
	}

	public double getSalary() {
		return salary;
	}

	

	protected void setSalary(double salary) {
		this.salary = salary;
	}

	public void calculateSalary() {
		
	}
	
	public void print() {
		
		System.out.println("Employee id:" + Empid);
		System.out.println("Employee Name:" + Empname);
		
	}

	
}
