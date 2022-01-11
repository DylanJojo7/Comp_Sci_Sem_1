package files;
import java.util.Scanner;
import java.util.ArrayList;

public class starter {
	
	
	public boolean checkPrime(int i) {
		
		for (int d = 2; d < i; d ++) {
			if (i % d == 0) {
				return false;
			}
		}
		
		return true;
		
	}
	
	public void printPrimes(int i) {
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		for (int d = 2; d < i; d++){
			
			if (checkPrime(d)) {
				numbers.add(d);
			}
		}
		
		
		System.out.println("Prime Numbers less than " + i +":" + numbers.toString().replace('[', ' ').replace(']', ' '));
		
	}
	

}
