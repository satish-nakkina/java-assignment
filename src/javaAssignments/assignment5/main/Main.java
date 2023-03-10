package javaAssignments.assignment5.main;

import javaAssignments.assignment5.data.Data;
import javaAssignments.assignment5.singleton.Singleton;

public class Main {
    public static void main(String[] args){
        Data data = new Data();
//        data.printLocalVariables();
        data.printVariables();

        Singleton myObject = Singleton.getInstance("Hello");

        myObject.printString();
    }
}
