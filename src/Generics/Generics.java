package Generics;

// syntax of generic_class: class class-name<type-param-list> { // …}

// syntax for declaring a reference to a generic class and instance creation
// class-name<type-arg-list> var-name = new class-name<type-arg-list>(cons-arg-list);

// A simple generic class. Here, T is a type parameter that will be replaced by a real type when an object of type Gen is created
class Gen<T> { // name<T>
    T obj;

    // Pass the constructor a reference to
    // an object of type T
    Gen(T o) {
        obj = o;
    }

    // Return ob.
    T getObj() {
        return obj;
    }

    // Show type of T.
    void showType() {
        System.out.println("Type of T is: " + obj.getClass().getName());
    }

}
public class Generics {
    public static void main(String[] args) {
        // Create a Gen reference for Integer
        Gen<Integer> iObj;

        // Create a Gen<Integer> object and assign its reference to iOb.
        // Notice the use of autoboxing to encapsulate the value 88 within an Integer object.
        iObj = new Gen<Integer>(80);

        // Show the type of data used by iOb
        iObj.showType();

        // Get the value in iOb. Notice that no cast is needed
        int v = iObj.getObj();
        System.out.println("Value: " + v + "\n");

        // Create a Gen object for Strings.
        Gen<String> strObj = new Gen<String>("String Generics");

        // Show the type of data used by strOb.
        strObj.showType();

        // Get the value of strOb. Again, notice that no cast is needed.
        String str = strObj.getObj();
        System.out.println("value: " + str);

        // iObj = strObj;
    }
}




