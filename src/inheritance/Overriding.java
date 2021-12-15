package inheritance;

class Figure {
    double dim1, dim2;

    Figure(double dim1, double dim2) {
        this.dim1 = dim1;
        this.dim2 = dim2;
    }

    double area() {
        System.out.println("Area for figure is undefined");
        return 0;
    }
}
class Rectangle extends Figure {
    Rectangle(double width, double length) {
        super(width,length);
    }

    @Override
    double area() {
        return dim1 * dim2;
    }
}
class Triangle extends Figure {
    Triangle(double base, double height) {
        super(base,height);
    }

    @Override
    double area() {
        return (dim1 * dim2) / 2;
    }
}
public class Overriding {
    public static void main(String[] args) {
        Figure figureObj = new Figure(10, 10);

        // recObj.dim1 = 5.0 & recObj.dim2 = 8.0
        Rectangle recObj = new Rectangle(5, 8);
//        System.out.println(recObj.dim1 + " " + recObj.dim2);

        // assign child object ref into parent object reference
        figureObj = recObj;
        // I can use recObj.area()
        System.out.println("Area of Rectangle = " + figureObj.area());

        Triangle triObj = new Triangle(6, 8);
        System.out.println("Area of Triangle = " + triObj.area());
    }
}
