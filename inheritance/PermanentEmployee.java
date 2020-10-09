package inheritance;

public class PermanentEmployee extends Employee {
	protected double baseSal;
	protected double hra;
	protected double da;
	protected double bonus;

	

	public PermanentEmployee(int empid, String empname, double baseSal, double hra, double da, double bonus) {
		super(empid, empname);
		this.baseSal = baseSal;
		
		this.bonus = bonus;
	}

	public PermanentEmployee() {
		// TODO Auto-generated constructor stub
	}

	

	public double getBaseSal() {
		return baseSal;
	}

	public void setBaseSal(double baseSal) {
		this.baseSal = baseSal;
	}

	public double getHra() {
		return hra;
	}

	

	public double getDa() {
		return da;
	}

	

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	
	public void calcHraDa() {
		this.hra = ((20 * this.baseSal)/100);
		this.da = ((15 * this.baseSal)/100);
	}
	
	public void calTotalSalaryPermanent() {
		calcHraDa();
		this.setSalary((this.baseSal + this.hra + this.da));
		
	}

	public void print() {
		calTotalSalaryPermanent();
		System.out.println("Employee id:" + getEmpid());
		System.out.println("Employee Name:" + getEmpname());
		System.out.println("HRA : " + getHra());
		System.out.println("DA : " + getDa());
		System.out.println("base salary: " + getBaseSal());
		System.out.println("----------------------------------------");
		System.out.println("total Salary permanent emp =>"+ getSalary()); //total sal id name and var particulr to class hra da
		System.out.println("----------------------------------------");
	}

}
