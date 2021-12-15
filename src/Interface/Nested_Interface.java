package Interface;

class A {
    public interface NestedInterface {
        boolean isNotNegative(int x);
    }
}
class B implements A.NestedInterface {
    public boolean isNotNegative(int x) {
        return x < 0 ? false : true;
    }
}
public class Nested_Interface {
    public static void main(String[] args) {
        A.NestedInterface nifObj = new B();

        if(nifObj.isNotNegative(10)) {
            System.out.println("10 is positive");
        }
        if(nifObj.isNotNegative(-1)) {
            System.out.println("-1 is negative");
        }
    }
}
