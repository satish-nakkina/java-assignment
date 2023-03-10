package javaAssignments.assignment1;

import java.io.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
