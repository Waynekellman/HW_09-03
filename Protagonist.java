package com.company;

public class Protagonist {

    private boolean flashlight = false;
    private boolean Key = false;
    private boolean haveFlashLight = false;
    private boolean fuse = false;
    protected Parents par = new Parents();
    protected Basement base = new Basement();
    protected Bedroom bed = new Bedroom();
    protected Hallway hall = new Hallway();
    protected Kitchen kit = new Kitchen();
    protected Sister sis = new Sister();

    public void flashlightOn(){
        this.flashlight = true;
    }

    public void keyPickUp(){
        this.Key = true;
    }

    public void takeFlashLight(){
        this.haveFlashLight = true;
    }

    public boolean getFlashLight(){
        return this.flashlight;
    }

    public boolean myFlashLight(){
        return this.haveFlashLight;
    }

    public boolean getKey() { return this.Key; }

    public void turnOnFuse() { this.fuse = true; }

    public boolean getFuse() { return this.fuse; }

    public void help(){
        System.out.println("help = show keywords");
        System.out.println("goto = goto a part of the room to interact");
        System.out.println("leave = to back away from objects or leave room");
        System.out.println("look around = look around the room");
        System.out.println("open = open intractable object");
        System.out.println("take = take object");
        System.out.println("read = read object");
        System.out.println("map = shows location");
        System.out.println("knock = knock on locked door");
    }
}
