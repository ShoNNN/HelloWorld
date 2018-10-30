package Arrays;

import java.util.Random;

public class ArraysExample {
    public static void main(String[] args) {
//        method3();
        String name [] = {"Владимир", "Роман", "Владислав"};
        for (String nameString:name) {
            System.out.println(nameString);
        }
    }

    public static void method1(){

        int array [] = new int[4];
        array[0] = 12;
        array[1] = 14;
        array[2] = 16;
        array[3] = 18;

        for (int j = 0; j < array.length; j++) {
            int i = array[j];
            System.out.println(i);
        }
        System.out.println();
        for (int i:array) {
            System.out.println(i);
        }

    }

    public static void method2(){
        //определяет наибольшее число в массиве
        Random rnd = new Random();
        int array [] = new int[1000];
        //Инициализация массива
        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(1000);
        }

        int min = array[0];
        int max = array[0];
        for (int i:array) {
            if (max < i) max = i;
            if (min > i) min = i;
        }
        System.out.println(max);
        System.out.println(min);
    }

    public static void method3(){
        Random rnd = new Random();
        char array [] = new char[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = (char) rnd.nextInt(100);
        }

        for (int i:array) {
            System.out.println(i);
        }
    }

}
