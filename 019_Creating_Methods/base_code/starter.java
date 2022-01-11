import java.util.Scanner;
import java.util.Random;

class starter {


	public static void toString(Object toValue) {
		System.out.println(toValue);
	}
	
	public static void toStringCombined(Object one, Object two) {
		System.out.println(one + " " + two);
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
			
		System.out.println("Input anything");
		String s1 = sc.nextLine();
		System.out.println("Input another anything (press enter to only do first method)");
		String s2 = sc.nextLine();
		
		if (s2.equals("")) {
			toString(s1);
		} else {
			toStringCombined(s1,s2);
		}
	}
}