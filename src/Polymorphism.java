
// for Overloading return type doesn't matter... parameter must be different
class Methods {
    void sum(double a) {
        System.out.println(a);
    }
//    float sum(int a) {            // compilation error. match with void sum(int a)
//        System.out.println("Sum");
//    }

    void sum() {
        System.out.println("2nd sum");
    }
}
class Polymorphism {
    public static void main(String[] args) {
        Methods methodObj = new Methods();
        methodObj.sum(1.5);

        // automatic type conversation
        // it occurs when a method is called and no exact parameter match is founded.
        methodObj.sum(5); //  no method SUM() with integer parameter... so it will convert Integer to double/float then try to find match
    }
}




/// another class example
class Box {
    double width;
    double height;
    double depth;

    // you can't declare a direct object(new Box()), you must call it with three argument(new Box(1,2,3))
    // but if you want a simple (new Box() ) then you have to overload it like below:
//    Box() {
//
//    }

    // This is the constructor for Box.
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // constructor used when cube is created
    Box(double len) {
        width = height = depth = len;
    }

    // this constructor takes an object of type Box
    // copping another object value to current object
    Box(Box obj) {
        width = obj.width;
        height = obj.height;
        depth = obj.depth;
    }

    // compute and return volume
    double volume() {
        return width * height * depth;
    }

    // Using Objects as Parameters
    // return true if o is equal to the invoking object
    boolean equalTo(Box obj) {
        if(obj.width == width && obj.height == height && obj.depth == depth)
            return true;
        else return false;
    }
}
class MyBox {
    public static void main(String[] args) {
        // this boxObj is Box type
        Box boxObj = new Box(1,2,3);

        // pass Object to method
        boxObj.equalTo(boxObj);

        // creating copy of boxObj into boxCloneObj
        Box boxCloneObj = new Box(boxObj);

        // two will have same volume because two object are same
        System.out.println(boxObj.volume());
        System.out.println(boxCloneObj.volume());
    }
}