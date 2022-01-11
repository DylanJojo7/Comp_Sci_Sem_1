import java.util.Scanner;
import java.util.Random;
class starter {
    
    
public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int user = sc.nextInt();
        while (true){
            System.out.println(user);
            //System.out.println(6);
            
            if (user==5){
                break;
            }
            user = user -1;
        }
    }
}