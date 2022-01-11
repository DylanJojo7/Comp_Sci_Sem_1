import java.util.Scanner;
import java.util.Random;


class starter {
public static void main(String args[]) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter your full name (First, last) (No middle name)");
String name  = sc.nextLine();
int c = name.indexOf(" ")+1;
System.out.println(name.substring(c));




}
}