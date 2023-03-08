package javaBasics.exceptions;

import java.util.Scanner;

public class Basic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Enter a number: ");
            int num1 = input.nextInt();

            System.out.print("Enter another number: ");
            int num2 = input.nextInt();

            int quotient = num1 / num2;
            System.out.println("Quotient: " + quotient);

            int[] arr = new int[3];
            arr[3] = 10;

        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero!");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index out of bounds!");
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            System.out.println("Done!");
        }
    }
}
