package javaBasics.dataStructures;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        // Add elements to the list
        list.add("A");
        list.add("B");
        list.add("C");

        // Get the size of the list
        int size = list.size();
        System.out.println("Size of list: " + size);

        // Get the first and last elements of the list
        String first = list.getFirst();
        String last = list.getLast();
        System.out.println("First element: " + first);
        System.out.println("Last element: " + last);

        // Remove an element from the list
        list.remove("B");
        System.out.println("List after removing B: " + list);

        // Add an element to the beginning of the list
        list.addFirst("D");
        System.out.println("List after adding D to the beginning: " + list);

        // Add an element to the end of the list
        list.addLast("E");
        System.out.println("List after adding E to the end: " + list);
    }
}
