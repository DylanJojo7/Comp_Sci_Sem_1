import java.util.Random;
import java.util.Arrays;   
import java.util.Collections;   

public class hw {
    
    
    
    public static void main(String[] args) {
        
        Random r = new Random();
    
        Integer[] listOne;
        listOne = new Integer[20];
        
        
        for (int i = 0; i < 20; i++) {
            
            int n = r.nextInt(50) + 1;
            
            listOne[i] = n; 
            
        }
        
        
        Arrays.sort(listOne);
        System.out.println(Arrays.toString(listOne));
        
        
        Integer[] listTwo;
        listTwo = new Integer[20];
        
        for (int i = 0; i < 20; i++) {
            listTwo[i] = listOne[i];
        }
        
        
        Arrays.sort(listTwo, Collections.reverseOrder());
        
        System.out.println(Arrays.toString(listTwo));
    }
    
    
    
}