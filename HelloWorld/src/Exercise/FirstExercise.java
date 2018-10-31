package Exercise;

//Напишите метод checkInterval.
//Метод должен проверять попало ли целое число в интервал от 50 до 100 и сообщить результат на экран в следующем виде:
//"Число а не содержится в интервале." или "Число а содержится в интервале.", где а - аргумент метода.

import java.util.Random;
import java.util.Scanner;

public class FirstExercise {
    public static void main(String[] args) {
        FirstExercise firstExercise = new FirstExercise();
        for (int i = 0; i <10; i++) {
            try {
                System.out.println(firstExercise.charGenerator());
            } catch (NullPointerException ex){
                //something
            }

        }

    }

    public void checkInterval(){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if(num >= 50 && num <= 100){
            System.out.println("Число " + num + " содержится в интервале");
        } else {
            System.out.println("Число " + num + " не содержится в интервале");
        }
    }


    public char charGenerator(){
        Random rnd = new Random();
        int num = rnd.nextInt(90);
        String str = null;
        if (num >= 65 && num <= 90){
            str = Character.getName(num);
        }
        return str.charAt(str.length() - 1);
    }
}