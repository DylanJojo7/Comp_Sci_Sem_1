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
        System.out.println("your role is "+ role);
        System.out.println("your Strength is "+ strength);
        System.out.println("your dexterity is "+ dexterity);
        System.out.println("your intelligence is "+ intelligence);
        System.out.println("your charisma is "+ charisma);
        System.out.println("your constitution is "+ constitution);
    }
    
    public String setRole(String newRole) {
        role = newRole;
        return role;
    }
    
    public Integer setStrength(int value) {
        strength = value;
        return strength;
    }
    
    public Integer setDexterity(int value) {
        dexterity = value;
        return dexterity;
    }
    
    public Integer setIntelligence(int value) {
        intelligence = value;
        return intelligence;
    }
    
    public Integer setCharisma(int value) {
        charisma = value;
        return charisma;
    }
    
    public Integer setConstitution(int value) {
        constitution = value;
        return constitution;
    }
    
    public Boolean setAll(String name, int sValue, int dValue, int iValue, int cValue, int c2Value) {
        
        role = name;
        strength = sValue;
        dexterity = dValue;
        intelligence = iValue;
        charisma = cValue;
        constitution = c2Value;
        
        return true;
        
    }
    
    
}