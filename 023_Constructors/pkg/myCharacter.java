package pkg;



public class myCharacter {
    
    public String role;
    
    
    public myCharacter() {
        role = "";
    }
    
    public myCharacter(String s) {
        role = s;
        if (role.equalsIgnoreCase("Wizard")) {
            System.out.println("You chose Wizard! How cool!");
        } else if (role.equalsIgnoreCase("Rogue")) {
            System.out.println("You chose Rogue! How cunning!");
        } else if (role.equalsIgnoreCase("Warrior")) {
            System.out.println("You chose Warror! How scary!");
        } else {
            System.out.println("Please input a valid role next time.");
            role = "No Role";
        }
    }
    
    
    
}