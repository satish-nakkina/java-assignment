package javaAssignments.assignment11;

import java.io.*;
import java.util.*;
public class CharacterCounter {

    public void charCounter(String fileName)throws IOException{
        Map<Character, Integer> charCountMap = new HashMap<>();

        //Reading from file.
        try (BufferedReader fileReader = new BufferedReader(new FileReader(fileName))) {

            int charCode;
            while ((charCode = fileReader.read()) != -1) {
                char character = (char) charCode;
                int count = charCountMap.getOrDefault(character, 0);
                charCountMap.put(character, count + 1);
            }
            try (PrintWriter fileWriter = new PrintWriter(new FileWriter("char_count.txt"))) {
                for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
                    char character = entry.getKey();
                    int count = entry.getValue();
                    fileWriter.println(character + ": " + count);
                }
                System.out.println("Character count saved to char_count.txt");
            }
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }

        //Printing into file.
        try (PrintWriter writer = new PrintWriter(new FileWriter("char_count.txt"))) {
            for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
                writer.println(entry.getKey() + ": " + entry.getValue());
            }
        }catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
        System.out.println("Character count saved to char_count.txt");
    }
}
