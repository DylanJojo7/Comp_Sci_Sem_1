import files.starter;
import java.util.Scanner;

class Cat {
    String name;
   public Cat(){
       name = "Garfield";
    }
     public Cat(String x) {
         name = x;
         
     }
    public void meow(){
        String cat = new String();
        System.out.println("THE cats name is "+ name + " and it meows");
        return;
    }
}




public class Main {
    

    
    public static void main(String[] args) {
        
        Cat xyz = new Cat("luke");
        Cat abc = new Cat();
        xyz.meow();
        abc.meow();
        
        
    }
    
    
}