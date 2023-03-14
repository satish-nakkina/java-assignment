package javaAssignments.assignment7.interfaces;

public class Main {

    public static void main(String[] args) {
        MyBaseClass obj = new MyBaseClass();
        DerivedClass derivedObject= new DerivedClass();

        MyMethods myMethods=new MyMethods();
        myMethods.method1(derivedObject);
        myMethods.method3(derivedObject);
        myMethods.method2(derivedObject);
        myMethods.method4(derivedObject);
    }
}
