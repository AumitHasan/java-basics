
// STATIC variable or method called Global variable or Global method

// when a class is loaded all STATIC data or block will be loaded first
// that's another reason why main() is declared as static which is accessed by compiler

class Student {
    String name;
    int roll;

    // static variable only get memory once. When an object created it doesn't allocate static variable inside it.
    static String collageName = "DIU";
    static int count = 0;

    Student(String name, int roll) {
        this.name = name;
        this.roll = roll;
        count++;
    }

    // static method. it's class property. Invoked by ClassName.MethodName()
    // Student.changeCollageName()
    static void changeCollageName() {
        collageName = "CPSCR"; // only access static data

        // display(); // error // can't call non-static method from static method
        // int tmp = 10 + roll; // Non-static field 'roll' cannot be referenced from a static context
        // int tmp = this.roll; // can't use this
        // super(); // can't use super()

        // access non-static data using class object.
        Student obj = new Student("Bappy", 2);
        obj.name = "hello";

    }
    void display() {
        System.out.println(count + ". name: " + name + ", roll: " + roll);
    }
}
class University {

    // executed before the main method at the time of classloading
    static{
        System.out.println("static block is invoked");
    }

    public static void main(String[] args) {
        Student stObj = new Student("Aumit", 1);
        stObj.display();

        Student stObj2 = new Student("Shuvo", 2);
        stObj2.display();

        // static method
        Student.changeCollageName();
    }
}

// The static can be:
//    Variable (also known as a class variable)
//    Method (also known as a class method)
//    Block
//    Nested class


// Java static method
//    A static method belongs to the class rather than the object of a class.
//    A static method can be invoked without the need for creating an instance of a class.
//    A static method can access static data member and can change the value of it.
// They can only directly call other static methods. •
// They can only directly access static data. •
// They cannot refer to this or super in any way. (The keyword super relates to inheritance and is described in the next chapter.)

// Java static block
//    Is used to initialize the static data member.
//    It is executed before the main method at the time of classloading.