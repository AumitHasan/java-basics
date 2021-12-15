package Exception.Handaling;

// each try statement requires at least one catch or a finally clause

public class Finally {
    static void methodOne() {
        try {
            System.out.println("inside method one");
            throw new RuntimeException("throw runtime exception");
        }
        finally {
            System.out.println("method one FInally");
        }
    }
    static void methodTwo() {
        try {
            System.out.println("inside method Two");
            // now execute finally block then will come back hare and return
            return;
        }
        finally {
            System.out.println("method Two FInally");
        }
    }
    public static void main(String[] args) {
        try {
            methodOne();
        }
        catch (RuntimeException e) {
            System.out.println("Exception caught");
        }

        methodTwo();
    }
}

//        inally creates a block of code that will be executed after a try /catch block has completed
//        and before the code following the try/catch block. The finally block will execute whether
//        or not an exception is thrown. If an exception is thrown, the finally block will execute even
//        if no catch statement matches the exception. Any time a method is about to return to the
//        caller from inside a try/catch block, via an uncaught exception or an explicit return
//        statement, the finally clause is also executed just before the method returns. This can be
//        useful for closing file handles and freeing up any other resources that might have been
//        allocated at the beginning of a method with the intent of disposing of them before
//        returning