package com.example.random;

class Factorial {
    // Local variables don't have a default value.
    // Unless a local variable has been assigned a value,
    // the compiler will refuse to compile the code that reads it.
//    void fact(int n) {
//        int res;
//        System.out.println(res); // error .. no initialized value
//    }

    int fact(int n) {
        int res;

        if(n == 1) return 1;

        res = n * fact(n-1);
        return res;
    }
}
public class Recursion {
    public static void main(String[] args) {
        Factorial obj = new Factorial();

        System.out.println( obj.fact(3) );
    }
}
