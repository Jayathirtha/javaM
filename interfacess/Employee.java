package interfacess;

public class Employee implements IncomeTax {
	
	private double income;
	private double interest;
	private double incomeTax;
	private double interestTax;//coz income is what you get and interest is what you save and govt takes tax on what you save as well
	private double totalTax; 
	
	public Employee(double income, double interest) {
		super();
		
		
		this.income = income;
		this.interest = interest;
		calcIncome();
		calcOtherSources();
		calcTax();
	}
	
	public double getIncome() {
		return income;
	}
	
	public void setIncome(double income) {
		this.income = income;
	}
	
	public double getIntrest() {
		return interest;
	}
	
	public void setIntrest(double intrest) {
		this.interest = intrest;
	}
	public void calcIncome() {
		
		incomeTax = 0.05 * income;
		
	}
	public void calcOtherSources() {
		interestTax = 0.1 * interest;
		
	}
	
	
	@Override
	public void calcTax() {
		totalTax = interestTax + incomeTax;
		
	}
	
	public void print()
	{
		System.out.println("---------------------------------");
		System.out.println("income tax : " + incomeTax);
		System.out.println("tax on savings = " + interestTax);
		System.out.println("Employee TAx = " + totalTax);
		System.out.println("---------------------------------");
	}
}

