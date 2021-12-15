package Nested_Inner_Class;


class Outer { // enclosing class
    private String outer_name = "aumit";
    int outer_x = 10;

    void test() {
        Inner inner = new Inner();
        inner.display();
        // display(); // error... enclosing class doesn't get direct access of nested class
    }

    // this is an inner class
    class Inner { // nested class
        int inner_x = 5;
        void display() {
            System.out.println("display: outer_x = " + outer_x);

            // nested class get access to private property of enclosing class
            System.out.println("display: outer_name = " + outer_name);
        }
    }

    void innerClassInsideLoop() {
        // inner class inside loop
        for(int i=0;i<5;i++) {
            class Inner2 {
                void display() {
                    System.out.println("I'm Inner Class 2");
                }
            }
            Inner2 inner2 = new Inner2();
            inner2.display();
        }
    }
}
class InnerClassDemo {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.test();

        Outer.Inner x = outer.new Inner();
        x.display();

        outer.innerClassInsideLoop();

        int ar[] = {1};
    }
}
