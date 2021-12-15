package Generics;

// A bounded wildcard is especially important when you are creating a generic type  that will operate on a class hierarchy

// Two-dimensional coordinates.
class TwoD {
    int x, y;
    TwoD(int a, int b) {
        x = a;
        y = b;
    }
}
// Three-dimensional coordinates.
class ThreeD extends TwoD {
    int z;
    ThreeD(int a, int b, int c) {
        super(a, b);
        z = c;
    }
}
// Four-dimensional coordinates.
class FourD extends ThreeD {
    int t;

    FourD(int a, int b, int c, int d) {
        super(a, b, c);
        t = d;
    }
}
class Cords<T extends TwoD> { // upper bound
    T coords[];
    Cords(T o[]) {
        coords = o;
    }
    void showXY(Cords<?> c) {
        System.out.println("any Coordinates:");
        for(int i=0; i < c.coords.length; i++) {
            System.out.println(c.coords[i].x + " " + c.coords[i].y);
        }
    }

    // This enables you to restrict the types of objects upon which a method will operate.
    //  It states that the ? can match any type as long as it is ThreeD, or a class derived
    //from ThreeD. Thus, the extends clause establishes an upper bound that the ? can match.
    //Because of this bound, showXYZ( ) can be called with references to objects of type
    //Coords<ThreeD> or Coords<FourD>, but not with a reference of type Coords<TwoD>.
    //Attempting to call showXZY( ) with a Coords<TwoD> reference results in a compile-time
    //error, thus ensuring type safety.
    void showXYZ(Cords<? extends ThreeD> c) { // upper bound
        System.out.println("X Y Z Coordinates:");
        for(int i=0; i < c.coords.length; i++) {
            System.out.println(c.coords[i].x + " " + c.coords[i].y + " " + c.coords[i].z);
        }
    }

    void showLastToFirst(Cords<? super FourD> c) {
        // it is lower bound
        // it will accept FourD and it's all super classes
    }
}
public class Wildcard_Bounded_wildcard {
    static void showAll(Cords<? extends FourD> c) { // can store FourD or its derived class in c
        System.out.println("X Y Z T Coordinates:");
        for(int i=0; i < c.coords.length; i++) {
            System.out.println(c.coords[i].x + " " + c.coords[i].y + " " + c.coords[i].z + " " + c.coords[i].t);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        TwoD td[] = {
                new TwoD(0, 0),
                new TwoD(1, 2),
                new TwoD(4, 5)
        };
        // Now, create some FourD objects.
        FourD fd[] = {
                new FourD(1, 2, 3, 4),
                new FourD(6, 8, 14, 8),
                new FourD(22, 9, 4, 9),
                new FourD(3, -2, -23, 17)
        };

        Cords<TwoD> tdlocs = new Cords<TwoD>(td);
        Cords<FourD> fdlocs = new Cords<FourD>(fd);

        System.out.println("Content of tdlocs");
        // showXY() will take TwoD and its child classes
        tdlocs.showXY(tdlocs);
        tdlocs.showXY(fdlocs);
        // tdlocs.showXYZ(tdlocs); // Error, not a ThreeD
        // showAll(tdlocs); // Error, not a FourD or its child class

        System.out.println("Contents of fdlocs.");
        // These are all OK.
        tdlocs.showXY(fdlocs);
        showAll(fdlocs);


    }
}

//    to establish an upper bound for a wildcard, use the following type of  wildcard expression:
//    <? extends superclass>

//    You can also specify a lower bound for a wildcard by adding a super clause to a wildcard  declaration. Here is its general form:
//    <? super subclass>


