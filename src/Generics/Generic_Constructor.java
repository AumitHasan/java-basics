package Generics;

// It is possible for constructors to be generic, even if their class is not.

public class Generic_Constructor {
    private double value;

    <T extends Number> Generic_Constructor(T arg) {
        value = arg.doubleValue();
    }
    void showValue() {
        System.out.println("Value: " + value);
    }
}
class GenCons {
    public static void main(String[] args) {
        Generic_Constructor obj = new Generic_Constructor(10);

        obj.showValue();
    }
}