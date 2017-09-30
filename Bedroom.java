package com.company;
import java.util.Scanner;
public class Bedroom {

    private boolean readNote = false;
    private boolean window = false;


    public void wakeUp() {
        System.out.println("You wake up in a dark room.");
        System.out.println("You can see the moonlight coming from the window but the curtains are closed.");
    }

    public void gotoWindow(){
        System.out.println("You walk near the window");
        System.out.println("The curtains are mostly closed but you can see traces of moonlight coming in.");
        System.out.println("open curtains? y/n");
        Scanner input = new Scanner(System.in);
        if(input.next().equals("y")){
            openWindow();
        }else{
            System.out.println("Some force compels me to stay in the darkness.");
        }
    }

    public void lookBedroom(){
        System.out.println("The light illuminates the room.");
        System.out.println("You see the desk you use to do homework.");
        System.out.println("Near the entrance to the door there is a light switch.");
        System.out.println("You bed is unmade since you just got up.");
        System.out.println("What would you like to do?");

    }

    public void mapBedroom() {
        System.out.println("    | |=[ ]");
        System.out.println("    | |");
        System.out.println("[ ]=| |=[ ]");
        System.out.println("    | |");
        System.out.println("[ ]=| |=[X]");
    }


    public void openWindow(){
        System.out.println("You open the curtains");
        this.window = true;
    }

    public boolean getWindow(){
        return this.window;
    }

    public void gotoDesk(Protagonist p){
        System.out.println("You walk towards your desk.");
        System.out.println("There you see a top, middle, and bottom drawer.");
        System.out.println("On top of the desk is a note.");
        System.out.println("what would you like to do?");
        Scanner input = new Scanner(System.in);
        while (true) {
            String userInput = input.nextLine();
            if (userInput.contains("read") && userInput.contains("note")) {
                deskNote();
            } else if (userInput.contains("open") && userInput.contains("top")) {
                topDrawer();
            } else if (userInput.contains("open") && userInput.contains("middle")) {
                middleDrawer(p);
            } else if (userInput.contains("open") && userInput.contains("bottom")) {
                bottomDrawer();
            } else if (userInput.contains("leave")) {
                lookBedroom();
                break;
            } else if (userInput.contains("help")) {
                p.help();
            } else if (userInput.contains("map")) {
                mapBedroom();
            }else {
                System.out.println("not a valid input");
            }
        }
    }
    public void deskNote() {
        if(!this.readNote) {
            System.out.println("There is suppose to be a power surge at night. ");
            System.out.println("Don't worry honey. I left a flashlight in your desk drawer. ");
            System.out.println("Just go down to the basement and flip the break switch. ");
            System.out.println("Remember to use the flashlight so you don't trip and break something. Love mom.");
            this.readNote = true;
        } else {
            System.out.println("I've already read the note.");
            System.out.println("The flashlight is in one of my drawers and the breaker is in the basement.");
            System.out.println("I should try to get the power on ASAP.");
        }
    }

    public static void topDrawer(){
        System.out.println("You open the top drawer.");
        System.out.println("You see some paper and assorted writing utensils.");
        System.out.println("You see nothing you need right now and close the drawer.");
    }

    public void middleDrawer(Protagonist p){
        System.out.println("You open the middle drawer.");
        System.out.println("You see a flashlight, a screwdriver, and a pair of scissors.");
        System.out.println("Do you want to take the flashlight? y/n");
        Scanner s = new Scanner(System.in);
        String input = s.next();
        if(input.equals("y")) {
            p.takeFlashLight();
            System.out.println("You take the flashlight.");
            System.out.println("You close the drawer since there's nothing else you need");
        } else {
            System.out.println("You close the drawer.");
        }

    }

    public static void bottomDrawer(){
        System.out.println("You see cards for Yu-gi-oh, Magic the Gathering, and Pokemon.");
        System.out.println("You think 'I should clean this out one day'.");
        System.out.println("I haven't played those in years.");
        System.out.println("Today isn't that day though. You close the drawer.");
    }

    public static void lightSwitch(){
        System.out.println("The power is out.");
    }

}
