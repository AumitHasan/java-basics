package Exception.Handaling;

public class Throw {
    static void demo() {
        try {
            // use new to create throwable
            throw new NullPointerException("demo");
        }
        catch(NullPointerException e) {
            System.out.println("Caught inside demo");
            throw e; // it will catch inside main try-catch block
        }
    }
    public static void main(String[] args) {
        try {
            demo();
        }
        catch(NullPointerException e) {
            System.out.println("Recaught: " + e + "\n getMessage() : " + e.getMessage());
        }
    }
}

//        ThrowableInstance must be an object of type Throwable or a subclass of Throwable.
//        Primitive types, such as int or char, as well as non-Throwable classes, such as String and
//        Object, cannot be used as exceptions. There are two ways you can obtain a Throwable
//        object: using a parameter in a catch clause or creating one with the new operator.
//        The flow of execution stops immediately after the throw statement; any subsequent
//        statements are not executed. The nearest enclosing try block is inspected to see if it has
//        a catch statement that matches the type of exception. If it does find a match, control is
//        transferred to that statement. If not, then the next enclosing try statement is inspected, and
//        so on. If no matching catch is found, then the default exception handler halts the program
//        and prints the stack trace
