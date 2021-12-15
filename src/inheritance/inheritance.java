package inheritance;

class Employee {
    String name = "Aumit";
    int id = 5;
    int a;
    private String password = "hello";

    Employee() {
        System.out.println("Employee is created (called by super() from child class)");
    }

    void identity() {
        System.out.println("I'm Employee");
    }

    int sum(int a, int b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }
}
class Boss extends Employee {
    int b;

    // this class will not get access to Private property of super class
    void getPrivateProperty() {
//        String str = password; // error
    }

    void display() {
        // child class will get direct access of all instance variable of parent class
        System.out.println("Name: " + name + " ID: " +id);
    }

    // Overridden methods are another way that Java implements the
    // “one interface, multiple methods” aspect of polymorphism
    @Override
    void identity() {
        System.out.println("inheritance.Boss");
    }

    // it's simply overloading
    int sum(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    int multiply() {
        return a * b;
    }

    void bossOnlymethod() {
        System.out.println("I'm only in Boss object");
    }
}
class Test2 {
    public static void main(String[] args) {
//        inheritance.Employe objBoss = new inheritance.Boss();
        Boss objBoss = new Boss(); // it will first execute Employee constructor then Boss constructor

        System.out.println(objBoss.name + "'s Id : "  +  objBoss.id);
        objBoss.identity();
        objBoss.display();
        System.out.println("Sum of two number: " + objBoss.sum(5,3));

        objBoss.a = 2;
        objBoss.b = 8;
        System.out.println("a * b : " + objBoss.multiply());


        System.out.println("\nEmployee Object: ");

        Employee employeeObj = new Employee();
        System.out.println(employeeObj.sum(2,3));
        System.out.println(employeeObj.sum(1,2,3));
        employeeObj.identity();


        System.out.println("\nCopy boss object into employee object reference: ");
        employeeObj = objBoss;
        employeeObj.identity();

        // it will not get this method because EmployeeObj reference variable only
        // copy those properties which are also contains at Employee class
        // employeeObj.bossOnlymethod() // so this method will not get access from this object
        // but it will get Overridden methods

    }
}

