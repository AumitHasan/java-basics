package inheritance;

class BoxWeight3 extends Box {
    double weight;

    BoxWeight3() {
        super();
        weight = -1;
    }
    BoxWeight3(double w,double h, double d, double wt) {
        super(w,h,d); // call super class constructor
        weight = wt;
    }
    BoxWeight3(double arm, double w) {
        super(arm);
        weight = w;
    }
    BoxWeight3(BoxWeight3 obj) {
        super(obj);
        weight = obj.weight;
    }
}
class Shipment extends BoxWeight3 {
    double cost;

    Shipment() {
        super();
        cost = -1;
    }
    Shipment(double w,double h, double d, double wt, double tk) {
        super(w, h, d, wt); // call super class constructor
        cost = tk;
    }
    Shipment(double arm, double w, double tk) {
        super(arm, w);
        cost = tk;
    }
    Shipment(Shipment objShip) {
        super(objShip);
        cost = objShip.cost;
    }
}
public class Multilevel_Hierarchy {
    public static void main(String[] args) {
        double volume;

        Shipment shipment = new Shipment(1,2,3 ,4,50);
        volume = shipment.volume();
        System.out.println("shipment volume: " + volume + " weight: " + shipment.weight + " cost: " + shipment.cost);

        // coping first object
        Shipment shipment2 = new Shipment(shipment);
        volume = shipment2.volume();
        System.out.println("shipment2 volume: " + volume + " weight: " + shipment2.weight + " cost: " + shipment2.cost);
    }
}
