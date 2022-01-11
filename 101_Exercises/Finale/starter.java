import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();
public void getMedians(int [] x) 
{ 
	int medianF =(x.length/2)+1;
int m = x[medianF]; 
System.out.println(m);
}
public int getMean(int [] y) {
   int maxArray = 0;
   int counter = 0;
       while(counter<=y.length) 
         {
              if(x[counter]>maxArray)
                   {
                      maxArray = y[counter];
                   }
             counter++;
         }
       int [] Check = new int[maxArray];
    counter=0;
    int counter2= Check.length;
        while(counter<=y.length)
             {
                counter2 = Check.length;
                   while(true) {  
                          if(y[counter]==counter2)
                                {
                                  Check[counter2] = Check[counter2]+1;
                                   break;
                                }
                                else {
                                counter2 = counter2-1;
                                }
                counter++;
             }
   int mean;
   int meanC =0;
   counter=0;
      while(counter<=Check.length) {
              if(Check[counter]>meanC)
          {
             meanC = check[counter];
            mean= counter;
          }
 counter++;
     }
    return mean;
}
		
	}
}
