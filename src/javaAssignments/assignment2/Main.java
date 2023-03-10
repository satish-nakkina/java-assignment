package javaAssignments.assignment2;

import java.util.Scanner;

//Problem statement

//Write a java function that checks if the input string contains all the letters of the alphabet a-z (case-insensitive).

public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        Pangram freq= new Pangram();
        boolean flag=freq.pangram(str);

        if(flag){
            System.out.println("input string contains all the letters of the alphabet a-z ");
        }
        else{
            System.out.println("input string does not contain all the letters ");
        }
    }
}
