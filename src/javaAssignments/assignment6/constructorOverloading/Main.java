package javaAssignments.assignment6.constructorOverloading;

public class Main {
    public static void main(String[] args) {
        // Create an object using the first constructor
       Constructor obj1 = new Constructor(10);
        System.out.println("Num1: " + obj1.getNum1());
        System.out.println("Num2: " + obj1.getNum2());

        // Create an object using the second constructor
        Constructor obj2 = new Constructor(20, 30);
        System.out.println("Num1: " + obj2.getNum1());
        System.out.println("Num2: " + obj2.getNum2());
    }
}
