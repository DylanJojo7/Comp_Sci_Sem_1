import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What name would you like to use?");
        
        String name = sc.next();
        
        System.out.println("How many times would you like to output " + name + "?");
        
        int numTime = sc.nextInt();
        
        int numRan = 0;
        
        while (numTime > numRan) {
        	numRan = numRan + 1;
        	
        	System.out.println(name);
        	
        }
        	  


		
	}
}
