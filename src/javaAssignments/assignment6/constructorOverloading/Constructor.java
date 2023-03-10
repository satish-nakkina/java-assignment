package javaAssignments.assignment6.constructorOverloading;

public class Constructor {
    private int num1;
    private int num2;

    // First constructor
    public Constructor(int num1) {
        // Call the second constructor using 'this'
        this(num1, 0);
    }

    // Second constructor
    public Constructor(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }


    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }
}
