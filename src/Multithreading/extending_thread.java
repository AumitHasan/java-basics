package Multithreading;

class NewThread2 extends Thread {
    Thread t;

    NewThread2() {
        // invoke public Thread(String threadName)
        // super("new thread"); // optional may be
        System.out.println("child thread: " + this);
        start();
    }
    public void run() {
        try {
            for(int i=0; i<5; i++) {
                System.out.println("child thread: " + i);
                Thread.sleep(1000); // may occur Interruption Exception
            }
        }
        catch (InterruptedException e) {
            System.out.println("child thread interrupted");
        }
        System.out.println("Exiting child thread");
    }
}
class extending_thread {
    public static void main(String[] args) {
        new NewThread2();

        try {
            for(int i=0; i<5; i++) {
                System.out.println("main thread: " + i);
                Thread.sleep(500); // may occur Interruption Exception
            }
        }
        catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }
        System.out.println("exiting main thread");
    }
}
