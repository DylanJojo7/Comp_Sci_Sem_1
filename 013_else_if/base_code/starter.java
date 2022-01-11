import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner scan = new Scanner(System.in);
			Random r = new Random();
			int randomNum = 1 +r.nextInt(1000);
			System.out.println("Guess a number 1-1000.");
			int enteredValue = scan.nextInt();
			scan.close();
				
				if (enteredValue < randomNum) {
					System.out.println("Your guess was: " + enteredValue + ". your answer is lower than the number " + randomNum + ".");
					
				}
					
					 else if (enteredValue>randomNum) {
					System.out.println("Your guess of " + enteredValue + " your answer is higher than the number " + randomNum + ".");
				}
					else if (enteredValue==randomNum) {
					System.out.println("Your guess of " + enteredValue + " is correct");
					
				}
				
	}
}
