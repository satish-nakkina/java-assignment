package javaBasics.dataStructures;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {


        Stack<String> stack = new Stack<>();

        // Push elements onto the stack
        stack.push("a");
        stack.push("b");
        stack.push("c");

        // Print the stack
        System.out.println("Stack: " + stack);

        // Pop the top element from the stack
        String top = stack.pop();
        System.out.println("Popped element: " + top);

        // Print the stack again
        System.out.println("Stack after pop: " + stack);

        // Peek at the top element without removing it
        String peeked = stack.peek();
        System.out.println("Peeked element: " + peeked);

        // Print the stack again
        System.out.println("Stack after peek: " + stack);

        // Check if the stack is empty
        boolean empty = stack.empty();
        System.out.println("Is stack empty? " + empty);

        // Search for an element in the stack
        int index = stack.search("b");
        System.out.println("Index of 'b': " + index);
    }
}
