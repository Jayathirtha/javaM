package java_mph;



public class Student{
	
	
	private int id;
	private String name;
	private ReportCard report;
	
	private Exam[] exam;
	private double totalMaxMarks;
	private double totalMarksObtained;


	public void setId(int id) {
		this.id = id;
	}



	public Exam[] getExam() {
		return exam;
	}



	public void setExam(Exam[] exam) {
		this.exam = exam;
	}



	public ReportCard getReport() {
		return report;
	}



	public void setReport(ReportCard report) {
		this.report = report;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public void caltotalMarks() {
		System.out.println("============details==================");
		for(Exam e : exam) {
			totalMarksObtained += e.getObtainedMarks();
			totalMaxMarks += e.getMaxMarks();
			e.printExamInfo();
			
		}
		calcPercentage();
		
	}


	
	public void calcPercentage() {
		System.out.println("============result==================");
		report.setPercentage((totalMarksObtained/totalMaxMarks) * 100);
		System.out.println("percentage = " + report.getPercentage() + "%");
		report.calcGrade();
		
		
	}
	
	
	
	
	
}
