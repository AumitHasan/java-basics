
// A Java constructor cannot be abstract, static, final, and synchronized

class Calculation {
    int l,w;

    Calculation(){}
    Calculation(int l, int w) {
        this.l = l;
        this.w = w;
    }

    void set(int l, int w) {
        this.l = l;
        this.w = w;
    }
    int area() {
        return l * w;
    }
    void usedForAnonymousObject() {
        System.out.println("Anonymous Object");
    }
}

class Main {
    public static void main(String[] args) {
        Calculation clcObj = new Calculation();
        clcObj.set(3,5);

        Calculation clcObj2 = new Calculation();
        clcObj2.set(2,5);

        // every object has different heap memory with variables of the class in it
        System.out.println(clcObj.area());
        System.out.println(clcObj2.area());

        // copping constructor
        Calculation clcObj3 = new Calculation(1,2);
        Calculation clcObj4 = new Calculation(clcObj3.l, clcObj3.w);

        // Anonymous Object
        new Calculation().usedForAnonymousObject();
    }
}