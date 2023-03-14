package javaAssignments.assignment11;

import java.io.*;
import java.util.*;

public class Main{

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the file name: ");
        String fileName = scanner.nextLine();
        CharacterCounter characterCounter=new CharacterCounter();
        characterCounter.charCounter(fileName);
    }
}
