import java.util.Scanner;
import java.util.Random;

class starter {
    static int vbucks = 25;
    static int aim = 0;
    static int mechs = 0;
    static int gamesense = 0;
    static int igling = 0;
    static int support = 0;
    
	public static void main(String args[]) {
	    
	    Scanner sca = new Scanner(System.in);
	    
        System.out.println("What would you like your Fortnite name to be?");
        String charName = sca.nextLine();
        System.out.println("What would you like your Fortnite title to be?");
        String charTitle = sca.nextLine();
        
        boolean x = true;
        
        while (x) {
            x = false;
            System.out.println("Do you want to be a red knight, sparkplug, or wenagade waider?");
            String choice = sca.nextLine();
        
        
            if (choice.equalsIgnoreCase("red knight")) {
                System.out.println("Are you sure you want to be a red knight?");
                String newChoice = sca.nextLine();
                
                if (newChoice.equalsIgnoreCase("Yes")) {
                    
                    
                    boolean newX = true;
                    while (newX) {
                        System.out.println("Which class would you like to put your vbucks into? You have " + vbucks + " remaining. The max amount of vbucks you can put in a single class set is 10" + "\nOptions: aim, mechs, gamesense, igling, and support");
                        Scanner sc = new Scanner(System.in);
                        
                        newX = false;
                        if (vbucks == 0) {
                            System.out.println("You have put all your vbucks into their specified categories. Your stats are: \nCharacter Name: " + charName + "\nCharacter Title: " + charTitle + "\nvbucks Breakdown: \n   aim: " + aim + "\n   mechs: " + mechs + "\n   gamesense: " + gamesense + "\n   igling: " + igling + "\n   support: " + support);
                        } else {
                           
                            
                            
                            String pointChosen = sc.next();
                            
                            if (pointChosen.equalsIgnoreCase("aim")) {
                                if (aim != 10) {
                                    System.out.println("How many vbucks would you like to put in?");
                                    int pointAmount = sc.nextInt();
                                    if (pointAmount <= 10) {
                                        if (pointAmount > 0) {
                                            
                                            if (vbucks >= pointAmount) {
                                                
                                                System.out.println("You have put " + pointAmount + " vbucks into aim.");
                                                newX = true;
                                                aim = aim + pointAmount;
                                                vbucks = vbucks - pointAmount;
                                                
                                            } else {
                                                System.out.println("You do not have enough vbucks to perform this action.");
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
                                    System.out.println("aim has already hit its upper limit. Please pick a different choice.");
                                    newX = true;
                                }
                            } else if (pointChosen.equalsIgnoreCase("mechs")) {
                                if (mechs != 10) {
                                    System.out.println("How many vbucks would you like to put in?");
                                    int pointAmount = sc.nextInt();
                                    if (pointAmount <= 10) {
                                        if (pointAmount > 0) {
                                            
                                            if (vbucks >= pointAmount) {
                                                
                                                System.out.println("You have put " + pointAmount + " into mechs.");
                                                newX = true;
                                                mechs = mechs + pointAmount;
                                                vbucks = vbucks - pointAmount;
                                            } else {
                                                System.out.println("You do not have enough vbucks to perform this action.");
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
                                    System.out.println("mechs has already hit its upper limit. Please pick a different choice.");
                                    newX = true;
                                }
                            } else if (pointChosen.equalsIgnoreCase("gamesense")) {
                                if (gamesense != 10) {
                                    System.out.println("How many vbucks would you like to put in?");
                                    int pointAmount = sc.nextInt();
                                    if (pointAmount <= 10) {
                                        if (pointAmount > 0) {
                                            
                                            if (vbucks >= pointAmount) {
                                                
                                                System.out.println("You have put " + pointAmount + " into gamesense.");
                                                newX = true;
                                                gamesense = gamesense + pointAmount;
                                                vbucks = vbucks - pointAmount;
                                            } else {
                                                System.out.println("You do not have enough vbucks to perform this action.");
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
                                    System.out.println("gamesense has already hit its upper limit. Please pick a different choice.");
                                    newX = true;
                                }
                            } else if (pointChosen.equalsIgnoreCase("igling")) {
                                if (igling != 10) {
                                    System.out.println("How many vbucks would you like to put in?");
                                    int pointAmount = sc.nextInt();
                                    if (pointAmount <= 10) {
                                        if (pointAmount > 0) {
                                            
                                            if (vbucks >= pointAmount) {
                                                
                                                System.out.println("You have put " + pointAmount + " into igling.");
                                                newX = true;
                                                igling = igling + pointAmount;
                                                vbucks = vbucks - pointAmount;
                                            } else {
                                                System.out.println("You do not have enough vbucks to perform this action.");
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
                                    System.out.println("igling has already hit its upper limit. Please pick a different choice.");
                                    newX = true;
                                }
                            } else if (pointChosen.equalsIgnoreCase("support")) {
                                if (support != 10) {
                                    System.out.println("How many vbucks would you like to put in?");
                                    int pointAmount = sc.nextInt();
                                    if (pointAmount <= 10) {
                                        if (pointAmount > 0) {
                                            
                                            if (vbucks >= pointAmount) {
                                                
                                                System.out.println("You have put " + pointAmount + " into support.");
                                                newX = true;
                                                support = support + pointAmount;
                                                vbucks = vbucks - pointAmount;
                                            } else {
                                                System.out.println("You do not have enough vbucks to perform this action.");
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
                                    System.out.println("support has already hit its upper limit. Please pick a different choice.");
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
            } else if (choice.equalsIgnoreCase("sparkplug")){
                System.out.println("Are you sure you want to be a sparkplug?");
                String newChoice = sca.nextLine();
                
                if (newChoice.equalsIgnoreCase("Yes")) {
                    boolean newX = true;
                    
                    while (newX) {
                        System.out.println("Which class would you like to put your vbucks into? You have " + vbucks + " remaining." + "\nOptions: aim, mechs, gamesense, igling, and support");
                        Scanner sc = new Scanner(System.in);
                        
                        newX = false;
                        if (vbucks == 0) {
                            System.out.println("You have put all your vbucks into their specified categories. Your stats are: \nCharacter Name: " + charName + "\nCharacter Title: " + charTitle + "\nvbucks Breakdown: \n   aim: " + aim + "\n   mechs: " + mechs + "\n   gamesense: " + gamesense + "\n   igling: " + igling + "\n   support: " + support);
                        } else {
                           
                            
                            
                            String pointChosen = sc.next();
                            
                            if (pointChosen.equalsIgnoreCase("aim")) {
                                if (aim != 10) {
                                    System.out.println("How many vbucks would you like to put in?");
                                    int pointAmount = sc.nextInt();
                                    if (pointAmount <= 10) {
                                        if (pointAmount > 0) {
                                            
                                            if (vbucks >= pointAmount) {
                                                
                                                System.out.println("You have put " + pointAmount + " vbucks into aim.");
                                                newX = true;
                                                aim = aim + pointAmount;
                                                vbucks = vbucks - pointAmount;
                                                
                                            } else {
                                                System.out.println("You do not have enough vbucks to perform this action.");
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
                                    System.out.println("aim has already hit its upper limit. Please pick a different choice.");
                                    newX = true;
                                }
                            } else if (pointChosen.equalsIgnoreCase("mechs")) {
                                if (mechs != 10) {
                                    System.out.println("How many vbucks would you like to put in?");
                                    int pointAmount = sc.nextInt();
                                    if (pointAmount <= 10) {
                                        if (pointAmount > 0) {
                                            
                                            if (vbucks >= pointAmount) {
                                                
                                                System.out.println("You have put " + pointAmount + " into mechs.");
                                                newX = true;
                                                mechs = mechs + pointAmount;
                                                vbucks = vbucks - pointAmount;
                                            } else {
                                                System.out.println("You do not have enough vbucks to perform this action.");
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
                                    System.out.println("mechs has already hit its upper limit. Please pick a different choice.");
                                    newX = true;
                                }
                            } else if (pointChosen.equalsIgnoreCase("gamesense")) {
                                if (gamesense != 10) {
                                    System.out.println("How many vbucks would you like to put in?");
                                    int pointAmount = sc.nextInt();
                                    if (pointAmount <= 10) {
                                        if (pointAmount > 0) {
                                            
                                            if (vbucks >= pointAmount) {
                                                
                                                System.out.println("You have put " + pointAmount + " into gamesense.");
                                                newX = true;
                                                gamesense = gamesense + pointAmount;
                                                vbucks = vbucks - pointAmount;
                                            } else {
                                                System.out.println("You do not have enough vbucks to perform this action.");
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
                                    System.out.println("gamesense has already hit its upper limit. Please pick a different choice.");
                                    newX = true;
                                }
                            } else if (pointChosen.equalsIgnoreCase("igling")) {
                                if (igling != 10) {
                                    System.out.println("How many vbucks would you like to put in?");
                                    int pointAmount = sc.nextInt();
                                    if (pointAmount <= 10) {
                                        if (pointAmount > 0) {
                                            
                                            if (vbucks >= pointAmount) {
                                                
                                                System.out.println("You have put " + pointAmount + " into igling.");
                                                newX = true;
                                                igling = igling + pointAmount;
                                                vbucks = vbucks - pointAmount;
                                            } else {
                                                System.out.println("You do not have enough vbucks to perform this action.");
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
                                    System.out.println("igling has already hit its upper limit. Please pick a different choice.");
                                    newX = true;
                                }
                            } else if (pointChosen.equalsIgnoreCase("support")) {
                                if (support != 10) {
                                    System.out.println("How many vbucks would you like to put in?");
                                    int pointAmount = sc.nextInt();
                                    if (pointAmount <= 10) {
                                        if (pointAmount > 0) {
                                            
                                            if (vbucks >= pointAmount) {
                                                
                                                System.out.println("You have put " + pointAmount + " into support.");
                                                newX = true;
                                                support = support + pointAmount;
                                                vbucks = vbucks - pointAmount;
                                            } else {
                                                System.out.println("You do not have enough vbucks to perform this action.");
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
                                    System.out.println("support has already hit its upper limit. Please pick a different choice.");
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
            } else if (choice.equalsIgnoreCase("wenagade waider")) {
                System.out.println("Are you sure you want to be a wenagade waider?");
                String newChoice = sca.nextLine();
                
                if (newChoice.equalsIgnoreCase("Yes")) {
                    boolean newX = true;
                    while (newX) {
                        System.out.println("Which class would you like to put your vbucks into? You have " + vbucks + " remaining." + "\nOptions: aim, mechs, gamesense, igling, and support");
                        Scanner sc = new Scanner(System.in);
                        
                        newX = false;
                        if (vbucks == 0) {
                            System.out.println("You have put all your vbucks into their specified categories. Your stats are: \nCharacter Name: " + charName + "\nCharacter Title: " + charTitle + "\nvbucks Breakdown: \n   aim: " + aim + "\n   mechs: " + mechs + "\n   gamesense: " + gamesense + "\n   igling: " + igling + "\n   support: " + support);
                        } else {
                           
                            
                            
                            String pointChosen = sc.next();
                            
                            if (pointChosen.equalsIgnoreCase("aim")) {
                                if (aim != 10) {
                                    System.out.println("How many vbucks would you like to put in?");
                                    int pointAmount = sc.nextInt();
                                    if (pointAmount <= 10) {
                                        if (pointAmount > 0) {
                                            
                                            if (vbucks >= pointAmount) {
                                                
                                                System.out.println("You have put " + pointAmount + " vbucks into aim.");
                                                newX = true;
                                                aim = aim + pointAmount;
                                                vbucks = vbucks - pointAmount;
                                                
                                            } else {
                                                System.out.println("You do not have enough vbucks to perform this action.");
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
                                    System.out.println("aim has already hit its upper limit. Please pick a different choice.");
                                    newX = true;
                                }
                            } else if (pointChosen.equalsIgnoreCase("mechs")) {
                                if (mechs != 10) {
                                    System.out.println("How many vbucks would you like to put in?");
                                    int pointAmount = sc.nextInt();
                                    if (pointAmount <= 10) {
                                        if (pointAmount > 0) {
                                            
                                            if (vbucks >= pointAmount) {
                                                
                                                System.out.println("You have put " + pointAmount + " into mechs.");
                                                newX = true;
                                                mechs = mechs + pointAmount;
                                                vbucks = vbucks - pointAmount;
                                            } else {
                                                System.out.println("You do not have enough vbucks to perform this action.");
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
                                    System.out.println("mechs has already hit its upper limit. Please pick a different choice.");
                                    newX = true;
                                }
                            } else if (pointChosen.equalsIgnoreCase("gamesense")) {
                                if (gamesense != 10) {
                                    System.out.println("How many vbucks would you like to put in?");
                                    int pointAmount = sc.nextInt();
                                    if (pointAmount <= 10) {
                                        if (pointAmount > 0) {
                                            
                                            if (vbucks >= pointAmount) {
                                                
                                                System.out.println("You have put " + pointAmount + " into gamesense.");
                                                newX = true;
                                                gamesense = gamesense + pointAmount;
                                                vbucks = vbucks - pointAmount;
                                            } else {
                                                System.out.println("You do not have enough vbucks to perform this action.");
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
                                    System.out.println("gamesense has already hit its upper limit. Please pick a different choice.");
                                    newX = true;
                                }
                            } else if (pointChosen.equalsIgnoreCase("igling")) {
                                if (igling != 10) {
                                    System.out.println("How many vbucks would you like to put in?");
                                    int pointAmount = sc.nextInt();
                                    if (pointAmount <= 10) {
                                        if (pointAmount > 0) {
                                            
                                            if (vbucks >= pointAmount) {
                                                
                                                System.out.println("You have put " + pointAmount + " into igling.");
                                                newX = true;
                                                igling = igling + pointAmount;
                                                vbucks = vbucks - pointAmount;
                                            } else {
                                                System.out.println("You do not have enough vbucks to perform this action.");
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
                                    System.out.println("igling has already hit its upper limit. Please pick a different choice.");
                                    newX = true;
                                }
                            } else if (pointChosen.equalsIgnoreCase("support")) {
                                if (support != 10) {
                                    System.out.println("How many vbucks would you like to put in?");
                                    int pointAmount = sc.nextInt();
                                    if (pointAmount <= 10) {
                                        if (pointAmount > 0) {
                                            
                                            if (vbucks >= pointAmount) {
                                                
                                                System.out.println("You have put " + pointAmount + " into support.");
                                                newX = true;
                                                support = support + pointAmount;
                                                vbucks = vbucks - pointAmount;
                                            } else {
                                                System.out.println("You do not have enough vbucks to perform this action.");
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
                                    System.out.println("support has already hit its upper limit. Please pick a different choice.");
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





