package javaBasics.dataStructures;

import java.util.HashSet;

public class HashSets {
    public static void main(String[] args) {

        HashSet<String> set = new HashSet<>();

        // Adding elements to the HashSet
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");
        set.add("Apple"); // duplicate element

        // Accessing elements in the HashSet
        System.out.println(set);

        // Removing an element from the HashSet
        set.remove("Orange");

        // Checking if an element is in the HashSet
        System.out.println("Contains Apple? " + set.contains("Apple"));
        System.out.println("Contains Orange? " + set.contains("Orange"));

        // Iterating over the elements in the HashSet
        for (String fruit : set) {
            System.out.println(fruit);
        }
    }
}
