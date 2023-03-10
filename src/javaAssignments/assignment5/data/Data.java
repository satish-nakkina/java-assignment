package javaAssignments.assignment5.data;

public class Data {
    private int myInt; // integer member variable not initialized
    private char myChar; // character member variable not initialized

    public void printVariables() {
        System.out.println("myInt: " + myInt);
        System.out.println("myChar: " + myChar);
    }

    public void printLocalVariables() {
        int localInt; // uninitialized integer variable
        char localChar; // uninitialized character variable
//        System.out.println("localInt: " + localInt);
//        System.out.println("localChar: " + localChar);
    }
//Java does not automatically initialize local variables with default values like it does for member variables. Local variables are allocated on the stack at runtime, and their values are not guaranteed to be predictable or consistent unless they are explicitly initialized.
//
}
