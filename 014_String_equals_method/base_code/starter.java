import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
	 Scanner sc = new Scanner(System.in);
        
        boolean x = true;
        
        while (x == true) {
            x = false;
            System.out.println("Do you want to be a wizard, warrior, or rogue?");
            String choice = sc.nextLine();
        
        
            if (choice.equalsIgnoreCase("Wizard")) {
                System.out.println("Are you sure you want to be a Wizard?");
                String newChoice = sc.nextLine();
                
                if (newChoice.equalsIgnoreCase("Yes")) {
                    System.out.println("Your choice has been selected.");
                } else if (newChoice.equalsIgnoreCase("No")) {
                    System.out.println("Repick your choice.");
                    x = true;
                } else {
                    System.out.println("Invalid input entered. Please use Yes or No next time when confirming.");
                    x = true;
                }
            } else if (choice.equalsIgnoreCase("Warrior")){
                System.out.println("Are you sure you want to be a Warrior?");
                String newChoice = sc.nextLine();
                
                if (newChoice.equalsIgnoreCase("Yes")) {
                    System.out.println("Your choice has been selected.");
                } else if (newChoice.equalsIgnoreCase("No")) {
                    System.out.println("Repick your choice.");
                    x = true;
                } else {
                    System.out.println("Invalid input entered. Please use Yes or No next time when confirming.");
                    x = true;
                }
            } else if (choice.equalsIgnoreCase("Rogue")) {
                System.out.println("Are you sure you want to be a Rogue?");
                String newChoice = sc.nextLine();
                
                if (newChoice.equalsIgnoreCase("Yes")) {
                    System.out.println("Your choice has been selected.");
                } else if (newChoice.equalsIgnoreCase("No")) {
                    System.out.println("Repick your choice.");
                    x = true;
                } else {
                    System.out.println("Invalid input entered. Please use Yes or No next time when confirming.");
                    x = true;
                }
            } else {
                System.out.println("Please pick a valid choice.");
                x = true;
            }
        
        }
    }
}



