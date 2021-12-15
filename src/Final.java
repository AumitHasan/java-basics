
// final variable must be declared in uppercase letters
 // both method parameters and local variables can be declared final

class Final {

    // not initialized a final variable called blank or uninitialized final variable
    // only set the variable in Constructor.
    final String STUDENT_ID;

    Final(String id){
        //It must be initialized in constructor if empty when declared
        this.STUDENT_ID = id;
    }

    // *** A static final variable that is not initialized during declaration can only be initialized in STATIC block.
    static final int ROLL;
    static {
        ROLL = 1;
    }

    // final variable as parameter
    void sum(final int A, int b) {
        final String MY_NAME = "aumit";
        b += 5;
//        a += 5; // can't modify final variable
        int res = A + b;
        System.out.println(res);
    }

    // you can't override a final method in child class
    final void display() {}
}
final class Final2 extends Final {
    Final2(String id) {
        super(id);
    }

    // illegal... can't override a final method
    // @Override
    // void display() {}
}
//  class NewClass extends Final2 { // can't extend a final class. as Final2 is declared as final
//
//  }

class FinalTest {
    public static void main(String[] args) {
        Final finalObj = new Final("142-35-738");
        System.out.println(finalObj.STUDENT_ID);

        finalObj.sum(1,4);
    }
}



// final method will be inherited but can't override it

// Final can be:
//    variable: it's constant, but if a final variable that have no value it is called blank final variable or uninitialized final variable.
//              It can be initialized in the constructor only.
//    method: If you make any method as final, you cannot override it.
//    class: If you make any class as final, you cannot extend it.


// Varaiable:
//    class Bike9{
//        final int speedlimit=90;//final variable
//        void run(){
//            speedlimit=400; // Compilation Error
//        }
//        public static void main(String args[]){
//            Bike9 obj=new  Bike9();
//            obj.run();
//        }
//    }


// Method
//    class Bike{
//        final void run(){System.out.println("running");}
//    }
//
//    class Honda extends Bike{
//        void run(){System.out.println("running safely with 100kmph");} // Compilation Error
//
//        public static void main(String args[]){
//            Honda honda= new Honda();
//            honda.run();
//        }
//    }

// Class
//    final class Bike{}
//
//    class Honda1 extends Bike{ // Compilation Error ... you can't extend a final class
//        void run(){System.out.println("running safely with 100kmph");}
//
//        public static void main(String args[]){
//            Honda1 honda= new Honda1();
//            honda.run();
//        }
//    }