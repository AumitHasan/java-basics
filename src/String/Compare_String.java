package String;

public class Compare_String {
    public static void main(String[] args) {
        char[] ch = {'a','u','m','i','t'};
        String str = new String(ch);
//        System.out.println(str);

        // string Literal
        String str2 = "Hasan";

        String str3 = new String("Bappy");

        String str4 = str2.concat(str3);
//        System.out.println(str4);

        String str5 = "hello";
        String str6 = "hello";
        String str66 = "HeLLo";
        System.out.println(str5.equals(str6)); // true
        System.out.println(str5.equalsIgnoreCase(str66)); // true

        String str7 = new String("hello");
        System.out.println(str6.equals(str7));

        // == operator used for comparing two String objects.
        if(str6 == str7) {
            System.out.println("str6 == str7");
        } else {
            System.out.println("str6 != str7");
        }

        // compareTo()
        String s1="Sachin";
        String s2="Sachin";
        String s3="Ratan";
        System.out.println(s1.compareTo(s2));//0
        System.out.println(s1.compareTo(s3));//1(because s1>s3)
        System.out.println(s3.compareTo(s1));//-1(because s3 < s1 )

    }
}
