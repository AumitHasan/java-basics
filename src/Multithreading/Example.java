package Multithreading;

public class Example {
    public static void main(String[] args) {
        Thread t =  Thread.currentThread();

        System.out.println(t); // output: Thread[main,5,main] .. [threadName, priority,
        System.out.println(t.getName());

        t.setName("My Thread");
        System.out.println("After changing thread name: " + t.getName());

        try {
            for(int i=0; i<5; i++) {
                System.out.println(i);
                Thread.sleep(1000); // may occur Interruption Exception
            }
        }
        catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }
    }
}
