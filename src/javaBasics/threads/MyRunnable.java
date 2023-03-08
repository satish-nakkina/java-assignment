package javaBasics.threads;
public class MyRunnable extends Thread {
    private String name;
    private int count;

    public MyRunnable(String name, int count) {
        this.name = name;
        this.count = count;
    }

    public void run() {
        for (int i = 1; i <= count; i++) {
            System.out.println(name + ": " + i);
            try {
                Thread.sleep(1000); // sleep for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}