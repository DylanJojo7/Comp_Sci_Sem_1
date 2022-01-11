import java.util.Scanner;
import java.util.Random;
class starter {
    
    
public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int user = sc.nextInt();
        int y = user-1;
        while (true){
            System.out.println(user);
            user = user *y;
            //System.out.println(6);
            
            if (user==0){
                break;
            }
            y = y -1;
        }
    }
}