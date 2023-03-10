package javaAssignments.assignment5.main;

import javaAssignments.assignment5.data.Data;
import javaAssignments.assignment5.singleton.Singleton;

//Create main class in package yourname.assignment.main,
// create object of first class and call both the methods to print the values.
// Create object of second class using static method and then call the other method to print the String.
public class Main {
    public static void main(String[] args){
        Data data = new Data();
//        data.printLocalVariables();
        data.printVariables();

        Singleton myObject = Singleton.getInstance("Hello");

        myObject.printString();
    }
}
