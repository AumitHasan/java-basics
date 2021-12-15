package com.example.random;


class Returning_Object {
    int a;

    Returning_Object(int i) {
        a = i;
    }

    // will crete an object of this class ..... called by retObj
    // add 10 with retObj.a then    obj.a = retObj.a + 10
    Returning_Object incrByTen() {
        Returning_Object obj = new Returning_Object(a+10); // here a is retObj.a
        return obj;
    }
}
class RetObj {
    public static void main(String[] args) {
        Returning_Object retObj = new Returning_Object(10);

        // it will get the newly created object (obj)
        Returning_Object retObj2 = retObj.incrByTen();

        System.out.println("retObj.a : " + retObj.a);
        System.out.println("retObj2.a : " + retObj2.a);

        retObj2 = retObj2.incrByTen();
        System.out.println("ob2.a after second increase: " + retObj2.a);
    }
}
