package javaAssignments.assignment4;
//Gruber Healthcare has different types of forms for their customer, one of which is a know your customer form ( KYC ) which has to be filled annually. Each form has a date which signifies the date the form was filled called the form date.
//
//Due to government regulations the KYC form can only be filled within + or - 30 days of the signup anniversary of a customer. When filling it up, you have to provide the form date. If you are past the +-30 day anniversary then you can back-date it so that it falls in the +-30-day window. When filling it up you cannot use a future date for the form date.
//
//For Example, assuming today is 4 Apr 2017 and I had signed up on 1st Mar 2014, my window for KYC submission this year would be 30 Jan 2017 to 31 Mar 2017. Since it is already 4th Apr - I would have to back-date the KYC to a date in this range.


import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        KycRange kycRange = new KycRange();
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();
        while (tests-- > 0){
            String signupDateStr = sc.next();
            String currentDateStr = sc.next();
            LocalDate signupDate = LocalDate.parse(signupDateStr, formatter);
            LocalDate currentDate = LocalDate.parse(currentDateStr, formatter);
            kycRange.getRange(signupDate,currentDate);
        }
    }
}
