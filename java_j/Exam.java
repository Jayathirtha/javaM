package java_mph;

public class Exam {
	private String name;
	private double maxMarks;
	private double obtainedMarks;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getMaxMarks() {
		return maxMarks;
	}
	public void setMaxMarks(double maxMarks) {
		this.maxMarks = maxMarks;
	}
	public double getObtainedMarks() {
		return obtainedMarks;
	}
	public void setObtainedMarks(double obtainedMarks) {
		this.obtainedMarks = obtainedMarks;
	}
	
	
	public Exam(String name, double maxMarks, double obtainedMarks) {
		super();
		this.name = name;
		this.maxMarks = maxMarks;
		this.obtainedMarks = obtainedMarks;
	}
	
	public Exam() {
		// TODO Auto-generated constructor stub
	}
	public void printExamInfo() {
		System.out.println("Exam Name : " + this.name);
		System.out.println("Exam Maximum marks: " + this.maxMarks);
		System.out.println("Exam Obtained Marks : " + this.obtainedMarks);
	}
	
	
	

}
