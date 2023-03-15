package javaAssignments.assignment3;



//Write a java function that will ping any host ( given as input ) and computes the median of the time taken to ping.

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        PingHost pingHost = new PingHost();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter url to test ping:");
        String url = sc.nextLine();
        System.out.println("Enter no of time to check ping:");
        String rounds = sc.nextLine();
        System.out.println("Median:" + pingHost.runPing(url,rounds));
    }
}

