package java_mph;

import java.util.Scanner;

public class VarieableArray {
	
	public void findSum(int...num) {
		int sum = 0;
		for(int i = 0;i<num.length ;i++) {
			sum += num[i];
		}
		System.out.println(sum);
	}

	
	public static void main(String[] args) {
		VarieableArray a = new VarieableArray();
		Scanner s = new Scanner(System.in);
		
		
		
		
		
		System.out.println("enter num");
		
		a.findSum(1,3,5,6,7,5,4,2);
	}
	

}
