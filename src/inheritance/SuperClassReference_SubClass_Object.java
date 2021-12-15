package inheritance;


class BoxWeight extends Box {
    double weight;

    BoxWeight(double w, double h, double d, double wt) {
        width = w;
        height = h;
        depth = d;
        weight = wt;
    }
}
class TestSuperClassRef {
    public static void main(String[] args) {
        BoxWeight objBoxW = new BoxWeight(2,5, 3, 10);

        System.out.println("Volume: " + objBoxW.volume() + ", Weight: " + objBoxW.weight);

        Box objBox = new Box();

        // in super class reference any child object could be assigned
        // but it will get the properties which are defined by superClass
        objBox = objBoxW;
        // objBox.weight // error
        System.out.println("Volume: " + objBox.volume());


    }
}
