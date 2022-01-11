import java.util.Scanner;
import java.util.Random;

class starter {
    
	public static void main(String args[]) {
	    
	    Scanner sc = new Scanner(System.in);

System.out.println("What is your name");
String name = sc.nextLine();
System.out.println("What is your title");
String title = sc.nextLine();

System.out.println("Would you like to be a Wizard, Warrior, or Rogue?");

String role = sc.nextLine();

if(role.equals("Wizard"))
{
System.out.println("You've chosen the Wizard! Excelsior!");
}
else if(role.equals("Warrior"))
{
System.out.println("You've chosen the Warrior! For honor!");
}
else if(role.equals("Rogue"))
{
System.out.println("You've chosen the Rogue! How cunning!");
}

System.out.println("You have 25 skill points to spend in the following: Strength, Dexterity, Intelligence, Constitution, and Charisma. Spend them wisely.");
int p = 25;
System.out.println("Strength (1-10):");
int s = sc.nextInt();
int s1;
if(s > 10)
{
System.out.println("Please input a smaller value. Strength (1-10): ");
s = sc.nextInt();
s1 = p - s;

}
else{
s1 = p - s;
}

System.out.println("You have " + s1 + " points left.");

System.out.println("Dexterity (1-10): ");
int d = sc.nextInt();
int d1;
if (d > 10){
System.out.println("Please input a smaller value. Dexterity (1-10):");
d = sc.nextInt();
d1 = s1 - d;
}
else{
d1 = s1 - d;
}
System.out.println("You have " + d1 + " points left.");

System.out.println("Intelligence (1-10): ");
int i = sc.nextInt();
int i1;
if(i > 10){
System.out.println("Please input a smaller value. Intelligence (1-10): ");
i = sc.nextInt();
i1 = d1 - i;
}
else {
i1 = d1 - i;
}

System.out.println("You have " + i1 + " points left.");

System.out.println("Constitution (1-10): ");
int c = sc.nextInt();
int c1;
if(c > 10){
System.out.println("Please input a smaller value. Constitution (1-10): ");
c = sc.nextInt();
c1 = i1 - c;
}
else {
c1 = i1 - c;
}
System.out.println("You have " + c1 + " points left.");


System.out.println("Charisma (1-10): ");
int a = sc.nextInt();
int a1;
if(a > 10){
System.out.println("Please input a smaller value. Constitution (1-10): ");
a = sc.nextInt();
a1 = c1 - a;
}
else {
a1 = c1 - a;
}
 if(p==0){
	System.out.println("the game is over");
}
System.out.println("You have " + a1 + " points left.");

System.out.println("------------------------------------------------------------");

System.out.println("You are " + name + " the " + title +" of CVHS.");
System.out.println("You're a " + role + " with the following stats!");
System.out.println("Strength - " + s);
System.out.println("Dexterity - " + d);
System.out.println("Intelligence - " + i);
System.out.println("Constitution - " + c);
System.out.println("Charisma - " + a);
System.out.println("");

System.out.println("Good luck on your quest " + name);
}
	}
	





