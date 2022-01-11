import files.starter;
import java.util.Scanner;


public class Main {
    
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        
        
        System.out.println("Input an integer: ");
        int value = sc.nextInt();
        starter s = new starter();
        
        s.printPrimes(value);
        
    }
    
    
}