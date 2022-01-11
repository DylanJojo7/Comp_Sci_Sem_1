import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;  

class starter {
	public static void main(String args[]) {
	    
	  Random r = new Random();  
	   int [] x;
	   x = new int[100];
	  int y=0;
	   while(y<100){
	
	   int n = r.nextInt(100) + 1;
	   x[y]=n;
	 System.out.println(x[y]);
	  y++;
	  }
	  
	   
        
	   
	
	    
	    
	}
	    
}
