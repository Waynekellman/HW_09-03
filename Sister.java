package com.company;

public class Sister {
    private static int count = 0;

    public void knock(){
        if(count < 2 ){
            System.out.println("It's locked, you decide to knock");
            System.out.println("You hear nothing coming from the other side.");
            count++;
        } else if(count == 2){
            System.out.println("It's locked, you decide to knock");
            System.out.println("LEAVE ME ALONE! I'M TRYING TO SLEEP!");
            count++;
        } else {
            System.out.println("You decide to not disturb the beast inside lest you unleash it's wrath.");
        }
    }
}
