package javaAssignments.assignment6.constructor;

//Create a class with a constructor that takes a String argument.
// During construction, print the argument. Create an array of object references to this class,
// but don’t actually create objects to assign into the array.
// When you run the program, notice whether the initialization messages from the constructor calls are printed.
public class Main {

    public static void main(String[] args){
        Constructor[] constructors= new Constructor[5];

        constructors[0]=new Constructor("object 1");
        constructors[1]=new Constructor("object 2");
    }
}

