package Generics;

class Stat3<T extends Number> {
    T num[];

    Stat3(T o[]) {
        num = o;
    }
    double average() {
        double sum = 0.0;
        for(int i=0; i<num.length; i++) {
            sum += num[i].doubleValue();
        }
        return sum / num.length;
    }
    // it will create problem. Cause average() and obj could be different type but it must be same type
    boolean sameAvgProblem(Stat3<T> obj) {
        if(average() == obj.average()) return true;
        return false;
    }

    boolean sameAvg(Stat3<?> obj) {
        if(average() == obj.average()) return true;
        return false;
    }
}
public class Wildcard_Arguments {
    public static void main(String[] args) {
        Integer inums[] = { 1, 2, 3, 4, 5 };
        Double dnums[] = { 1.1, 2.2, 3.3, 4.4, 5.5 };
        Float fnums[] = { 1.0F, 2.0F, 3.0F, 4.0F, 5.0F };

        Stat3<Integer> iObj = new Stat3<Integer>(inums);
        double avgInt = iObj.average();

        Stat3<Double> dObj = new Stat3<Double>(dnums);
        double avgDouble = dObj.average();

        Stat3<Float> fObj = new Stat3<Float>(fnums);
        double avgFloat = fObj.average();

        // two object type must be same data type... to solve this problem we need Wildcard
        // if(iObj.sameAvgProblem(dObj)) {}

        if(iObj.sameAvg(dObj)) {
            System.out.println("Average is same");
        }
        else System.out.println("Different");


        if(iObj.sameAvg(fObj)) {
            System.out.println("same");
        }
        else System.out.println("Different");
    }
}
