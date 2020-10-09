package java_mph;

public class EmployeeSalary {
	
	private int empId;
	private String empName;
	private double empBaseSalary;
	private double empHra;
	private double empDra;
	
	
	public EmployeeSalary(int empId, String empName, double empBaseSalary) {
		
		this.empId = empId;
		this.empName = empName;
		this.empBaseSalary = empBaseSalary;
		
	}
	
	
	public int getEmpId() {
		return empId;
	}


	public void setEmpId(int empId) {
		this.empId = empId;
	}


	public String getEmpName() {
		return empName;
	}


	public void setEmpName(String empName) {
		this.empName = empName;
	}


	public double getEmpBaseSalary() {
		return empBaseSalary;
	}


	public void setEmpBaseSalary(double empBaseSalary) {
		this.empBaseSalary = empBaseSalary;
	}


	public double getEmpHra() {
		return empHra;
	}


	public double getEmpDra() {
		return empDra;
	}

	

	public void calcSalary(){
		
		this.empHra = ((15 * this.empBaseSalary)/100);
		this.empDra = ((20 * this.empBaseSalary)/100);
		System.out.println("id : " + this.empId + "\nName : " + this.empName);
		System.out.println("HRA = " + this.empHra + "\nDRA = " + this.empDra +"\nBase salary  = " + this.empBaseSalary + "\n=>Total Salary = " + (this.empHra+this.empDra+this.empBaseSalary));
		System.out.println("----------------------------------------------------------------");
	}
	
	
	
	
}
