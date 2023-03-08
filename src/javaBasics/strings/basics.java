package javaBasics.strings;

import java.util.Scanner;

public class basics {
    public static void main(String[] args) {

        //concatenating
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a First Name: ");
        String firstName = sc.nextLine();
        System.out.print("Enter a Last Name: ");
        String lastName = sc.nextLine();
        String fullName = firstName + " " + lastName;
        System.out.println(fullName);

        //length of a string

        int length = fullName.length();
        System.out.println(length);

        //string methods
        String upperCase = fullName.toUpperCase();
        String lowerCase = fullName.toLowerCase();
        System.out.println(upperCase);
        System.out.println(lowerCase);

        char firstChar = fullName.charAt(0);
        char fifthChar = fullName.charAt(4);
        System.out.println(firstChar);
        System.out.println(fifthChar);

        //splitting string
        String str = "one,two,three,four";
        String[] parts = str.split(",");
        for (String part : parts) {
            System.out.println(part);
        }

        //string formatting


        int age = 21;
        String message = String.format("My name is %s and I am %d years old.", fullName, age);
        System.out.println(message);


        StringBuffer content=new StringBuffer("Hello");
        System.out.println(content);
        content.append("world");

    }
}
