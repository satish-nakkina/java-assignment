package javaBasics.dataStructures;
import java.util.HashMap;
public class HashMaps {

    public static void main(String[] args){
        HashMap<String,Integer> employee=new HashMap<>();

        //adding elements into HashMap
        employee.put("Satish",25);
        employee.put("Marsha",40);

        //accessing elements

        System.out.println("Satish's score: " + employee.get("Satish"));
        System.out.println("Marsha's score: " + employee.get("Bob"));

        //updating elements

        employee.put("Satish",30);
        System.out.println("Satish's score: " + employee.get("Satish"));

        //removing  elements

        employee.remove("Marsha");

        for(String name:employee.keySet()){
            int score=employee.get(name);
            System.out.println(name +"'s score: "+score);
        }
    }
}
