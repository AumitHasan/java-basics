package inheritance;

// you cannot declare abstract constructors, or abstract static methods.

abstract class Figure2 {
    double dim1, dim2;
    final double PI = 3.1416;

    Figure2(double dim1, double dim2) {
        this.dim1 = dim1;
        this.dim2 = dim2;
    }

    abstract double area();
}
class Rectangle2 extends Figure2 {
    Rectangle2(double width, double length) {
        super(width,length);
    }

    @Override
    double area() {
        return dim1 * dim2;
    }
}
class Triangle2 extends Figure2 {
    Triangle2(double base, double height) {
        super(base,height);
    }

    @Override
    double area() {
        return (dim1 * dim2) / 2;
    }
}
public class Abstraction {
    public static void main(String[] args) {
        // illegal. it's not possible to create instance of abstract class
        // Figure2 f = new Figure2();

        Rectangle2 r = new Rectangle2(10, 26);
        Triangle2 t = new Triangle2(20, 30);

        // reference object of abstract class
        Figure2 f;

        // create object references, because Java’s approach to run-time polymorphism is implemented
        // through the use of superclass references
        f = r; // can be used to refer to an object of any class derived from Figure2.

        System.out.println("Area of Rectangle : " + f.area());

        System.out.println("Area of Triangle : " + t.area());

    }
}
