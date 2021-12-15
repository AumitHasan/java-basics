package Multithreading;

class NewThread implements Runnable {
    Thread t;

    NewThread() {
        t = new Thread(this, "new thread");
        // Thread x = new Thread();
        System.out.println("child thread: " + t);
        t.start();
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
class RUNNABLE {
    public static void main(String[] args) {
        new NewThread();

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
