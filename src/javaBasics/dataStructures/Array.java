package javaBasics.dataStructures;

import java.util.ArrayList;
import java.util.Iterator;

public class Array {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        // Adding elements to the ArrayList
        list.add("A");
        list.add("B");
        list.add("O");

        // Accessing elements in the ArrayList
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));

        // Removing an element
        list.remove(1);

        // Accessing elements
        System.out.println(list.get(0));
        System.out.println(list.get(1));

        // Updating an element
        list.set(0, "G");

        // Accessing elements
        System.out.println(list.get(0));

        // Getting the size of the ArrayList
        System.out.println(list.size());

        //Iterating through the ArrayList using an Iterator
        Iterator<String> iterator = list.iterator();

        while(iterator.hasNext()){
            String element=iterator.next();
            System.out.println(element);
        }


    }
}
