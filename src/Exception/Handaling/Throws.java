package Exception.Handaling;

public class Throws {
    static void throwsDemo () throws IllegalAccessException {
        System.out.println("Inside throwsDemo");
        throw new IllegalAccessException("Demo");
    }
    public static void main(String[] args) {
        try {
            throwsDemo();
        }
        catch (IllegalAccessException e) {
            System.out.println("caught: " + e);
        }
    }
}

//        If a method is capable of causing an exception that it does not handle, it must specify this
//        behavior so that callers of the method can guard themselves against that exception. You do
//        this by including a throws clause in the method’s declaration. A throws clause lists the types
//        of exceptions that a method might throw. This is necessary for all exceptions, except those
//        of type Error or RuntimeException, or any of their subclasses. All other exceptions that a
//        method can throw must be declared in the throws clause.
