package javaAssignments.assignment9;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcher {

    public void pattern(String input){
        Pattern pattern = Pattern.compile("^[A-Z].*\\.$");
        Matcher matcher = pattern.matcher(input);
        boolean matches = matcher.matches();
        System.out.println(matches);
    }
}
