package javaBasics.loops;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int sum = 0;
        do {
            sum += num % 10;
            num /= 10;
        } while (num > 0);
        System.out.println("Sum of digits: " + sum);
        sc.close();
    }
}
