import java.util.Scanner;
import java.util.Random;


class starter {
public static void main(String args[]) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter a word");
String enterword = sc.nextLine();
for(int counter0 = 0; counter0<enterword.length(); counter0++)
{
System.out.println(enterword.substring(counter0, counter0+1));
}


}
}