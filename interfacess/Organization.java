package interfacess;

public class Organization implements GST {
	
	private double profit;
	private double turnover;
	private double expense;
	private double tax;
	private double cgst;
	private double sgst;

	public double getProfit() {
		return profit;
	}

	public void setProfit(double profit) {
		this.profit = profit;
	}

	public double getTurnover() {
		return turnover;
	}

	public void setTurnover(double turnover) {
		this.turnover = turnover;
	}

	public double getExpense() {
		return expense;
	}

	public void setExpense(double expense) {
		this.expense = expense;
	}

	public Organization() {
		// TODO Auto-generated constructor stub
	}

	public Organization(double turnover, double expense) {
		super();
		this.turnover = turnover;
		this.expense = expense;
	}
	
	

	@Override
	public void calcTax() {
		this.tax = (this.sgst + this.cgst);
		
		
		
	}

	public double getCgst() {
		return cgst;
	}

	public void setCgst(double cgst) {
		this.cgst = cgst;
	}

	public double getSgst() {
		return sgst;
	}

	public void setSgst(double sgst) {
		this.sgst = sgst;
	}

	public double getTax() {
		return tax;
	}

	
	private void calprofit() {
		this.profit = this.turnover- this.expense;// TODO Auto-generated method stub
		calcCGst();
		calSGst();

	}
	@Override
	public void calcCGst() {
		this.cgst = profit*0.09;// TODO Auto-generated method stub
		
	}

	@Override
	public void calSGst() {
		sgst = profit*0.09;// TODO Auto-generated method stub
		
	}
	
	public void print() {
		calprofit();
		calcTax();
		System.out.println("sgst = :" + sgst + "\ncgst = " + cgst);
		System.out.println("-------------------------------------------");
		System.out.println("Total tax org = "+ tax);
		// TODO Auto-generated method stub

	}

}
