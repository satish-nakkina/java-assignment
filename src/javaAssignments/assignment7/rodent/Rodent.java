package javaAssignments.assignment7.rodent;

abstract class Rodent {


    public abstract void run();
    public abstract void walk();
    public void move() {
        System.out.println("Rodent is moving.");
    }
}