import java.util.Scanner;
import java.util.Random;



class starter {
public static void toStringArray(int x)
{
int counting = 0;
int [] arraytest = new int[x];
while(arraytest.length>counting)
{
arraytest[counting] = counting;
System.out.println(arraytest[counting]);
counting = counting+1;
}
}
public static void getArrayAverage(int arraylength, int numberlength)
{
Random rand = new Random();
int counting = 0;
int average = 0;
int [] x = new int[arraylength];
while(x.length>counting)
{
x[counting] = rand.nextInt(numberlength);
System.out.println(x[counting]);
average = average + x[counting];
counting = counting+1;
}
average=average/counting;
numberlength = numberlength-1;
System.out.println("The average is: "+average);
System.out.println("The array was made of "+arraylength+" integers and the random numbers were from 0 to "+numberlength);
}
public static void getArrayminimum(int arraylength, int numberlength)
{
Random rand = new Random();
int counting = 0;
int minimum = numberlength;
int [] x = new int[arraylength];
while(x.length>counting)
{
x[counting] = rand.nextInt(numberlength);
if(x[counting]<minimum)
{
minimum = x[counting];
}
System.out.println(x[counting]);
counting = counting+1;
}
System.out.println("");
System.out.println("The minimumimum is: "+minimum);
}
public static void getArraymaximum(int arraylength, int numberlength)
{
Random rand = new Random();
int counting = 0;
int maximum = 0;
int [] x = new int[arraylength];
while(x.length>counting)
{
x[counting] = rand.nextInt(numberlength);
if(x[counting]>maximum)
{
maximum = x[counting];
}
System.out.println(x[counting]);
counting = counting+1;
}
System.out.println("");
System.out.println("The maximumimum is: "+maximum);
}
public static void main(String args[]) {
Random randintgen = new Random();
int randominimumt1 = randintgen.nextInt(100);
int randominimumt2 = randintgen.nextInt(100);
getArraymaximum(randominimumt1, randominimumt2);

getArrayminimum(randominimumt1, randominimumt2);

getArrayAverage(randominimumt1, randominimumt2);

toStringArray(randominimumt1);

}
}

