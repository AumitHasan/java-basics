package inheritance;

class Box {
    String name = "MyBox";
    double width, height, depth;

    Box() {
        width = height = depth = -1;
    }
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
    Box(double arm) {
        width = height = depth = arm;
    }
    Box(Box obj) {
        width = obj.width;
        height = obj.height;
        depth = obj.depth;
    }

    double volume() {
        return width * height * depth;
    }

    void display() {
        System.out.println("This is Box Class");
    }
}