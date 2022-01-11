import pkg.*;

import java.util.Scanner;
import java.util.Random;

class starter{
    public static void main(String args[]){
        myCharacter char1 = new myCharacter();
        char1.mytoString();
        Scanner sc = new Scanner(System.in);
        System.out.println("what would u like your class to be");
        String role1= sc.nextLine();
        myCharacter char2 = new myCharacter(role1);
        char2.mytoString();
    }
}

