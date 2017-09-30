package com.company;
import java.util.Scanner;
public class Basement {

    private boolean fuseBox;

  public void mapBasement() {
      System.out.println("    | |=[X]");
      System.out.println("    | |");
      System.out.println("[ ]=| |=[ ]");
      System.out.println("    | |");
      System.out.println("[ ]=| |=[ ]");
  }
    public void enterBasement(Protagonist p){
      Scanner userInput = new Scanner(System.in);
        System.out.println("Your flashlight illuminates the basement.");
        System.out.println("You see power tools and random assorted things from the past.");
        System.out.println("In the corner you see the a fuse box.");
        System.out.println("What do you want to do?");
        while (true) {
            String input = userInput.nextLine();
            if (input.contains("goto") && input.contains("fuse")) {
                System.out.println("You walk up to the fuse box.");
                System.out.println("There is a lock on the fuse box.");
                if (p.getKey() == true) {
                    System.out.println("You use the key to unlock the fuse box.");
                    System.out.println("You see that the breakers have been turned off.");
                    System.out.println("Would you like to turn the fuse off? (This will end the game) y/n");
                    input = userInput.nextLine();
                    if (input.contains("y")) {
                        System.out.println("You finally got around to turning the lights back on. Congratulations on finishing the game.");
                        p.turnOnFuse();
                        break;
                    } else {
                        System.out.println("You decide to stay in the dark.");
                        break;
                    }
                } else {
                    p.base.fuseBoxLock();
                }
            } else if (input.contains("help")) {
                p.help();
            } else if (input.contains("map")) {
                p.base.mapBasement();
            }else if(input.contains("leave")) {
                break;
            } else{
                System.out.println("invalid input");
            }
        }
    }

    public void fuseBoxLock(){
        if(!this.fuseBox){
            System.out.println("You look at the fuse-box and notice it's locked and you need a key to open it.");
            System.out.println("You remember your parents keep the key in their room.");
        }

    }
}
