package javaAssignments.assignment4;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class KycRange {
    void getRange(LocalDate signupDate,LocalDate currentDate){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        int yearsToAdd = currentDate.getYear() - signupDate.getYear();
        LocalDate fromDate = signupDate.plusYears(yearsToAdd).minusDays(30);
        LocalDate toDate = signupDate.plusYears(yearsToAdd).plusDays(30);
        if(currentDate.getYear() <= signupDate.getYear()) {
            System.out.println("No range");
            return;
        }
        else if(currentDate.isAfter(fromDate) && currentDate.isBefore(toDate)) {
            System.out.println(fromDate.format(formatter) + " " + currentDate.format(formatter));
        }
        else{
            System.out.println(fromDate.format(formatter) + " " + toDate.format(formatter));
        }
    }
}

