package StringInJava;

import java.util.Random;

public class StringExample {
    public static void main(String[] args) {
//        double d = Math.sqrt(25);
//        Random rnd = new Random();
//        int i = rnd.nextInt();

        StringExample srtingEx = new StringExample();
        srtingEx.method3();
    }

    public void method1(){
        String str = "Привет";
        System.out.println(str);
        System.out.println(str.length());
        System.out.println(str.toUpperCase());
    }

    public void method2(){
        float floatVar = 23.4f;
        int intVar = 12;
        String stringVar = "строка";
        String fs;
        fs = String.format("Значение переменной float = " +
        "%f , пока значение переменной integer " +
                " переменная = %d и string " +
        " = %s", floatVar, intVar, stringVar);
        System.out.println(fs);
    }

    public void method3(){
        String str1 = "строка1";
        String str2 = "строка2";
        System.out.println(str1+str2);

        StringBuilder str3 = new StringBuilder("строка1");
        StringBuilder str4 = new StringBuilder("строка2");
        System.out.println(str3.append(str4));
    }
}
