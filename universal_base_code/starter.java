import pkg.*;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;


class starter {

 static Random r = new Random();
	static Scanner sc = new Scanner(System.in);
	static ArrayList<Double> randomNums = new ArrayList<Double>();
	static ArrayList<Double> randomPower = new ArrayList<Double>();
	static ArrayList<Double> randomSqrt = new ArrayList<Double>();
	
	public static double abs() {
		
		
		System.out.println("Enter a number: ");
	    double num = sc.nextDouble();
		
		
		return Math.abs(num);
		
		
	}
	
	public static double abs(double num) {
		
	}
	
	private static double max() {
		
		System.out.println("Enter a number: ");
		int num1 = sc.nextInt();
		
		System.out.println("Enter a number: ");
		int num2 = sc.nextInt();
		
		return Math.max(num1, num2);
	}
		
	private static double min() {
		
		System.out.println("Enter a number: ");
		int num1 = sc.nextInt();
		
		System.out.println("Enter a number: ");
		int num2 = sc.nextInt();
		
		return Math.min(num1, num2);
	}
		
	private static String randomPow() {
		
		System.out.println("Enter a number to raise to the power of: ");
		double num = sc.nextDouble();
		
		for (int i = 0; i < randomNums.size(); i++) {
			double poweredNumber = Math.pow(randomNums.get(i), num);
			randomPower.add(poweredNumber);
		}
		
		double allAdded = 0;
		
		double max = -100000000;
		double min = 100000000;
		
		for (int i = 0; i < randomPower.size(); i++) {
			allAdded = allAdded + randomPower.get(i);
			if (randomPower.get(i) > max) {
				max = randomPower.get(i);
			} else if (randomPower.get(i) < min) {
				min = randomPower.get(i);
			}
		}
		
		double average = allAdded / randomPower.size();
		
		String all = "Average: " + average + " | Max: " + max + " | Min: " + min + "";
		
		return all;
		
	}
	
	private static Double pow() {
		
		System.out.println("Enter a number to be raised: ");
		double numRaised = sc.nextDouble();
		
		System.out.println("Enter a number to use to raise: ");
		double numUsed = sc.nextDouble();
		
		return Math.pow(numRaised, numUsed);
	}
	
	private static Double sqrt() {
		System.out.println("Enter a number to be square rooted: ");
		double num = sc.nextDouble();
		
		
		return(Math.sqrt(num));
	}
		
	private static String randomSqrt() {
		
		for (int i = 0; i < randomNums.size(); i++) {
			double poweredNumber = Math.sqrt(randomNums.get(i));
			randomSqrt.add(poweredNumber);
		}
		
		double allAdded = 0;
		
		double max = -100000000;
		double min = 1000000000;
		
		for (int i = 0; i < randomSqrt.size(); i++) {
			allAdded = allAdded + randomSqrt.get(i);
			if (randomSqrt.get(i) > max) {
				max = randomSqrt.get(i);
			} else if (randomSqrt.get(i) < min) {
				min = randomSqrt.get(i);
			}
		}
		
		double average = allAdded / randomSqrt.size();
		
		String all = "Average: " + average + " | Max: " + max + " | Min: " + min + "";
		
		return all;
		
	}
		
	private static double avg() {
		int addedTogether = 0;
		double avg = 0;
		boolean x = true;
		double fullAverage = 0;
		while (x) {
			x = false;
			System.out.println("Enter a number (enter nothing to continue): ");
			if (sc.next().equals("")) {
				x = true;
			} else {
				addedTogether = addedTogether + sc.nextInt();
				avg = avg + 1;
			}
		}
		
		
		fullAverage = addedTogether / avg;
		return fullAverage;
		
		
	}
	
	private static void random() {
		int ra = r.nextInt(8) + 1;
		
		if (ra == 1) {
			abs();
		} else if (ra == 2) {
			max();
		} else if (ra == 3) {
			min();
		} else if (ra == 4) {
			pow();	
		} else if (ra == 5) {
			sqrt();
		} else if (ra == 6) {
			avg();
		} else if (ra == 7) {
			randomPow();
		} else if (ra == 8) {
			randomSqrt();
		}
	}
	
	public static void main(String args[]) {
		
		BaseClass test = new BaseClass();
		
		boolean x = true;
        
        while (x) {
            x = false;
			System.out.println("Welcome to Dylan's Math Class. What do you need help on? Abs, Max, Min, Pow, Sqrt, Avg, Random, randomPow, or randomSqrt");
			String choice = sc.next();
			 if (choice.equalsIgnoreCase("Abs")) {
				System.out.println("Are you sure you want to choose Abs?");
				String newChoice = sc.next();
	            if (newChoice.equalsIgnoreCase("yes")) {
	            	
	                abs();
	            } else {
	            	x = true;
	            }
	            
			 } else if (choice.equalsIgnoreCase("Max")) {
			 	System.out.println("Are you sure you want to choose max?");
				String newChoice = sc.next();
	            if (newChoice.equalsIgnoreCase("yes")) {
	            	
	                max();
	            } else {
	            	x = true;
	            }
			 } else if (choice.equalsIgnoreCase("Min")) {
			 	System.out.println("Are you sure you want to choose min?");
				String newChoice = sc.next();
	            if (newChoice.equalsIgnoreCase("yes")) {
	            	
					min();
	            } else {
	            	x = true;
	            }
	         } else if (choice.equalsIgnoreCase("Pow")) {
			 	System.out.println("Are you sure you want to choose power?");
				String newChoice = sc.next();
	            if (newChoice.equalsIgnoreCase("yes")) {
	            	
	                pow();
	                
	            } else {
	            	x = true;
	            }
	         } else if (choice.equalsIgnoreCase("Sqrt")) {
			 	System.out.println("Are you sure you want to choose square root?");
				String newChoice = sc.next();
	            if (newChoice.equalsIgnoreCase("yes")) {
	            	
	                sqrt();
	                
	            } else {
	            	x = true;
	            }
	         } else if (choice.equalsIgnoreCase("Avg")) {
			 	System.out.println("Are you sure you want to choose average?");
				String newChoice = sc.next();
	            if (newChoice.equalsIgnoreCase("yes")) {
	            	
	                avg();
	            } else {
	            	x = true;
	            }
	         } else if (choice.equalsIgnoreCase("random")) {
			 	System.out.println("Are you sure you want to choose random?");
				String newChoice = sc.next();
	            if (newChoice.equalsIgnoreCase("yes")) {
	            	
	                random();
	            } else {
	            	x = true;
	            }
	         } else if (choice.equalsIgnoreCase("randomPow")) {
			 	System.out.println("Are you sure you want to choose randomPow?");
				String newChoice = sc.next();
	            if (newChoice.equalsIgnoreCase("yes")) {
	            	
	                randomPow();
	            } else {
	            	x = true;
	            }
	         } else if (choice.equalsIgnoreCase("randomSqrt")) {
			 	System.out.println("Are you sure you want to choose randomSqrt?");
				String newChoice = sc.next();
	            if (newChoice.equalsIgnoreCase("yes")) {
	            	
	                randomSqrt();
	            } else {
	            	x = true;
	            }
	         } else {
	         	x = true;
	         }
        }
	}
}



             

