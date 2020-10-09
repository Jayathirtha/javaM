package java_mph;

public class PrimeFinder {
	
	public boolean b = true;
	
	
	
	void checkPrime(int num) {
		
		for(int i = 2 ; i <= num/2 ; i++  ) {
			
			if(num % i == 0 ) {
				b = false;
				break;
			}
		}
			
		if (num == 1) {
	        System.out.println("1 is neither prime nor composite.");
	    }
	    else {
	        if (b)
	            System.out.println(num + "is a prime number." );
	        else
	            System.out.println( num +" is not a prime number.");
	    }
	}
	

}
