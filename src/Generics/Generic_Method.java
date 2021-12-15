package Generics;

// Generic method structure
// <type-param-list> ret-type meth-name (param-list) { // … }

public class Generic_Method {
    <T> void printArray(T ar[]) {
        for(T value: ar) {
            System.out.println(value);
        }
    }
    <T extends Number> int sum(T ar[]) {
        int s = 0;
        for(int i=0; i < ar.length; i++) s += ar[i].intValue();
        return s;
    }

    // Determine if an object is in an array.
//    the type of the first argument is Integer (due to autoboxing), which causes Integer to be substituted for T.
//    The base type of the second argument is also Integer, which makes Integer a substitute for V,
    // https://docs.oracle.com/javase/8/docs/api/java/lang/Comparable.html
    <T extends Comparable<T>, V extends T> boolean isIn(T x, V ar[]) {
        for(int i=0; i < ar.length; i++)
            if(x.equals(ar[i])) return true;
        return false;
    }

    public static void main(String args[]) {
        Generic_Method obj = new Generic_Method();

        // Use isIn() on Integers.
        Integer nums[] = { 1, 2, 3, 4, 5 };

        // specifying argument type manually
        if(obj.<Integer, Integer>isIn(2, nums) == true) {
            //Although Type Inference will be sufficient for most generic method calls, you can
            //explicitly specify the type argument if needed
        }

        if(obj.isIn(2, nums) == true) System.out.println("2 is in nums");

        if(obj.isIn(7, nums) == false) System.out.println("7 is not in nums");

        // Use isIn() on Strings.
        String strs[] = { "one", "two", "three", "four", "five" };

        if(obj.isIn("two", strs) == true) System.out.println("two is in strs");


//        If you remove the comments and then try to compile the program, you will receive an error.
//        The reason is that the type parameter V is bounded by T in the extends clause in V’s
//        declaration. This means that V must be either type T, or a subclass of T. In this case, the first argument is of
//        type String, making T into String, but the second argument is of type
//        Integer, which is not a subclass of String. This causes a compile-time type-mismatch error.
//        This ability to enforce type safety is one of the most important advantages of generic methods.

        // Oops! Won't compile! Types must be compatible.
//        if(obj.isIn("two", nums)){}

        System.out.println("\n Print any array");
        obj.printArray(nums);

        System.out.println("\n Calculate sum of any Number type array");
        int sum = obj.sum(nums);
        System.out.println("Sum: " + sum);
    }
}

//        Why <T extends Comparable<T>>
//        answer:
//        a generic interface is declared in the same way as is a generic class. In this case,
//        the type parameter is T, and its upper bound is Comparable. As explained earlier, Comparable
//        is an interface defined by java.lang that specifies how objects are compared. Its type parameter
//        specifies the type of the objects being compared.
