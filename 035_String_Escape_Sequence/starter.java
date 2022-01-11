import java.util.Scanner;
import java.util.Random;


class starter {
public static void main(String args[]) {
int randomres = 0;
Scanner sc = new Scanner(System.in);
Random rand = new Random();
System.out.println("Write a pet peeve.");
String petpeeves =sc.nextLine();
while(true)
{
randomres = rand.nextInt(4);
if(petpeeves.equalsIgnoreCase("stop"))
{
break;
}
else
{
if(randomres==0)
{
System.out.println("stop complaining so much");
}
if(randomres==1)
{
System.out.println("Mocking: "+petpeeves);
}
if(randomres==2)
{
System.out.println("Stop complaining about "+petpeeves);
}
if(randomres==3)
{
System.out.println("I hate "+petpeeves+" too");
}
}
System.out.println("Write another pet peeve, if you would like to stop, type stop");
petpeeves =sc.nextLine();
}


}
}