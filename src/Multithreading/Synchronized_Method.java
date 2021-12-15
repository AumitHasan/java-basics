package Multithreading;

//         void call(String msg) // this will occur mix result ... solution is to add synchronized
//        This results in the mixed-up output of the three message strings. In this program,
//        nothing exists to stop all three threads from calling the same method, on the same object,
//        at the same time. This is known as a race condition, because the three threads are racing each
//        other to complete the method.

//        Any time that you have a method, or group of methods, that manipulates the internal
//        state of an object in a multithreaded situation, you should use the synchronized keyword to
//        guard the state from race conditions. Remember, once a thread enters any synchronized
//        method on an instance, no other thread can enter any other synchronized method on the
//        same instance

class Callme {
    // void call(String msg) { // this will occur
    synchronized void call(String msg) {
        System.out.print("[" + msg);
        try {
            Thread.sleep(1000);
        }
        catch(InterruptedException e) {
            System.out.println("Interrupted");
        }
        System.out.println("]");
    }
}
class Caller implements Runnable {
    String msg;
    Callme callme;
    Thread t;
    public Caller(Callme obj, String s) {
        callme = obj;
        msg = s;
        t = new Thread(this);
        t.start();
    }
    public void run() {
        callme.call(msg);
    }
}
public class Synchronized_Method {
    public static void main(String[] args) {
        Callme callme = new Callme();

        Caller obj1 = new Caller(callme, "Hello");
        Caller obj2 = new Caller(callme, "Synchronized");
        Caller obj3 = new Caller(callme, "World");

        // wait for threads to end
        try {
            obj1.t.join();
            obj2.t.join();
            obj3.t.join();
        }
        catch(InterruptedException e) {
            System.out.println("Main Interrupted");
        }
    }
}
