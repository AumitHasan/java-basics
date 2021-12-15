package Multithreading;

//        While creating synchronized methods within classes that you create is an easy and effective
//        means of achieving synchronization, it will not work in all cases. To understand why, consider
//        the following. Imagine that you want to synchronize access to objects of a class that was not
//        designed for multithreaded access. That is, the class does not use synchronized methods.
//        Further, this class was not created by you, but by a third party, and you do not have access to
//        the source code. Thus, you can’t add synchronized to the appropriate methods within the
//        class. How can access to an object of this class be synchronized?

class Callme2 {
    void call(String msg) {
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
class Caller2 implements Runnable {
    String msg;
    Callme2 callme2;
    Thread t;
    public Caller2(Callme2 obj, String s) {
        callme2 = obj;
        msg = s;
        t = new Thread(this);
        t.start();
    }
    public void run() {
        synchronized (callme2) {
            callme2.call(msg);
        }
    }
}
public class Synchronized_Statement {
    public static void main(String[] args) {
        Callme2 callme = new Callme2();

        Caller2 obj1 = new Caller2(callme, "Hello");
        Caller2 obj2 = new Caller2(callme, "Synchronized");
        Caller2 obj3 = new Caller2(callme, "World");

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

