//The attempt to declare the second varargs parameter is illegal

class Variable_length_argument {
    void Test(int[] v) {
        for(int i=0; i<v.length; i++) {
            System.out.println(v[i]);
        }
    }

    // the variable-length parameter must be the last parameter declared by the method
    // three dot is call varargs method
    void VarArgs(int ... v) { // can accept multiple parameter   //  variable-length parameter
        for(int i=0; i<v.length; i++) {
            System.out.println("varargs: " + v[i]);
        }
    }

    // varargs method OverLoading
    void VarArgs(String ... v) {

    }
    // A varargs method can also be overloaded by a non-varargs method
    void VarArgs(int a) {

    }

    // the variable-length parameter must be the last parameter declared by the method
    //void myfun(int ... v, int a) // error...
    void myFun(int a, int ... v) {
        // v = { "aumit", "hasan", "bappy" }
    }

    // The attempt to declare the second varargs parameter is illegal
    // void anotherFun(int ... v, int ... v2) // error

}
class Test_VarArgs {
    public static void main(String[] args) {
        int[] ar = {1, 2, 3,};
        int[] ar2 = {4, 5, 6};

        Variable_length_argument obj = new Variable_length_argument();

        obj.Test(ar);
        obj.Test(ar2);

        obj.VarArgs(1, 2, 3, 4);
        obj.VarArgs(5,6);

        // call overloaded method
        obj.VarArgs("aumit", "hasan", "bappy");
        obj.VarArgs(1);

        // the variable-length argument must be the last argument
        obj.myFun(1, 5, 6, 7);
        obj.myFun(2); // **** varargs argument is optional

        // varargs ambiguity
        // two varargs methods has string and integer parameter
        // it's ok to call a varargs method empty cause varargs_parameter(int ... v) is optional
        // so this call will confuse between two method ....
//        obj.VarArgs(); // error
    }
}
