import java.util.Scanner;
class starter {
	
		public static Object luke(int a, int b){
		int c = a*b;
			if (c%3 == 0) {
			
		return "its divisibe by 3" ;
		}
		else{
			
				return "your answer is not divisibe by 3";
		}
		}
	
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
	// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
	
		System.out.println("first input");
		int y = sc.nextInt();
		System.out.println("second input");
		int v = sc.nextInt();
		System.out.println(luke(y,v));
		
	
		
		
		
	}
}
