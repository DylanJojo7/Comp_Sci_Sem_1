import java.util.Scanner;
import java.util.Random;


class starter {
public static void main(String args[]) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter a name");
String name = sc.nextLine();
int z = name.length();
System.out.print(name.substring(z-1));
z = z-1;
while(true)
{
if(z==-1)
{
break;
}
else if(z>0)
{
System.out.print(name.substring(z-1, z));
z = z-1;
}
}



}
}