package javaAssignments.assignment7.cycleFactory;

public class Main {
    public static void main(String[] args) {
        Cycle unicycle = CycleFactory.getUnicycle();
        Cycle bicycle = CycleFactory.getBicycle();
        Cycle tricycle = CycleFactory.getTricycle();

        unicycle.ride();
        bicycle.ride();
        tricycle.ride();
    }
}
