package com.company;
import java.util.Scanner;
import java.util.Random;
public class Parents {
    private boolean lookInDrawers = true;

    public void mapParents() {
        System.out.println("    | |=[ ]");
        System.out.println("    | |");
        System.out.println("[X]=| |=[ ]");
        System.out.println("    | |");
        System.out.println("[ ]=| |=[ ]");
    }

    public void  enterParentsRoom(Protagonist p){
        Scanner userInput = new Scanner(System.in);
        System.out.println("Your flashlight illuminates the room.");
        System.out.println("You see a dresser drawer near the door.");
        System.out.println("Across from it is a well made bed. Your parents work at night.");
        System.out.println("A light switch is by the door.");
        System.out.println("And a bedside drawer.");
        System.out.println("What do you want to do?");
        while (true) {
            String input = userInput.nextLine();
            if (input.contains("goto") && input.contains("dresser")) {
                p.par.dresserDrawers();
            } else if (input.contains("goto") && input.contains("bedside")) {
                p.par.bedsideDrawer(p);
            } else if (input.contains("read") && input.contains("book")) {
                read50Shades();
            } else if (input.contains("map")) {
                p.par.mapParents();
            }else if (input.contains("leave")) {
                break;
            }else if(input.contains("switch")){
                System.out.println("The power is out.");
            } else {
                System.out.println("invalid input");
            }
        }
    }

    public void dresserDrawers(){
        if(this.lookInDrawers) {
            System.out.println("You check the dressers.");
            System.out.println("The top four drawers have assorted cloths in them.");
            System.out.println("The second to last drawer has a weird flashlight with a cap on it.");
            System.out.println("I already have one so I'll just leave this one here.");
            System.out.println("You open the last drawer only to find weird lotions and oils inside.");
            System.out.println("You decide not to look in the drawers anymore.");
            this.lookInDrawers = !this.lookInDrawers;
        } else {
            System.out.println("I already looked inside them.");
        }
    }

    public void bedsideDrawer(Protagonist p){
        Scanner userInput = new Scanner(System.in);
        System.out.println("you see a book with the title '50 Shades of Gray' and a key");
        System.out.println("What do you want to do?");
        String input = userInput.nextLine();
        if(input.contains("take") && input.contains("key")){
            p.par.takeKey(p);
        }
    }

    public void read50Shades(){
        Random rand = new Random();
        System.out.println("You open the book to a random page and start reading.");
        int page = rand.nextInt(10) + 1;
        switch (page){
            case 1:
                System.out.println("'Suddenly, he sits up and tugs my panties off and throws them on the floor.");
                System.out.println("Pulling off his boxer briefs, his erection springs free.'");
                break;
            case 2:
                System.out.println("'He's my very own Christian Grey popsicle.'");
                System.out.println("What?");
                break;
            case 3:
                System.out.println("'Argh!' I cry as I feel a weird pinching sensation deep inside me as he rips through my virginity.'");
                System.out.println("Umm...");
                break;
            case 4:
                System.out.println("'Grabbing it quickly, I squirt toothpaste on it and brush my teeth in double quick time.");
                System.out.println("I feel so naughty. It's such a thrill.'");
                System.out.println("I'm not sure I understand the context.");
                break;
            case 5:
                System.out.println("'Does this mean you're going to make love to me tonight, Christian?'");
                System.out.println("Holy shit! Did I just say that? His mouth drops open slightly, but he recovers quickly.");
                System.out.println("'No, Anastasia, it doesn't. Firstly, I don't make love. I fuck... hard.'");
                System.out.println("I don't think I should be reading this.");
                break;
            case 6:
                System.out.println("'Put the chicken in the fridge.' This is not a sentence I had ever expected to hear from Christian, ");
                System.out.println("and only he can make it sound hot, really hot.'");
                System.out.println("I like chicken too but they are on another level.");
                break;
            case 7:
                System.out.println("'Christian, you are the state lottery, the cure for cancer,");
                System.out.println("and the three wishes from Aladdin's lamp all rolled into one.'");
                System.out.println("I don't know, if you have a genie you could wish for 1 million of him.");
                break;
            case 8:
                System.out.println("'You will not be able to see me or hear me. But you’ll be able to feel me.'");
                System.out.println("Is this suppose to be romantic or sexy?");
                break;
            case 9:
                System.out.println("'I don’t know whether to worship at your feet or spank the living sh*t out of you.'");
                System.out.println("I don't think I want to know what caused that feeling in him.");
                break;
            default:
                System.out.println("But I’m a selfish man. I’ve wanted you since you fell into my office.");
                System.out.println("You are exquisite, honest, warm, strong, witty, beguilingly innocent; ");
                System.out.println("the list is endless.“I want you, ");
                System.out.println("and the thought of anyone else having you is a knife twisting in my dark soul.");
                System.out.println("That went from 0 - 100 real quick");
                break;
        }
        System.out.println("I close the book and put it down.");
    }

    public void takeKey(Protagonist p){
        p.keyPickUp();
        System.out.println("You now have the key to the breaker in the basement.");
    }
}
