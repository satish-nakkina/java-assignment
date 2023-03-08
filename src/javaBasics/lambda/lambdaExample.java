package javaBasics.lambda;

import java.util.ArrayList;
import java.util.List;

public class lambdaExample {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            numbers.add(i);
        }

        System.out.println("Original list: " + numbers);


        // Using a javaBasics.array.lambda expression to square each element in the list
        numbers.replaceAll(n -> n * n);
        System.out.println("List with squared elements: " + numbers);

        // Using a javaBasics.array.lambda expression to print out each element in the list
        numbers.forEach(n -> System.out.println(n));

        // Using a javaBasics.array.lambda expression to sum up the elements in the list
        int sum = numbers.stream().reduce(0, (a, b) -> a + b);
        System.out.println("Sum of elements in the list: " + sum);
    }
}
