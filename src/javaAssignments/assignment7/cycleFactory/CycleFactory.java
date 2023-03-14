package javaAssignments.assignment7.cycleFactory;

public class CycleFactory {
    public static Cycle getUnicycle() {
        return new Unicycle();
    }

    public static Cycle getBicycle() {
        return new Bicycle();
    }

    public static Cycle getTricycle() {
        return new Tricycle();
    }
}
