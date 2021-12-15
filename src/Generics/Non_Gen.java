package Generics;

//        First, notice that NonGen replaces all
//        uses of T with Object. This makes NonGen able to store any type of object, as can the generic
//        version. However, it also prevents the Java compiler from having any real knowledge about
//        the type of data actually stored in NonGen, which is bad for TWO reasons.
//
//        First, explicit casts must be employed to retrieve the stored data.
//        Second, many kinds of type mismatch errors cannot be found until run time.

// NonGen is functionally equivalent to Gen but does not use generics.
class NonGen {
    Object ob; // ob is now of type Object
    // Pass the constructor a reference to an object of type Object
    NonGen(Object o) {
        ob = o;
    }
    // Return type Object.
    Object getob() {
        return ob;
    }
    // Show type of ob.
    void showType() {
        System.out.println("Type of ob is " + ob.getClass().getName());
    }
}
// Demonstrate the non-generic class.
class NonGenDemo {
    public static void main(String args[]) {
        NonGen iOb;
        // Create NonGen Object and store an Integer in it. Autoboxing still occurs.
        iOb = new NonGen(88);

        // Show the type of data used by iOb.
        iOb.showType();

        // Get the value of iOb. This time, a CAST is necessary.
        int v = (Integer) iOb.getob();
        System.out.println("value: " + v);

        System.out.println();

        // Create another NonGen object and store a String in it.
        NonGen strOb = new NonGen("Non-Generics Test");

        // Show the type of data used by strOb.
        strOb.showType();

        // Get the value of strOb. Again, notice that a CAST is necessary.
        String str = (String) strOb.getob();
        System.out.println("value: " + str);

        // This compiles, but is conceptually wrong!
        iOb = strOb;

        // no compile time error...... also need Type Cast
        int val = (Integer) iOb.getob(); // run-time error!
//        Here, strOb is assigned to iOb. However, strOb refers to an object that contains a string,
//        not an integer. This assignment is syntactically valid because all NonGen references are
//        the same, and any NonGen reference can refer to any other NonGen object. However, the
//        statement is semantically wrong, as the next line shows. Here, the return type of getob( ) is
//        cast to Integer, and then an attempt is made to assign this value to val. The trouble is that
//        iOb now refers to an object that stores a String, not an Integer. Unfortunately, without the
//        use of generics, the Java compiler has no way to know this. Instead, a run-time exception
//        occurs when the cast to Integer is attempted. As you know, it is extremely bad to have
//        run-time exceptions occur in your code!

//        The ability to create type-safe code in which type-mismatch errors are caught at compile time is a key
//        advantage of generics. Although using Object references to create “generic” code has
//        always been possible, that code was not type safe, and its misuse could result in run-time
//        exceptions. Generics prevent this from occurring. In essence, through generics, run-time
//        errors are converted into compile-time errors. This is a major advantage
    }
}