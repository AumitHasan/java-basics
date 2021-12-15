package inheritance;

// If you create an object of subclass, first superclass constructor will be executed, secondly subclass constructor will be executed

class A {
    A() {
        System.out.println("Inside A's constructor.");
    }
}
class B extends A {
    B() {
        System.out.println("Inside B's constructor.");
    }
}
class C extends B {
    C() {
        System.out.println("Inside C's constructor.");
    }
}
public class Constructor_Hierarchy {
    public static void main(String args[]) {
        C c = new C();
    }
}

//        Inside A's constructor.
//        Inside B's constructor.
//        Inside C's constructor.