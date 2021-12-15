
//    An abstract class must be declared with an abstract keyword.
//    It can have abstract and non-abstract methods.
//    It cannot be instantiated.
//    It can have constructors and static methods also.
//    It can have final methods which will force the subclass not to change the body of the method.

// if abstract class has Constructor... when chidClass object will be created it will call the Constructor of abstract class

abstract class Shape{
    protected final static double PI = 22.0/7.0;
    protected double length;
    public abstract double area();
    Shape() { // it will be called if you create Object of Square or Circle
        System.out.println("Shape created");
    }
    void description() {
        System.out.println("I'm a shape" + PI);
    }
}

class Square extends Shape{
    Square(double side){
        length=side;// initialises inherited length
    }
    public double area(){// overrides area() of Shape
        return length*length;// length inherited from Shape
    }
}

class Circle extends Shape{
    Circle(double radius){
        length=radius;// initialises inherited length
    }
    public double area(){// overrides area() of Shape
        return PI*length*length;// PI & length inherited from Shape
    }
}

/**
 * Polymorphism & Dynamic binding test class
 **/
class l1PolyTest{
    public static void main(String[] args){
        Shape sh;// no object instance just variable declaration
        Square sq = new Square(10.0);// sq is a Square object reference
        Circle circ = new Circle(10.0);// circ is a Circle object reference

        sh=sq;// sh dynamically bound to the Square object referenced by sq
        System.out.println("Area of Square = " + sh.area());

        sh=circ; // sh dynamically bound to the Circle object referenced by circ
        System.out.println("Area of circle = " + sh.area());

        // call method in abstract class
        sh.description();
    }
}