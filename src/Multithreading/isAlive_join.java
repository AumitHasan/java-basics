package Multithreading;

class NewThread4 implements Runnable {
    String name;
    Thread t;

    NewThread4(String threadName) {
        name = threadName;
        t = new Thread(this, name);
        System.out.println("New thread: " + t);
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
public class isAlive_join {
    public static void main(String[] args) {
        NewThread4 obj1 = new NewThread4("One");
        NewThread4 obj2 = new NewThread4("Two");
        NewThread4 obj3 = new NewThread4("Three");

        System.out.println("Thread One is alive: " + obj1.t.isAlive());
        System.out.println("Thread Two is alive: " + obj2.t.isAlive());
        System.out.println("Thread Three is alive: " + obj3.t.isAlive());

        try {
            System.out.println("waiting for threads to finish");
            obj1.t.join();
            obj2.t.join();
            obj3.t.join();
        }
        catch(InterruptedException e) {
            System.out.println("Main thread interrupted");
        }

        System.out.println("Thread One is alive: " + obj1.t.isAlive());
        System.out.println("Thread Two is alive: " + obj2.t.isAlive());
        System.out.println("Thread Three is alive: " + obj3.t.isAlive());

        System.out.println("Main thread exiting");
    }
}
