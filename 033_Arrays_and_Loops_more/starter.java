
import java.util.Scanner;
import java.util.Random;


class starter {
public static void main(String args[]) {
int[] x = new int[100];
Random rand = new Random();
int counter = 0;
int minimum = 1000;
int m = 0;
int average100 = 0;
while(counter<x.length)
{
x[counter] = rand.nextInt(100)+1;
if(x[counter]<minimum)
{
minimum = x[counter];
}
else if(x[counter]>m)
{
m = x[counter];
}
System.out.println(x[counter]);
average100 = average100 + x[counter];
counter = counter+1;
}
average100 = average100/100;
System.out.println("");
System.out.println("The minimum is: "+minimum);
System.out.println("The maximum is: "+m);
System.out.println("The average is: "+average100);
}
}

