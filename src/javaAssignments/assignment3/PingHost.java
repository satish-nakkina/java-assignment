package javaAssignments.assignment3;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class PingHost {
    double runPing(String url,String rounds) throws IOException, InterruptedException{
        Median median = new Median();
        ArrayList<Double> tripTimes = new ArrayList<>();
        ProcessBuilder processBuilder = new ProcessBuilder("ping", "-n", rounds, url);
        Process process = processBuilder.start();
        BufferedReader inputStream = new BufferedReader(new InputStreamReader(process.getInputStream()));
        String outputLine;

        while ((outputLine = inputStream.readLine()) != null) {
            if (outputLine.contains("time=")) {
                String rttString = outputLine.substring(outputLine.indexOf("time=") + 5, outputLine.indexOf("ms"));
                double time = Long.parseLong(rttString);
                tripTimes.add(time);
            }
            System.out.println(outputLine);
        }
        return median.getMedian(tripTimes);
    }
}
