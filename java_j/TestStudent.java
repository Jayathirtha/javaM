package java_mph;

import java.util.Scanner;

public class TestStudent {

	public static void main(String[] args) {

		Scanner s = new  Scanner(System.in);
		
		Student S1 = new Student();
		
		System.out.println("enter student id");
		S1.setId(s.nextInt());
		System.out.println("enter student name:");
		S1.setName(s.next());
		
		
		System.out.println("enter no of subjects");
		
		
		Exam[] e = new Exam[s.nextInt()];
		
		for(int i = 0 ; i<e.length; i++) {
			
			Exam e1 = new Exam();
			System.out.println("enter Subject: ");
			e1.setName(s.next());
			System.out.println("enter max marks ");
			e1.setMaxMarks(s.nextDouble());
			System.out.println("enter obtained marks ");
			e1.setObtainedMarks(s.nextDouble());
			
			e[i] = e1;
		}
			
		
		ReportCard r = new ReportCard();
		S1.setExam(e);
		S1.setReport(r);//create a plot or space before u build home
		S1.caltotalMarks();
		
		
		
	}
}


