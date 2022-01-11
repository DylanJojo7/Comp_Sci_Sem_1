import java.util.Scanner;
import java.util.Random;

class starter {
	Scanner sc = new Scanner(System.in);
	
	public static int pow(int x, int y) {
		int a = 0;
		int d=x;
		while (a<y-1){
			d*=x;
			++a;
		}
		return d;
		}
	
	
		
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number to be raised: ");
	int base = sc.nextInt();
		
	System.out.println("Enter a number to use to raise: ");
	
		
	System.out.println(pow(base,sc.nextInt()));
			
	


		
	}
}
