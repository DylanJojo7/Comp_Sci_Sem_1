package pkg;



public class myCharacter {
    
    
    public String role;
    public int strength;
    public int dexterity;
    public int intelligence;
    public int charisma;
    public int constitution;
    
    
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
    public void mytoString(){
        System.out.println("your roleis "+ role);
        System.out.println("your Strength is "+ strength);
        System.out.println("your dexterity is "+ dexterity);
        System.out.println("your intelligence is "+ intelligence);
        System.out.println("your charisma is "+ charisma);
        System.out.println("your constitution is "+ constitution);
    }
    
    
}