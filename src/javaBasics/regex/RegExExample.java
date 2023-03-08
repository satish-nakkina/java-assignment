package javaBasics.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExExample {

    public  static void main(String[] args){
        String text="The cat sat on the mat and ate ate ate his food.";

        String patternString="ate";
        Pattern pattern=Pattern.compile(patternString);
        Matcher matcher=pattern.matcher(text);

        if(matcher.find()){
            System.out.println("match found "+matcher.group());
        }
        else{
            System.out.println("match not found");
        }
    }
}
