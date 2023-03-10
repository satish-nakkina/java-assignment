package javaAssignments.assignment1;

import java.io.File;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SearchFile {

    public void searchFile(String regex){

        Pattern pattern = Pattern.compile(regex);

        File homeDir = new File(System.getProperty("user.home"));

        Scanner scanner = new Scanner(System.in);
        System.out.println(homeDir);
        while (true) {
            System.out.println("Enter file name :");
            String fileName = scanner.nextLine();

            File[] matchingFiles = homeDir.listFiles((dir, name) -> {
                Matcher matcher = pattern.matcher(name);
                return matcher.matches() && name.contains(fileName);
            });

            if (matchingFiles.length == 0) {
                System.out.println("No files found");
            } else {
                System.out.println("Found " + matchingFiles.length + " files:");

                for (File file : matchingFiles) {
                    System.out.println(file.getAbsolutePath());
                }
            }
            System.out.println("continue the search y/n :");
            String search=scanner.nextLine();
            if(search.equalsIgnoreCase("n")){
                break;
            }
        }


    }

}
