package javaAssignments.assignment9;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//write and test a regular expression that checks a sentence to see that it begins with a capital letter and ends with a period.
public class Main {

    public static void main(String[] args){

        Scanner scanner= new Scanner(System.in);
        String input=scanner.nextLine();
        PatternMatcher patternMatcher=new PatternMatcher();
        patternMatcher.pattern(input);
    }
}
