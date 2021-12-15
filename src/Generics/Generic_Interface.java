package Generics;

//    Benefits of Generic Interface
//        1. it can be implemented for different types of data.
//        2. it allows you to put constraints (that is, bounds) on the types of data  for which the interface can be implemented.

// if a class implements a generic interface, then that class must also be  generic
interface MinMax2<T extends Comparable<T>> {
    // interface interface-name<type-param-list> {  }
    T min();
    T max();
}

// when we need to use comapreTo() method for any <T> types then we should extends Compare<T>
// https://docs.oracle.com/javase/8/docs/api/java/lang/Comparable.html

//        Pay special attention to the way that the type parameter T is declared by MyClass and then
//        passed to MinMax. Because MinMax requires a type that implements Comparable, the
//        implementing class (MyClass in this case) must specify the same bound. Furthermore, once
//        this bound has been established, there is no need to specify it again in the implements clause.
//        In fact, it would be wrong to do so. For example, this line is incorrect and won’t compile:
//                // This is wrong!
//                class MyClass<T extends Comparable<T>> implements MinMax<T extends Comparable<T>> {}

class MyClass2<T extends Comparable<T>> implements MinMax2<T> {
    T[] vals;

    MyClass2(T[] o) {
        vals = o;
    }

    // Return the minimum value in vals.
    public T min() {
        T v = vals[0];
        for(int i=1; i < vals.length; i++)
            if(vals[i].compareTo(v) < 0) v = vals[i];
        return v;
    }
    public T max() {
        T v = vals[0];
        for(int i=1; i < vals.length; i++)
            if(vals[i].compareTo(v) > 0) v = vals[i];
        return v;
    }
}

//interface MinMax<T extends Number> {
//    T min(T ar[]);
//}
//class MyClass<T extends Number> implements MinMax<T> {
//    public T min(T ar[]) {
//        T m = ar[0];
//        for(int i=1; i<ar.length; i++){
//            // when we need to use comapreTo() method for any <T> types then we should extends Compare<T>
//            // https://docs.oracle.com/javase/8/docs/api/java/lang/Comparable.html
//            if(ar[i].compareTo(m) < 0) { // Cannot resolve method 'compareTo' in 'T'
//
//            }
//        }
//        return x;
//    }
//}
public class Generic_Interface {
    public static void main(String[] args) {
        Integer inums[] = {3, 6, 2, 8, 6 };
        Character chs[] = {'b', 'r', 'p', 'w' };

        // interface MinMax
        // MyClass<Integer> iObj = new MyClass<Integer>();

        MyClass2<Integer> iob = new MyClass2<Integer>(inums);
        MyClass2<Character> cob = new MyClass2<Character>(chs);

        System.out.println("Max value in inums: " + iob.max());
        System.out.println("Min value in inums: " + iob.min());

        System.out.println("Max value in chs: " + cob.max());
        System.out.println("Min value in chs: " + cob.min());

    }
}

interface Print<T extends Number> {
    T sum();
}
//class ArrayPrint implements Print<T> {} // wrong
// if a class implements a specific type of generic interface then the implementing class does not need to be generic.
class ArrayPrint implements Print<Integer> {
    Integer ar[];
    ArrayPrint(Integer array[]) {
        ar = array;
    }
    public Integer sum() {
        int s = 0;
        for(int i=0; i < ar.length; i++) s += ar[i];
        return s;
    }
}


//        Why <T extends Comparable<T>>
//        answer:
//        a generic interface is declared in the same way as is a generic class. In this case,
//        the type parameter is T, and its upper bound is Comparable. As explained earlier, Comparable
//        is an interface defined by java.lang that specifies how objects are compared. Its type parameter
//        specifies the type of the objects being compared.