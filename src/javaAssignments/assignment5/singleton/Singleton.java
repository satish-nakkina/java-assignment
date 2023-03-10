package javaAssignments.assignment5.singleton;

public class Singleton {

    private String myString;


    public static Singleton getInstance(String str) {

        Singleton instance = new Singleton();
        instance.myString = str;
        return instance;
    }

    public void printString() {
        System.out.println(myString);
    }
}
