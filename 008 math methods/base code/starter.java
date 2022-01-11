import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
	
		double one = 13 - 6 * 11;
		double two = 30 % 7 * (-2);
		System.out.println(Math.max(one,two));
		
		double three = 3*8+31 %7;
		System.out.println(Math.sqrt(three));
		
		double four = 37 / 3;
		double five = 35 % 21;
		System.out.println(Math.pow(four,five));
		//Max( Pow( 2,14%3) , Sqrt ( 2*6) )
		System.out.println(4.0/3.0);
		
	
		System.out.println(Math.max(Math.pow(2,14%3), Math.sqrt(2*6)));
		//extra
		
		Scanner sc= new Scanner(System.in);
		System.out.println("number x");
		double six = sc.nextDouble();
		System.out.println("number y");
		double seven = sc.nextDouble();
		sc.close();
		
			System.out.println("Max value:" + Math.max(six,seven));
			System.out.println("Square Root of Y:" + Math.sqrt(seven));
			System.out.println("power of x to the power of the yth power" + Math.pow(six,seven));

		

		
		
	}
}
