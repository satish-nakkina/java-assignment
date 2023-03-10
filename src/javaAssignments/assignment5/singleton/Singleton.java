package javaAssignments.assignment5.singleton;

//Create another class in package yourname.assignment.singleton containing a non-static String member variable.
// Add a static method that takes String as parameter and initialize the member variable and then return object of that class.
// Add a non-static method to print the String.
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
