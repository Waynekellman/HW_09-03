package com.company;
import java.util.Scanner;
public class Kitchen {

    public void mapKitchen() {
        System.out.println("    | |=[ ]");
        System.out.println("    | |");
        System.out.println("[ ]=| |=[X]");
        System.out.println("    | |");
        System.out.println("[ ]=| |=[ ]");
    }

    public void enterKitchen(Protagonist p){
        System.out.println("You enter the kitchen.");
        System.out.println("The flashlight illuminates the room.");
        System.out.println("You see an electric stove, a fridge, a sink, and a few cabinets.");
        System.out.println("What do you want to do?");
        Scanner userInput = new Scanner(System.in);
        while (true) {
            String input = userInput.nextLine();
            if (input.contains("goto") && input.contains("stove")) {
                p.kit.turnOnStove();
            } else if (input.contains("goto") && input.contains("cabinet")) {
                p.kit.openCabinet();
            } else if (input.contains("goto") && input.contains("fridge")) {
                p.kit.openFridge();
            } else if (input.contains("goto") && input.contains("sink")) {
                p.kit.sink();
            } else if (input.contains("help")) {
                p.help();
            } else if (input.contains("leave")) {
                break;
            }else if(input.contains("map")){
                p.kit.mapKitchen();
            }else {
                System.out.println("Invalid input");
            }
        }
    }

    public void turnOnStove(){
        System.out.println("The power is out.");
    }

    public void openCabinet(){
        System.out.println("I'm kinda hungry but I should concentrate on getting the power on.");
    }

    public void openFridge(){
        System.out.println("You open the fridge.");
        System.out.println("It's still kind of cool since the power hasn't been off long.");
        System.out.println("You see milk, cheese, and other assorted food products.");
        System.out.println("You don't want to let more cool air out.");
        System.out.println("you close the fridge.");
    }

    public void sink(){
        System.out.println("You check the water. It's still running fine.");
    }
}
