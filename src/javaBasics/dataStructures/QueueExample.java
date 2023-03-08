package javaBasics.dataStructures;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        // Creating a Queue using a LinkedList
        Queue<String> queue = new LinkedList<>();

        // Adding elements to the Queue
        queue.add("A");
        queue.add("B");
        queue.add("C");
        queue.add("D");

        // Displaying the elements of the Queue
        System.out.println("The elements of the Queue are:");
        for (String element : queue) {
            System.out.println(element);
        }

        // Removing the first element of the Queue
        String firstElement = queue.remove();
        System.out.println("The first element of the Queue is: " + firstElement);

        // Displaying the elements of the Queue after removing the first element
        System.out.println("The elements of the Queue after removing the first element are:");
        for (String element : queue) {
            System.out.println(element);
        }
    }
}
