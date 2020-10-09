package java_mph;

public class ReportCard {
	private String grade;
	private double percentage;
	
	public ReportCard() {
		super();
	}
	
	
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public double getPercentage() {
		return percentage;
	}
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	
	public ReportCard(String grade, double percentage) {
		super();
		this.grade = grade;
		this.percentage = percentage;
	}
	
	public void calcGrade(){
		
		if(this.percentage <= 40.0 ) {
			this.grade = "failed";
			System.out.println("Result = failed\n");
		}
		else if(this.percentage > 40.0  && this.percentage <= 60.0 ) {
			this.grade = "second class";
			System.out.println("Result = second Class\n");
		}
		else if(this.percentage > 60.0  && this.percentage <= 75.0 ) {
			this.grade = "first class";
			System.out.println("Result = First Class\n");
		}
		else {
			this.grade = "distinction";
			System.out.println("Result = Distinction\n");
		}

		System.out.println("=========================================================");
		
		}
	
}
