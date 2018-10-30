package SortOperation;

import java.util.Random;
import java.util.Scanner;

public class SortExample {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число");
        int i = scan.nextInt();
        SortExample example = new SortExample();
        example.method(i);
    }

    public void method(int number){
        Random rnd = new Random();
        int array [] = new int[number];
        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(number);
        }

        for (int i = array.length-1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] >  array[j + 1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j + 1] = temp;
                }
            }
        }

        for (int i:array) {
            System.out.println(i);
        }
        
    }
}
