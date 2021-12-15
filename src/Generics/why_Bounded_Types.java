package Generics;//        the type <T> parameters could be replaced by any class type. This is
//        fine for many purposes, but sometimes it is useful to limit the types that can be passed to a
//        type parameter. For example, assume that you want to create a generic class that contains a
//        method that returns the average of an array of numbers. Furthermore, you want to use the
//        class to obtain the average of an array of any type of number, including integers, floats, and
//        doubles. Thus, you want to specify the type of the numbers generically, using a type parameter.


// Generics.Stats attempts (unsuccessfully) to create a generic class that can compute
// the average of an array of numbers of any given type.

// The class contains an error!
class Stats<T> {
    T[] nums; // nums is an array of type T

    // Pass the constructor a reference to
    // an array of type T.
    Stats(T[] o) {
        nums = o;
    }
    // Return type double in all cases.
    double average() {
        double sum = 0.0;
        for(int i=0; i < nums.length; i++){

            // nums could be any array as <T> could be any type. if nums[] contains number array then doubleValue() is fine
            // but nums[] could be also string array then doubleValue() is invalid ... that's why it's error...
            // To handle such situations, Java provides bounded types. When specifying a type parameter,
            //you can create an upper bound that declares the superclass from which all type arguments
            //must be derived. This is accomplished through the use of an extends clause when specifying
            //the type parameter, as shown here: <T extends superclass> ..... for any type of number(int,float,double) <T extends Number>

//            sum += nums[i].doubleValue(); // Error!!! // check footnote
        }
        return sum / nums.length;
    }
}

//        In Generics.Stats, the average( ) method attempts to obtain the double version of each number in
//        the nums array by calling doubleValue( ). Because all numeric classes, such as Integer and
//        Double, are subclasses of Number, and Number defines the doubleValue( ) method, this
//        method is available to all numeric wrapper classes. The trouble is that the compiler has no
//        way to know that you are intending to create Generics.Stats objects using only numeric types. Thus,
//        when you try to compile Generics.Stats, an error is reported that indicates that the doubleValue( )
//        method is unknown. To solve this problem, you need some way to tell the compiler that you
//        intend to pass only numeric types to T.

//        To handle such situations, Java provides bounded types. When specifying a type parameter,
//        you can create an upper bound that declares the superclass from which all type arguments
//        must be derived. This is accomplished through the use of an extends clause when specifying
//        the type parameter, as shown here:
//        <T extends superclass>
//        This specifies that T can only be replaced by superclass, or subclasses of superclass. Thus,
//        superclass defines an inclusive, upper limit.
//        You can use an upper bound to fix the Generics.Stats class shown earlier by specifying Number as
//        an upper bound, as shown here:
//            class Generics.Stats<T extends Number> {}