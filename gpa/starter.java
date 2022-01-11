import java.util.Scanner;
class starter {
	public static void main(String args[]) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("What is your first period");
	String periodone = sc.nextLine();
	System.out.println("What is your grade in 1st period");
	int gradeone = sc.nextInt();
	sc.nextLine();
	
		System.out.println("What is your 2nd period period");
	String periodtwo = sc.nextLine();
	System.out.println("What is your grade in 2nd period");
	int gradetwo = sc.nextInt();
	sc.nextLine();
	
		System.out.println("What is your third period");
	String periodthree = sc.nextLine();
	System.out.println("What is your grade in third period");
	int gradethree = sc.nextInt();
	
	sc.nextLine();
	System.out.println("Your final output of gpa is" + (gradeone + gradetwo + gradethree) / 3.0);
	
		
		

	}
}
