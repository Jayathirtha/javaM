package java_mph;
import java.util.Scanner;

public class TestAreaPV {

	public static void main(String[] args) {
		
		
		Area_P_V Apv = new Area_P_V();
		Perimeter p = new Perimeter();
		Volume v = new Volume();
		
	
		System.out.println("Enter your choice 	\n1:area\r\n"
							+ "2: perimeter\r\n"
							+ "3 : volume ");
			
		
		
		Scanner In = new Scanner(System.in);
		
		int i = In.nextInt(); 
	
		switch(i) {
		case 1:	Apv.area();
		case 2:	p.perimeter();
		case 3: v.volume();
		
		
		
		}
		In.close();
		
		
	}
	}


