import files.starter;
import java.util.Scanner;
import java.util.Random;

class dog {
	String name;
	int age;
	String breed;
	Random r = new Random();
	int isSleep;
	
	
	public dog(){
		name = "Clifford";
		age = 3;
		breed = "big red dog";
		isSleep = r.nextInt(2) + 1;
	}
	public dog(String x) {
		name = x;
		age = 1;
		breed = "dog dog";
		isSleep = r.nextInt(2) + 1;
	}
    public dog(String n, int y) {
    	name = n;
    	age = y;
    	breed = "dog dog";
    	isSleep = r.nextInt(2) + 1;
    }
    public dog(String n, String b) {
    	name = n;
    	age = 1;
    	breed = b;
    	isSleep = r.nextInt(2) + 1;
    }
    public void setName(String newName){
       name = newName;
    }
    
	public void setAge(int newAge){
       age = newAge;
    }
	
	public void setBreed(String newBreed){
       breed = newBreed;
    }
	
	public String getName(){
       return name;
    }
	
	public Integer getAge(){
       return age;
    }
	
	public String getBreed(){
       return breed;
    }
	
	public Boolean isSleeping(){
       if (isSleep == 1) {
        return true;
       } else {
        return false;
       }
    }
	
	public void bark(){
       System.out.println(name + " barks!");
    }
}

public class Main {
 
 public static void main(String[] args) {
  
  dog dogOne = new dog("Dylan");
  dogOne.setAge(5);
  
  dog dogTwo = new dog("Summy", "Labrador");
  
  
  if (dogOne.isSleeping()) {
   System.out.println(dogOne.getName() + " is asleep.");
  } else {
   System.out.println(dogOne.getName() + ": Bark!");
  }
  
  
  if (dogTwo.isSleeping()) {
   if (!dogOne.isSleeping()) {
    System.out.println(dogTwo.getName() + ": Bark!");
   }
  } else {
   if (!dogOne.isSleeping()) {
    System.out.println(dogTwo.getName() + ": Bark!");
   }
  }
  
 }
 
 
}




