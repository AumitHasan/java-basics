package Exception.Handaling;

import java.io.IOException;
import java.util.Random;

class ExceptionHierchy {
    // This program contains an error. A subclass must come before its superclass in a series of catch statements. If not,
    // unreachable code will be created and a compile-time error will result.
    void hierchy() {
        try {
            int a = 0;
            int b = 42 / a;
        }
        catch (ArrayIndexOutOfBoundsException e) {

        }
        catch (NullPointerException e) {

        }
        catch(Exception e) {
            System.out.println("Generic Exception catch.");
        }

        /* This catch is never reached because ArithmeticException is a subclass of Exception. */
//        catch(ArithmeticException e) { // ERROR – unreachable
//            System.out.println("This is never reached.");
//        }
    }
}
class exception {
    public static void main(String[] args) {
        int a, b, res=0;
        Random r = new Random();

        for(int i=0; i<10; i++) {
            a = r.nextInt();
            b = r.nextInt();

            int ar[] = new int[5];
            int value = r.nextInt();

            try {
                res = 13454 / (a/b);
                ar[value%9] = 10;
            }
            catch (ArithmeticException e) {
                // Throwable overrides the toString( ) method (defined by Object) so that it returns a string
                //containing a description of the exception. Print it simply passing the exception as an argument inside println()
                System.out.println(e);
                res = 0;
            }
            catch(ArrayIndexOutOfBoundsException e) {
                System.out.println(e);
            }
            System.out.println("result: " + res);
        }
    }
}

    // After one catch statement executes, the others are bypassed

//    try {
//         // block of code to monitor for errors
//    }
//    catch (ExceptionType1 exOb) {
//        // exception handler for ExceptionType1
//    }
//    catch (ExceptionType2 exOb) {
//        // exception handler for ExceptionType2
//    }
//    finally {
//        // block of code to be executed after try block ends
//    }


//        When you use multiple catch statements, it is important to remember that exception
//        subclasses must come before any of their superclasses. This is because a catch statement
//        that uses a superclass will catch exceptions of that type plus any of its subclasses. Thus, a
//        subclass would never be reached if it came after its superclass.