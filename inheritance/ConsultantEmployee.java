package inheritance;

public class ConsultantEmployee extends PermanentEmployee {
	private int numOfDays;
	private double chargePerDay;
	private double incentives;
  
	

	public ConsultantEmployee(int empid, String empname, double baseSal, double bonus, int numOfDays,
			double chargePerDay, double incentives) {
		super(empid, empname, baseSal, bonus);
		this.numOfDays = numOfDays;
		this.chargePerDay = chargePerDay;
		this.incentives = incentives;
	}

	public ConsultantEmployee() {
		// TODO Auto-generated constructor stub
	}

	

	public int getNumOfDays() {
		return numOfDays;
	}

	public void setNumOfDays(int numOfDays) {
		this.numOfDays = numOfDays;
	}

	public double getChargePerDay() {
		return chargePerDay;
	}

	public void setChargePerDay(double chargePerDay) {
		this.chargePerDay = chargePerDay;
	}

	public double getIncentives() {
		return incentives;
	}

	public void setIncentives(double incentives) {
		this.incentives = incentives;
	}
	
	
	
	
	public void calcTotalSalaryConsultant() {
		calcHraDa();
		 this.setSalary(((this.chargePerDay * this.numOfDays  ) + this.incentives));
		
	}

	public void print() {
		calcTotalSalaryConsultant();
		System.out.println("Employee id:" + getEmpid());
		System.out.println("Employee Name:" + getEmpname());
		System.out.println("base salary: " + getBaseSal());
		System.out.println("HRA : " + getHra());
		System.out.println("DA : " + getDa());
		System.out.println("number of days:" + getNumOfDays());
		System.out.println("----------------------------------------");
		System.out.println("Total salary =>" +  getSalary());
		System.out.println("----------------------------------------");
	}
}
