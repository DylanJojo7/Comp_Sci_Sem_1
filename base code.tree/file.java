import java.util.Scanner;
import java.util.Random;
class Main {
    
    
    static Random r = new Random();
    static Scanner sc = new Scanner(System.in);
    static double dollars = 100.00;
    
    static double wagerAmount;


    public static void main(String args[]) {
        boolean x = true;
        boolean y = true;
        boolean z = true;
        while (x) {
            x = false;
            while (y) {
                y = false;
                System.out.println("How much would you like to wager?");
                wagerAmount = sc.nextDouble();

                
                if (wagerAmount > dollars) {
                    System.out.println("Please pick a wager amount less than or equal your amount of money.");
                    y = true;
                } else if (wagerAmount < 0) {
                    System.out.println("Please pick a wager amount greater than 0.");
                    y = true;
                }
            }
            
            int randOne = r.nextInt(2 - 1 + 1) + 1;
            int randTwo = r.nextInt(2 - 1 + 1) + 1;
            int randThree = r.nextInt(2 - 1 + 1) + 1;
            System.out.println("|"+ randOne+"|" + " " + "|"+randTwo+"|" + " " + "|"+randThree+"|");
            
            if (randOne == randTwo) {
                if (randTwo == randThree) {
                    dollars = dollars + (wagerAmount *10);
                    System.out.println("Your money has been tripled! You now have $" + dollars);
                } else {
                    dollars = dollars + (wagerAmount *10);
                    System.out.println("Your money has been doubled! You now have $" + dollars);
                }
            } else if (randTwo == randThree) {
                if (randTwo == randOne) {
                    dollars = dollars + (wagerAmount *10);
                    System.out.println("Your money has been tripled! You now have $" + dollars);
                } else {
                    dollars = dollars + (wagerAmount *10);
                    System.out.println("Your money has been doubled! You now have $" + dollars);
                }
            } else if (randThree == randOne) {
                if (randOne == randTwo) {
                    dollars = dollars + (wagerAmount *10);
                    System.out.println("Your money has been tripled! You now have $" + dollars);
                } else {
                    dollars = dollars + (wagerAmount *10);
                    System.out.println("Your money has been doubled! You now have $" + dollars);
                }
            } else {
                dollars = dollars - wagerAmount;
                System.out.println("You won nothing.");
            }
            
            
            while (z) {
                z = false;
                if (wagerAmount == 0.00) {
                    System.out.println("You lost all your money.");
                    break;
                } else {
                    System.out.println("Do you want to keep playing?");
                    String line = sc.next();
                    
                    if (line.equalsIgnoreCase("Yes") || line.equalsIgnoreCase("y")) {
                        System.out.println("The game will continue.");
                        x = true;
                        z = true;
                        y = true;
                        break;
                    } else if (line.equalsIgnoreCase("No") || line.equalsIgnoreCase("n")) {
                        System.out.println("Thank you for playing. You finished with $" + dollars);
                        break;
                    } else {
                        System.out.println("Please input a valid value (Yes or No)");
                        z = true;
                    }
                }
            }
        }
    }
}