package DataOperation;

import java.util.Random;

public class DataOperationEx {
    public static void main(String[] args) {
//        short s = 39;
//        int i = s;
//        short s1 = (short) i;
//        double d = i;
//        int a = 1;
//        double b = 2.0;
//        double sum = (a + b);
        DataOperationEx example = new DataOperationEx();
        example.method();
    }

    public void method(){
        double d = 5.7;
        System.out.println(Math.round(d));
        System.out.println(Math.floor(d));
        System.out.println(Math.ceil(d));
    }
}
