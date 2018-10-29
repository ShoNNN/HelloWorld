package MainOperation;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
//        method1();
        method2();
    }

    public static void method(){
        int i = 1;
        i++; //постфиксная форма
        i = i + 1;
        i--; //постфиксная форма
        i = i - 1;
        System.out.println(i);
        int i2 = 1;
        ++i2;
        --i2;
        System.out.println(i2);
        int x = 10;
        int y = x++;
        System.out.println(x + " " + y);

        int a = 12;
        int b = 3;
        int c = a/=b;
        b /= 3;

        System.out.println(c);
        System.out.println(a);
        System.out.println(b);
    }

    public static void method1(){
        int mouse;
        int weight;

        mouse = 5;
        weight = 4500;

        if (mouse != 0 && weight / mouse < 1000){
            System.out.println("Можно кормить кота");
        } else {
            System.out.println("Нельзя кормить");
        }

        if (false || true){
            System.out.println("ok!");
        }

        String numberOfMouse = mouse > 5 ? "хороший кот" : "плохой кот";
        System.out.println(numberOfMouse);
    }

    public static void method2(){

        int a = 5;
        int b = 5;

        if (a <= b){
            System.out.println("a меньше или равно b");
            if (a != b){
                System.out.println("а не равно b");
            } else {
                System.out.println("а равно b");
            }
        }
        else {
            System.out.println("а не меньше b");
        }
    }
}
