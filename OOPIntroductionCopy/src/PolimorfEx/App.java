package PolimorfEx;

public class App {
    public static void main(String[] args) {
        Animal [] array = new Animal[2];
        array[0] = new Cat();
        array[1] = new Dog();

        for (int i = 0; i < array.length; i++) {
            array[i].roam();
        }
    }
}
