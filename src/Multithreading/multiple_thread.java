package Multithreading;

class NewThread3 implements Runnable {
    String name;
    Thread t;

    NewThread3(String threadName) {
        name = threadName;
        t = new Thread(this, name);
        System.out.println("child thread: " + t);
        t.start();
    }
    public void run() {
        try {
            for(int i=0; i<5; i++) {
                System.out.println(name + " : " + i);
                Thread.sleep(1000); // may occur Interruption Exception
            }
        }
        catch (InterruptedException e) {
            System.out.println(name + "interrupted");
        }
        System.out.println(name + "Exiting");
    }
}
public class multiple_thread {
    public static void main(String[] args) {
        new NewThread3("One");
        new NewThread3("Two");
        new NewThread3("Three");

        try {
            Thread.sleep(10000);
        }
        catch(InterruptedException e) {
            System.out.println("main thread interrupted");
        }
        System.out.println("main thread exiting");

    }
}
