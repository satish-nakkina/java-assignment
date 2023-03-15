package javaAssignments.assignment10;



public class Main {
    public static void main(String[] args){

        SList<String> list=new SList<>();
        SListIterator<String> employee=new SListIterator<>(list);
        employee.add("Jagadeesh");

        employee.add("Jayanth");
        System.out.println(list);
        employee.add("Harsha");
        employee.add("Satish");
        employee.remove("Jayanth");

        System.out.println(list);

    }
}
