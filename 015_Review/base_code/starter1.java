import java.util.Scanner;
import java.util.Random;

class starter1 {
    static int points = 25;
    static int strength = 0;
    static int dexterity = 0;
    static int intelligence = 0;
    static int constitution = 0;
    static int charisma = 0;
    
	public static void main(String args[]) {
	    
	    Scanner sca = new Scanner(System.in);
	    
        System.out.println("What would you like your character name to be?");
        String charName = sca.nextLine();
        System.out.println("What would you like your character title to be?");
        String charTitle = sca.nextLine();
        
        boolean x = true;
        
        while (x) {
            x = false;
            System.out.println("Do you want to be a wizard, warrior, or rogue?");
            String choice = sca.nextLine();
        
        
            if (choice.equalsIgnoreCase("Wizard")) {
                System.out.println("Are you sure you want to be a Wizard?");
                String newChoice = sca.nextLine();
                
                if (newChoice.equalsIgnoreCase("Yes")) {
                    
                    
                    boolean newX = true;
                    while (newX) {
                        System.out.println("Which class would you like to put your points into? You have " + points + " remaining." + "\nOptions: Strength, Dexterity, Intelligence, Constitution, and Charisma");
                        Scanner sc = new Scanner(System.in);
                        
                        newX = false;
                        if (points == 0) {
                            System.out.println("You have put all your points into their specified categories. Your stats are: \nCharacter Name: " + charName + "\nCharacter Title: " + charTitle + "\nPoints Breakdown: \n   Strength: " + strength + "\n   Dexterity: " + dexterity + "\n   Intelligence: " + intelligence + "\n   Constitution: " + constitution + "\n   Charisma: " + charisma);
                        } else {
                           
                            
                            
                            String pointChosen = sc.next();
                            
                            if (pointChosen.equalsIgnoreCase("Strength")) {
                                if (strength != 10) {
                                    System.out.println("How many points would you like to put in?");
                                    int pointAmount = sc.nextInt();
                                    if (pointAmount <= 10) {
                                        if (pointAmount > 0) {
                                            
                                            if (points >= pointAmount) {
                                                
                                                System.out.println("You have put " + pointAmount + " points into Strength.");
                                                newX = true;
                                                strength = strength + pointAmount;
                                                points = points - pointAmount;
                                                
                                            } else {
                                                System.out.println("You do not have enough points to perform this action.");
                                                newX = true;
                                            }
                                            
                                        } else {
                                            System.out.println("Please choose a number greater than 0.");
                                            newX = true;
                                        }
                                    } else {
                                            System.out.println("Please choose a number less than 10.");
                                            newX = true;
                                    }
                                
                                } else {
                                    System.out.println("Strength has already hit its upper limit. Please pick a different choice.");
                                    newX = true;
                                }
                            } else if (pointChosen.equalsIgnoreCase("Dexterity")) {
                                if (dexterity != 10) {
                                    System.out.println("How many points would you like to put in?");
                                    int pointAmount = sc.nextInt();
                                    if (pointAmount <= 10) {
                                        if (pointAmount > 0) {
                                            
                                            if (points >= pointAmount) {
                                                
                                                System.out.println("You have put " + pointAmount + " into Dexterity.");
                                                newX = true;
                                                dexterity = dexterity + pointAmount;
                                                points = points - pointAmount;
                                            } else {
                                                System.out.println("You do not have enough points to perform this action.");
                                                newX = true;
                                            }
                                            
                                        } else {
                                            System.out.println("Please choose a number greater than 0.");
                                            newX = true;
                                        }
                                    } else {
                                            System.out.println("Please choose a number less than 10.");
                                            newX = true;
                                    }
                                } else {
                                    System.out.println("Dexterity has already hit its upper limit. Please pick a different choice.");
                                    newX = true;
                                }
                            } else if (pointChosen.equalsIgnoreCase("Intelligence")) {
                                if (intelligence != 10) {
                                    System.out.println("How many points would you like to put in?");
                                    int pointAmount = sc.nextInt();
                                    if (pointAmount <= 10) {
                                        if (pointAmount > 0) {
                                            
                                            if (points >= pointAmount) {
                                                
                                                System.out.println("You have put " + pointAmount + " into Intelligence.");
                                                newX = true;
                                                intelligence = intelligence + pointAmount;
                                                points = points - pointAmount;
                                            } else {
                                                System.out.println("You do not have enough points to perform this action.");
                                                newX = true;
                                            }
                                            
                                        } else {
                                            System.out.println("Please choose a number greater than 0.");
                                            newX = true;
                                        }
                                    } else {
                                            System.out.println("Please choose a number less than 10.");
                                            newX = true;
                                    } 
                                } else {
                                    System.out.println("Intelligence has already hit its upper limit. Please pick a different choice.");
                                    newX = true;
                                }
                            } else if (pointChosen.equalsIgnoreCase("Constitution")) {
                                if (constitution != 10) {
                                    System.out.println("How many points would you like to put in?");
                                    int pointAmount = sc.nextInt();
                                    if (pointAmount <= 10) {
                                        if (pointAmount > 0) {
                                            
                                            if (points >= pointAmount) {
                                                
                                                System.out.println("You have put " + pointAmount + " into Constitution.");
                                                newX = true;
                                                constitution = constitution + pointAmount;
                                                points = points - pointAmount;
                                            } else {
                                                System.out.println("You do not have enough points to perform this action.");
                                                newX = true;
                                            }
                                            
                                        } else {
                                            System.out.println("Please choose a number greater than 0.");
                                            newX = true;
                                        }
                                    } else {
                                            System.out.println("Please choose a number less than 10.");
                                            newX = true;
                                    }
                                } else {
                                    System.out.println("Constitution has already hit its upper limit. Please pick a different choice.");
                                    newX = true;
                                }
                            } else if (pointChosen.equalsIgnoreCase("Charisma")) {
                                if (charisma != 10) {
                                    System.out.println("How many points would you like to put in?");
                                    int pointAmount = sc.nextInt();
                                    if (pointAmount <= 10) {
                                        if (pointAmount > 0) {
                                            
                                            if (points >= pointAmount) {
                                                
                                                System.out.println("You have put " + pointAmount + " into Charisma.");
                                                newX = true;
                                                charisma = charisma + pointAmount;
                                                points = points - pointAmount;
                                            } else {
                                                System.out.println("You do not have enough points to perform this action.");
                                                newX = true;
                                            }
                                            
                                        } else {
                                            System.out.println("Please choose a number greater than 0.");
                                            newX = true;
                                        }
                                    } else {
                                            System.out.println("Please choose a number less than 10.");
                                            newX = true;
                                    }
                                } else {
                                    System.out.println("Charisma has already hit its upper limit. Please pick a different choice.");
                                    newX = true;
                                }
                            } else {
                                System.out.println("Please pick a valid option.");
                                newX = true;
                            }
                        } 
                    }
                   
                    
                    
                } else if (newChoice.equalsIgnoreCase("No")) {
                    System.out.println("Repick your choice.");
                    x = true;
                } else {
                    System.out.println("Invalid input entered. Please use Yes or No next time when confirming.");
                    x = true;
                }
            } else if (choice.equalsIgnoreCase("Warrior")){
                System.out.println("Are you sure you want to be a Warrior?");
                String newChoice = sca.nextLine();
                
                if (newChoice.equalsIgnoreCase("Yes")) {
                    boolean newX = true;
                    
                    while (newX) {
                        System.out.println("Which class would you like to put your points into? You have " + points + " remaining." + "\nOptions: Strength, Dexterity, Intelligence, Constitution, and Charisma");
                        Scanner sc = new Scanner(System.in);
                        
                        newX = false;
                        if (points == 0) {
                            System.out.println("You have put all your points into their specified categories. Your stats are: \nCharacter Name: " + charName + "\nCharacter Title: " + charTitle + "\nPoints Breakdown: \n   Strength: " + strength + "\n   Dexterity: " + dexterity + "\n   Intelligence: " + intelligence + "\n   Constitution: " + constitution + "\n   Charisma: " + charisma);
                        } else {
                           
                            
                            
                            String pointChosen = sc.next();
                            
                            if (pointChosen.equalsIgnoreCase("Strength")) {
                                if (strength != 10) {
                                    System.out.println("How many points would you like to put in?");
                                    int pointAmount = sc.nextInt();
                                    if (pointAmount <= 10) {
                                        if (pointAmount > 0) {
                                            
                                            if (points >= pointAmount) {
                                                
                                                System.out.println("You have put " + pointAmount + " points into Strength.");
                                                newX = true;
                                                strength = strength + pointAmount;
                                                points = points - pointAmount;
                                                
                                            } else {
                                                System.out.println("You do not have enough points to perform this action.");
                                                newX = true;
                                            }
                                            
                                        } else {
                                            System.out.println("Please choose a number greater than 0.");
                                            newX = true;
                                        }
                                    } else {
                                            System.out.println("Please choose a number less than 10.");
                                            newX = true;
                                    }
                                
                                } else {
                                    System.out.println("Strength has already hit its upper limit. Please pick a different choice.");
                                    newX = true;
                                }
                            } else if (pointChosen.equalsIgnoreCase("Dexterity")) {
                                if (dexterity != 10) {
                                    System.out.println("How many points would you like to put in?");
                                    int pointAmount = sc.nextInt();
                                    if (pointAmount <= 10) {
                                        if (pointAmount > 0) {
                                            
                                            if (points >= pointAmount) {
                                                
                                                System.out.println("You have put " + pointAmount + " into Dexterity.");
                                                newX = true;
                                                dexterity = dexterity + pointAmount;
                                                points = points - pointAmount;
                                            } else {
                                                System.out.println("You do not have enough points to perform this action.");
                                                newX = true;
                                            }
                                            
                                        } else {
                                            System.out.println("Please choose a number greater than 0.");
                                            newX = true;
                                        }
                                    } else {
                                            System.out.println("Please choose a number less than 10.");
                                            newX = true;
                                    }
                                } else {
                                    System.out.println("Dexterity has already hit its upper limit. Please pick a different choice.");
                                    newX = true;
                                }
                            } else if (pointChosen.equalsIgnoreCase("Intelligence")) {
                                if (intelligence != 10) {
                                    System.out.println("How many points would you like to put in?");
                                    int pointAmount = sc.nextInt();
                                    if (pointAmount <= 10) {
                                        if (pointAmount > 0) {
                                            
                                            if (points >= pointAmount) {
                                                
                                                System.out.println("You have put " + pointAmount + " into Intelligence.");
                                                newX = true;
                                                intelligence = intelligence + pointAmount;
                                                points = points - pointAmount;
                                            } else {
                                                System.out.println("You do not have enough points to perform this action.");
                                                newX = true;
                                            }
                                            
                                        } else {
                                            System.out.println("Please choose a number greater than 0.");
                                            newX = true;
                                        }
                                    } else {
                                            System.out.println("Please choose a number less than 10.");
                                            newX = true;
                                    }
                                } else {
                                    System.out.println("Intelligence has already hit its upper limit. Please pick a different choice.");
                                    newX = true;
                                }
                            } else if (pointChosen.equalsIgnoreCase("Constitution")) {
                                if (constitution != 10) {
                                    System.out.println("How many points would you like to put in?");
                                    int pointAmount = sc.nextInt();
                                    if (pointAmount <= 10) {
                                        if (pointAmount > 0) {
                                            
                                            if (points >= pointAmount) {
                                                
                                                System.out.println("You have put " + pointAmount + " into Constitution.");
                                                newX = true;
                                                constitution = constitution + pointAmount;
                                                points = points - pointAmount;
                                            } else {
                                                System.out.println("You do not have enough points to perform this action.");
                                                newX = true;
                                            }
                                            
                                        } else {
                                            System.out.println("Please choose a number greater than 0.");
                                            newX = true;
                                        }
                                    } else {
                                            System.out.println("Please choose a number less than 10.");
                                            newX = true;
                                    }
                                } else {
                                    System.out.println("Constitution has already hit its upper limit. Please pick a different choice.");
                                    newX = true;
                                }
                            } else if (pointChosen.equalsIgnoreCase("Charisma")) {
                                if (charisma != 10) {
                                    System.out.println("How many points would you like to put in?");
                                    int pointAmount = sc.nextInt();
                                    if (pointAmount <= 10) {
                                        if (pointAmount > 0) {
                                            
                                            if (points >= pointAmount) {
                                                
                                                System.out.println("You have put " + pointAmount + " into Charisma.");
                                                newX = true;
                                                charisma = charisma + pointAmount;
                                                points = points - pointAmount;
                                            } else {
                                                System.out.println("You do not have enough points to perform this action.");
                                                newX = true;
                                            }
                                            
                                        } else {
                                            System.out.println("Please choose a number greater than 0.");
                                            newX = true;
                                        }
                                    } else {
                                            System.out.println("Please choose a number less than 10.");
                                            newX = true;
                                    }
                                } else {
                                    System.out.println("Charisma has already hit its upper limit. Please pick a different choice.");
                                    newX = true;
                                }
                            } else {
                                
                                System.out.println("Please pick a valid option.");
                                newX = true;
                                
                            }
                        }
                    }
                } else if (newChoice.equalsIgnoreCase("No")) {
                    System.out.println("Repick your choice.");
                    x = true;
                } else {
                    System.out.println("Invalid input entered. Please use Yes or No next time when confirming.");
                    x = true;
                }
            } else if (choice.equalsIgnoreCase("Rogue")) {
                System.out.println("Are you sure you want to be a Rogue?");
                String newChoice = sca.nextLine();
                
                if (newChoice.equalsIgnoreCase("Yes")) {
                    boolean newX = true;
                    while (newX) {
                        System.out.println("Which class would you like to put your points into? You have " + points + " remaining." + "\nOptions: Strength, Dexterity, Intelligence, Constitution, and Charisma");
                        Scanner sc = new Scanner(System.in);
                        
                        newX = false;
                        if (points == 0) {
                            System.out.println("You have put all your points into their specified categories. Your stats are: \nCharacter Name: " + charName + "\nCharacter Title: " + charTitle + "\nPoints Breakdown: \n   Strength: " + strength + "\n   Dexterity: " + dexterity + "\n   Intelligence: " + intelligence + "\n   Constitution: " + constitution + "\n   Charisma: " + charisma);
                        } else {
                           
                            
                            
                            String pointChosen = sc.next();
                            
                            if (pointChosen.equalsIgnoreCase("Strength")) {
                                if (strength != 10) {
                                    System.out.println("How many points would you like to put in?");
                                    int pointAmount = sc.nextInt();
                                    if (pointAmount <= 10) {
                                        if (pointAmount > 0) {
                                            
                                            if (points >= pointAmount) {
                                                
                                                System.out.println("You have put " + pointAmount + " points into Strength.");
                                                newX = true;
                                                strength = strength + pointAmount;
                                                points = points - pointAmount;
                                                
                                            } else {
                                                System.out.println("You do not have enough points to perform this action.");
                                                newX = true;
                                            }
                                            
                                        } else {
                                            System.out.println("Please choose a number greater than 0.");
                                            newX = true;
                                        }
                                    } else {
                                            System.out.println("Please choose a number less than 10.");
                                            newX = true;
                                    }
                                
                                } else {
                                    System.out.println("Strength has already hit its upper limit. Please pick a different choice.");
                                    newX = true;
                                }
                            } else if (pointChosen.equalsIgnoreCase("Dexterity")) {
                                if (dexterity != 10) {
                                    System.out.println("How many points would you like to put in?");
                                    int pointAmount = sc.nextInt();
                                    if (pointAmount <= 10) {
                                        if (pointAmount > 0) {
                                            
                                            if (points >= pointAmount) {
                                                
                                                System.out.println("You have put " + pointAmount + " into Dexterity.");
                                                newX = true;
                                                dexterity = dexterity + pointAmount;
                                                points = points - pointAmount;
                                            } else {
                                                System.out.println("You do not have enough points to perform this action.");
                                                newX = true;
                                            }
                                            
                                        } else {
                                            System.out.println("Please choose a number greater than 0.");
                                            newX = true;
                                        }
                                    } else {
                                            System.out.println("Please choose a number less than 10.");
                                            newX = true;
                                    }
                                } else {
                                    System.out.println("Dexterity has already hit its upper limit. Please pick a different choice.");
                                    newX = true;
                                }
                            } else if (pointChosen.equalsIgnoreCase("Intelligence")) {
                                if (intelligence != 10) {
                                    System.out.println("How many points would you like to put in?");
                                    int pointAmount = sc.nextInt();
                                    if (pointAmount <= 10) {
                                        if (pointAmount > 0) {
                                            
                                            if (points >= pointAmount) {
                                                
                                                System.out.println("You have put " + pointAmount + " into Intelligence.");
                                                newX = true;
                                                intelligence = intelligence + pointAmount;
                                                points = points - pointAmount;
                                            } else {
                                                System.out.println("You do not have enough points to perform this action.");
                                                newX = true;
                                            }
                                            
                                        } else {
                                            System.out.println("Please choose a number greater than 0.");
                                            newX = true;
                                        }
                                    } else {
                                            System.out.println("Please choose a number less than 10.");
                                            newX = true;
                                    }
                                } else {
                                    System.out.println("Intelligence has already hit its upper limit. Please pick a different choice.");
                                    newX = true;
                                }
                            } else if (pointChosen.equalsIgnoreCase("Constitution")) {
                                if (constitution != 10) {
                                    System.out.println("How many points would you like to put in?");
                                    int pointAmount = sc.nextInt();
                                    if (pointAmount <= 10) {
                                        if (pointAmount > 0) {
                                            
                                            if (points >= pointAmount) {
                                                
                                                System.out.println("You have put " + pointAmount + " into Constitution.");
                                                newX = true;
                                                constitution = constitution + pointAmount;
                                                points = points - pointAmount;
                                            } else {
                                                System.out.println("You do not have enough points to perform this action.");
                                                newX = true;
                                            }
                                            
                                        } else {
                                            System.out.println("Please choose a number greater than 0.");
                                            newX = true;
                                        }
                                    } else {
                                            System.out.println("Please choose a number less than 10.");
                                            newX = true;
                                    }
                                } else {
                                    System.out.println("Constitution has already hit its upper limit. Please pick a different choice.");
                                    newX = true;
                                }
                            } else if (pointChosen.equalsIgnoreCase("Charisma")) {
                                if (charisma != 10) {
                                    System.out.println("How many points would you like to put in?");
                                    int pointAmount = sc.nextInt();
                                    if (pointAmount <= 10) {
                                        if (pointAmount > 0) {
                                            
                                            if (points >= pointAmount) {
                                                
                                                System.out.println("You have put " + pointAmount + " into Charisma.");
                                                newX = true;
                                                charisma = charisma + pointAmount;
                                                points = points - pointAmount;
                                            } else {
                                                System.out.println("You do not have enough points to perform this action.");
                                                newX = true;
                                            }
                                            
                                        } else {
                                            System.out.println("Please choose a number greater than 0.");
                                            newX = true;
                                        }
                                    } else {
                                            System.out.println("Please choose a number less than 10.");
                                            newX = true;
                                    }
                                } else {
                                    System.out.println("Charisma has already hit its upper limit. Please pick a different choice.");
                                    newX = true;
                                }
                            } else {
                                
                                System.out.println("Please pick a valid option.");
                                newX = true;
                                
                            }
                        }
                    }
                } else if (newChoice.equalsIgnoreCase("No")) {
                    System.out.println("Repick your choice.");
                    x = true;
                } else {
                    System.out.println("Invalid input entered. Please use Yes or No next time when confirming.");
                    x = true;
                }
            } else {
                System.out.println("Please pick a valid choice.");
                x = true;
            }
        
        }
	}
	

    
}




