package java_mph;

import java.util.Scanner;

public class ArrayEmployees {

	public static void main(String[] args) {
		Scanner In = new Scanner(System.in);
		System.out.println("enter total employees");

		Employee[] employees = new Employee[In.nextInt()];


		for(int i = 0 ; i <employees.length;i++){
			System.out.println("enter values for employee :" + (i+1));

			employees[i] = new Employee(In.nextInt(), In.next() , In.nextDouble());
		}


		//			for(int i = 0 ; i < employees.length;i++) {
		//		employees[i].empInfo();
		//			
		//
		//		}


		for(Employee emp : employees)
		{
			emp.empInfo();
		}


	}













}




