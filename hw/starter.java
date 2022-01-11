
import java.util.Random;
import java.util.Scanner; 
    
class starter {
    



	public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        
        
        System.out.println("Enter a number: ");
        int a = sc.nextInt();
        
        System.out.println("Enter a number: ");
        int b = sc.nextInt();
        
        if (a % 2 != 0) {
            System.out.println("Number One is an odd number.");
        } else {
            System.out.println("Number One is an even number.");
        }
        
        if (b % 2 != 0) {
            System.out.println("Number Two is an odd number.");
        } else {
            System.out.println("Number Two is an even number.");
        }
        
        
        if (a % 3 != 0) {
            System.out.println("Number One is not divisible by three.");
        } else {
            System.out.println("Number One is divisible by three.");
        }
        
        if (a % 4 != 0) {
            System.out.println("Number One is not divisible by four.");
        } else {
            System.out.println("Number One is divisible by four.");
        }
        
        if (a % 5 != 0) {
            System.out.println("Number One is not divisible by five.");
        } else {
            System.out.println("Number One is divisible by five.");
        }
        
                
        if (b % 3 != 0) {
            System.out.println("Number Two is not divisible by three.");
        } else {
            System.out.println("Number Two is divisible by three.");
        }
        
        if (b % 4 != 0) {
            System.out.println("Number Two is not divisible by four.");
        } else {
            System.out.println("Number Two is divisible by four.");
        }
        
        if (b % 5 != 0) {
            System.out.println("Number Two is not divisible by five.");
        } else {
            System.out.println("Number Two is divisible by five.");
        }


	}
}
