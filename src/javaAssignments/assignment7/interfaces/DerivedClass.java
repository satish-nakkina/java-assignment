package javaAssignments.assignment7.interfaces;

public class DerivedClass extends MyBaseClass implements CombinedInterface{
    @Override
    public void newMethod() {
        System.out.println("This is the new method.");
    }

    @Override
    public void method1a() {
        System.out.println("This is method 1a.");
    }

    @Override
    public void method1b() {
        System.out.println("This is method 1b.");

    }

    @Override
    public void method2a() {
        System.out.println("This is method 2a.");
    }

    @Override
    public void method2b() {
        System.out.println("This is method 2b.");
    }

    @Override
    public void method3a() {
        System.out.println("This is method 3a.");
    }

    @Override
    public void method3b() {
        System.out.println("This is method 3b.");

    }
}
