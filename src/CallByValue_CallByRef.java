
public class CallByValue_CallByRef {
    int a, b;

    CallByValue_CallByRef(int a, int b) {
        this.a = a;
        this.b = b;
    }

    // it will change the obj value
    void callByRef(CallByValue_CallByRef obj) {
        obj.a *= 2;
        obj.b *= 3;
    }

    // it will not change the object variable
    void callByValue(int x, int y) {
        x += 10;
        y += 20;
    }
}
class Test_CallBy {
    public static void main(String[] args) {
        CallByValue_CallByRef obj = new CallByValue_CallByRef(2,4);

        int x = 1, y = 5;

        // it will not change x, y
        obj.callByValue(x, y);
        System.out.println(x + " " + y); // output will be 1, 5 not 11, 25

        // it will change obj value 2,4 to 4, 12
        obj.callByRef(obj);
        System.out.println(obj.a + " " + obj.b);


    }
}
