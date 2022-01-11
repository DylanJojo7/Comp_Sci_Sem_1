import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.println("NUMERO 1");
		int x =sc.nextInt();
		System.out.println("NUMERO 2");
		int y=sc.nextInt();
		sc.close();
		if(x!=y){
			System.out.println("the values are different");
		
		}
		else if(x==y){
			System.out.println("ẗhey are the same numbers");
		}
	}
}
