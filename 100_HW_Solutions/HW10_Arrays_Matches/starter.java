import java.util.Random;
import java.util.Arrays;   
import java.util.Collections;   
import java.util.ArrayList;

public class starter {
    
    
    
    public static void main(String[] args) {
        
        Random r = new Random();
    
        Integer[] listOne;
        listOne = new Integer[20];
        
        
        for (int i = 0; i < 20; i++) {
            int ranInt = r.nextInt(19) + 1;
            listOne[i] = ranInt;
        }
        
        int duplicate = r.nextInt(10) + 1;
        
        ArrayList<Integer> indexs = new ArrayList<Integer>();
        
        int total = 0;
        
        
        for (int i = 0; i < 20; i++) {
            int picked = listOne[i];
            if (picked == duplicate) {
                total = total + 1;
                indexs.add(i);
            }
        }
        
        System.out.println("Indexs of Duplicate Numbers: " + indexs);
        System.out.println("Number of Numbers Duplicate to " + duplicate + ": " + total);
        
        for (int i = 0; i < 19; i++) {
            
            int numUp = i + 1;
            
            if (listOne[i] == listOne[numUp]) {
                System.out.println("Duplicate (Number is " + listOne[i] + "!) Index's are: " + i + " and " + numUp + ".");
            }
        }
        
        
      
        
        
       
    }
    
    
    
}