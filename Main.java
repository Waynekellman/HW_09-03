package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//
        Protagonist player = new Protagonist();
        Scanner userInput = new Scanner(System.in);
        System.out.println("Welcome to Blackout player.");
        System.out.println("In this game you use simple keywords followed by a phrase to explore your surroundings.");
        System.out.println("Don't use any capitalization's.");
        System.out.println("Type help whenever to find a list of keywords.");
        System.out.println("Mature language is used in certain parts. Please be advised");
        System.out.println("");
        player.bed.wakeUp();
        System.out.println("What would you like to do?");
        while (true) {
            String input = userInput.nextLine();
            if (input.equals("help")) {
                player.help();
            } else if (input.equals("goto window")) {
                player.bed.gotoWindow();
                if (player.bed.getWindow()) {
                    break;
                }
            } else if (input.equals("leave")) {
                System.out.println("You trip over yourself trying to leave in the dark.");
                System.out.println("You decide to stay where you are.");
            } else if (input.equals("look around")) {
                System.out.println("I only see the window because of the small bit of light");
            } else if (input.equals("map")){
                player.bed.mapBedroom();
            } else if(input.contains("switch")) {
                System.out.println("The power is out.");
            }else if(input.contains("goto") && input.contains("bed")){
                System.out.println("You see the bed you just got up from. You decide to leave it for now.");
            }else{
                System.out.println("I can't do that.");
            }

        }
        System.out.println("");
        player.bed.lookBedroom();
        while (true) {
            String input = userInput.nextLine();
            if (input.equals("help")) {
                player.help();
            } else if(input.equals("goto desk")){
                player.bed.gotoDesk(player);
            }else if(input.equals("leave")) {
                player.hall.enteredHallway(player);
                break;
            }else if(input.contains("goto") && input.contains("bed")){
                    System.out.println("You see the bed you just got up from. You decide to leave it for now.");

            }else if(input.contains("switch")) {
                System.out.println("The power is out");
            }  else {
                System.out.println("invalid input");
            }
        }
        System.out.println("Turn on flashlight? y/n");
        String input = userInput.nextLine();
        if (input.equals("y")){
            player.flashlightOn();
        }
        while (true) {
            player.hall.enteredHallway(player);
            input = userInput.nextLine();
            if (input.contains("goto") && input.contains("sister")) {
                System.out.println("You walk up to your sister's room. It's locked. Maybe I should knock first");
                while (true) {
                    input = userInput.nextLine();
                    if (input.contains("knock")) {
                        player.sis.knock();
                    } else if (input.contains("leave")) {
                        break;
                    }else if(input.equals("help")){
                        player.help();
                    }else {
                        System.out.println("Invalid input");
                    }
                }
            } else if (input.contains("goto") && input.contains("parent")) {
                player.par.enterParentsRoom(player);
            } else if (input.contains("goto") && input.contains("kitchen")){
                player.kit.enterKitchen(player);
            }else if (input.contains("goto") && input.contains("basement")){
                player.base.enterBasement(player);
            } else if(input.contains("map")){
                player.hall.mapHallway();
            }
            if(player.getFuse()) {
                break;
            }
        }
    }
}




