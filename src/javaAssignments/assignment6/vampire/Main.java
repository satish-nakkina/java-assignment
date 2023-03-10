package javaAssignments.assignment6.vampire;

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
