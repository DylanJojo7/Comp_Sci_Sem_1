import pkg.myCharacter;



public class starter {
    
    
    public static void main(String[] args) {
        myCharacter charOne = new myCharacter();
        myCharacter charTwo = new myCharacter("Warrior");
    
    
        System.out.println("Constructor One Role: " + charOne.role);
        System.out.println("Constructor Two Role: " + charTwo.role);
        
    }
    
}
