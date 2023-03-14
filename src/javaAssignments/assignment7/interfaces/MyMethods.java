package javaAssignments.assignment7.interfaces;

public class MyMethods {
    public void method1(Interface1 obj) {
        obj.method1a();
        obj.method1b();
    }
    public void method2(Interface2 obj) {
        obj.method2a();
        obj.method2b();
    }
    public void method3(Interface3 obj) {
        obj.method3a();
        obj.method3b();
    }
    public void method4(CombinedInterface obj) {
        obj.method1a();
        obj.method2b();
        obj.method3a();
        obj.newMethod();
    }
}