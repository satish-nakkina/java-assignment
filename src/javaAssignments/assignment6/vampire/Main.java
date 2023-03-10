package javaAssignments.assignment6.vampire;

//A vampire number v is a number with an even number of digits n,
// that can be factored into two numbers x and y each with n/2 digits and not both with trailing zeroes,
// where v contains precisely all the digits from x and from y, in any order.
// Write a java program to print first 100 vampire numbers.
import java.util.ArrayList;

public class Main {

    public static void main(String[] args){
        int count=0;
        int num=10;
        ArrayList<Integer> vampireNumbers = new ArrayList<>();
        Vampire vampire= new Vampire();
        while(count<100){
            if(vampire.isVampireNumber(num)){
                count++;
                vampireNumbers.add(num);
            }
            num++;
        }
        System.out.println("First 100 vampire numbers are..");
        System.out.println(vampireNumbers);
    }
}
