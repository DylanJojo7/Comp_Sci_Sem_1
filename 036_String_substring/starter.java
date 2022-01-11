import java.util.Scanner;
import java.util.Random;


class starter {
public static void main(String args[]) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter a word");
String enterword = sc.nextLine();
int counter0 = 0;
while(counter0<enterword.length())
{
System.out.println(enterword.substring(counter0, counter0+1));
counter0++;
}



}
}