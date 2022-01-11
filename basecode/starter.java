import java.util.Scanner;
import java.util.Random;
class files {
    
    
public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int user = sc.nextInt();
        int count = 0;
        while (true){
            System.out.println(user++);
            //System.out.println(6);
            
            if (count==15){
                break;
            }
            count = count +1;
        }
    }
}