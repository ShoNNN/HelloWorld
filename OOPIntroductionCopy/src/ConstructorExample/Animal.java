package ConstructorExample;

public class Animal {
    int height;
    int weight;
    int eyes;

    public Animal() {

    }

    public Animal(int height, int weight, int eyes) {
        this.height = height;
        this.weight = weight;
        this.eyes = eyes;
    }

    public void roam(){
        System.out.println("Передвигаться туда сюда");
    }

    public void eat(){
        System.out.println("Животное ест");
    }

}
