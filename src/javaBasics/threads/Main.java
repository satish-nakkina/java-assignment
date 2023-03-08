package javaBasics.threads;

public class Main {
    public static void main(String[] args) {
        MyRunnable thread1 = new MyRunnable("Thread 1", 5);
        MyRunnable thread2 = new MyRunnable("Thread 2", 5);

        thread1.start();
        thread2.start();
    }
}
