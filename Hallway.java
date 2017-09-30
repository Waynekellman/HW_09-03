package com.company;

public class Hallway {

    public void mapHallway() {
        System.out.println("    |X|=[ ]");
        System.out.println("    |X|");
        System.out.println("[ ]=|X|=[ ]");
        System.out.println("    |X|");
        System.out.println("[ ]=|X|=[ ]");
    }
    public void enteredHallway(Protagonist p){
        if(p.getFlashLight()) {
            System.out.println("The flashlight illuminates the hallway.");
            System.out.println("You see doorways lining the hallway.");
            System.out.println("Your sisters room is right across from yours.");
            System.out.println("Your parents rooms is next to your sisters room.");
            System.out.println("The kitchen is next to your room.");
            System.out.println("The basement door is at the end of the hall.");
            System.out.println("where do you want to go now?");
        } else {
            System.out.println("You enter the hallway but can't see anything.");
        }
    }
}
