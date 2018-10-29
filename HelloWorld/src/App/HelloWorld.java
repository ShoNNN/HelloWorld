package App;

public class HelloWorld {
    public static void main(String[] args) {
        byte b = (byte) 216;
        short s = 1123;
        int i = 65000;
        long l = 312312312312L;

        char c = 61;
        char c1 = 62;
        char c3 = (char) (c + c1);

        float f = 10f;
        double d = 25.25;
        double d1 = 5.9;
        int i1 = (int) d1;

        boolean b1 = d != 0;
        boolean b2 = false;

        String str = "строка" + " " + "строка";

        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
        System.out.println(c3);
        System.out.println(f);
        System.out.println(d);
        System.out.println(d1);
        System.out.println(i1);
        System.out.println(b1 + "" + ' ' + "" + b2);
        System.out.println(str + str + b1);


    }
}
