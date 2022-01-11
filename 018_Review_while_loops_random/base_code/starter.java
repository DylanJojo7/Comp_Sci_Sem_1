import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner scan = new Scanner(System.in);
		Random r = new Random();
		int randomNum = 1 +r.nextInt(1000);
		
		boolean x = true;
		
		while (x) {
			x = false;
			System.out.println("Guess a number 1-1000.");
			int enteredValue = scan.nextInt();
		
			if (enteredValue < randomNum) {
				System.out.println("Your guess was too low. Please guess a larger number.");
				x = true;
			} else if (enteredValue > randomNum) {
				System.out.println("Your guess was too high. Please guess a smaller number.");
				x = true;
			} else {
				System.out.println("You got it correct! Nice job.");
			}
		}
    }
}


		
	

