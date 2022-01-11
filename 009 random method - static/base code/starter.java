import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Random rand = new Random();
		System.out.println(rand.nextInt(10));
		
		
	
		int min = 1;
		int max = 100;
		
		int newValue = min + rand.nextInt(max);
		System.out.println(newValue);
		
		double mins = 2.5;
		double maxs = 3.5;
		
		double newValues = mins +(maxs-mins)* rand.nextDouble();
		System.out.println(newValues);
		
		double minss = 14.0;
		double maxss = 589.0;
		
		double newValuess = minss +(maxss-minss)* rand.nextDouble();
		System.out.println(newValuess);
	}
}
