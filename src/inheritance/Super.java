package inheritance;

// if you use SUPER() in a constructor, SUPER() must be the first line

class BoxWeight2 extends Box {
    double weight;
    String name = "aumit";

    // if you use SUPER() in a constructor, SUPER() must be the first line
//    BoxWeight2() {
//        weight = -1;
//        super(); // error.. super() should be first line in constructor
//    }
    BoxWeight2() {
        super();
        weight = -1;
    }
    BoxWeight2(double w,double h, double d, double wt) {
        // in constructor supper() must be first line
        super(w,h,d); // call super class constructor
        weight = wt;
    }
    BoxWeight2(double arm, double w) {
        super(arm);
        weight = w;
    }
    BoxWeight2(BoxWeight2 obj) {
        super(obj);
        weight = obj.weight;
    }

    @Override
    void display() {
        System.out.println("Aumit from Box Weight");
    }

    void callSuperClassDisplay() {
        super.display(); // super class display() has called
        super.name = "Super Class"; // super class name variable updated
        System.out.println("Super class name: " + super.name + " child class name: " + name); // super class name variable has called
    }

}
public class Super {
    public static void main(String[] args) {
        double volume;

        BoxWeight2 myBox1 = new BoxWeight2();
        volume = myBox1.volume();
        System.out.println("default myBox1 vol: " + volume);

        BoxWeight2 myBox2 = new BoxWeight2(10,20,15,35.7);
        volume = myBox2.volume();
        System.out.println("myBox2 volume: " + volume);

        // copied myBox2 into myClone
        BoxWeight2 myClone = new BoxWeight2(myBox2);
        volume = myBox2.volume();
        System.out.println("myBox2 volume: " + volume);
    }
}

// supper has two different form
//    1. call superclass constructor. In this case variable initialized in constructor could be PRIVATE in super class
//    2. access variable or method from child class which are overridden