package javaAssignments.assignment12;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StudentAnalysis {

    public static void printDepartments(List<Student> studentList) {
        System.out.println("Departments in the college:");
        studentList.stream()
                .map(Student::getEngDepartment)
                .distinct()
                .forEach(System.out::println);


    }

    public static void studentsEnrolledAfter2018(List<Student> studentList) {
        System.out.println("Students enrolled after 2018:");
        studentList.stream()
                .filter(student -> student.getYearOfEnrollment() > 2018)
                .map(Student::getName)
                .forEach(System.out::println);


    }

    public static void maleStudentsInCompDept(List<Student> studentList) {
        System.out.println("Male students in computer science dept:");
        studentList.stream()
                .filter(student -> student.getGender().equalsIgnoreCase("Male") && student.getEngDepartment().equalsIgnoreCase("Computer Science"))
                .forEach(System.out::println);

    }

    public static void GenderCount(List<Student> studentList) {

      System.out.println(studentList.stream().
              collect(Collectors.groupingBy(Student::getGender, Collectors.counting())));

    }

    public static void AverageAge(List<Student> studentList) {
        System.out.println(studentList.stream().
                collect(Collectors.groupingBy(Student::getGender, Collectors.averagingDouble(Student::getAge))));

    }

    public static void StudentWithHighestPercentage(List<Student> studentList) {
        String studentHighPercentage = studentList.stream()
                .max(Comparator.comparingDouble(student -> student.getPerTillDate()))
                .map(student -> student.getName())
                .orElse("");

        System.out.println(studentHighPercentage);
    }
    public static void  StudentsCountByDept(List<Student> studentList) {
         System.out.println(studentList.stream().
                 collect(Collectors.groupingBy(Student::getEngDepartment, Collectors.counting())));

    }

    public static void AveragePercentageByDepartment(List<Student> students) {
        System.out.println(students.stream()
                .collect(Collectors.groupingBy(Student::getEngDepartment,
                        Collectors.averagingDouble(Student::getPerTillDate))));
    }
    public static void youngestMaleInElectronicDept(List<Student> students) {
        System.out.println(students.stream()
                .filter(student -> student.getGender().equals("Male") && student.getEngDepartment().equals("Electronic"))
                .min(Comparator.comparingInt(Student::getAge)));
    }

    public static void studentsInCompDept(List<Student> students) {
        long count = students.stream()
                .filter(s -> s.getEngDepartment().equals("Computer Science"))
                .count();


        System.out.println("no of students in computer science department are:"+count);
    }


}


