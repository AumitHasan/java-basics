package Interface;

// an interface could be PUBLIC or DEFAULT
interface CallBack {
    // Beginning with JDK 8, it is possible to add a default implementation to an interface method.

    void callBack(int param);

    // variable must be  final and static inside an interface class
    // if you don't declare by default static and final
    // because interface instance isn't possible, so later you can't assign any value & they are constant
    final static int A = 5;
    int NEW_VARIABLE = 10;
}
interface CallBack2 extends CallBack { // interface could be extended
    void callback2();
    // if you implements CallBack2 then all method of CallBack & CallBack2 should be implemented
}
class Client implements CallBack {
    // interface method must be declared with public keyword
    public void callBack(int n) {
        System.out.println("Call Back called with : " + n);
    }

    void display() {}
}
class AnotherClient implements CallBack {
    public void callBack(int n) {
        System.out.println("Another version of callback");
        System.out.println("N squared is " + (n * n));
    }
}
abstract class PartialImplementedInterface implements CallBack {
    // If a class includes an interface but does not fully implement the methods required by that
    // interface, then that class must be declared as abstract.

    int a,b;
    void show() {
        System.out.println("I'm partially implemented interface");
    }
}
class ImplementPartialImplementedInterface extends PartialImplementedInterface {
    public void callBack(int n) {
        int tmp = n + 10;
        System.out.println("I'm implementing partial implemented interface");
    }
}
class Interface {
    public static void main(String[] args) {

        // callBackObj will not get access of display() method, it only gets what is declared inside interface class
        CallBack callBackObj = new Client();

        Client clientObj = new Client();

        callBackObj = new AnotherClient();
    }
}

// one class can implement any number of interfaces.