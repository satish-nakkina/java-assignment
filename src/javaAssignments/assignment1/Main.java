package javaAssignments.assignment1;

import java.io.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Problem statement

//Create a java program to search through the home directory and look for files that match a regular expression.
// The program should be able to take inputs repeatedly and should print out the full absolute path of the matching files found.

//.*\.(.*)$
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter regular expression:");
        String regex = scanner.nextLine();
        SearchFile fileSearch=new SearchFile();

        fileSearch.searchFile(regex);

        scanner.close();
    }
}
