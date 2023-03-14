package javaAssignments.lambda_streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args){

        //Lambda
        List<String> names= Arrays.asList("Satish","Jagadeesh","Harsha","Jayanth");
        Collections.sort(names);

        names.forEach(name -> System.out.println(name));

        //Streams

        names.stream()
                .filter(name -> !name.startsWith("J"))
                .map(String::toUpperCase)
                .sorted()
                .forEach(name -> System.out.println(name));
    }
}
