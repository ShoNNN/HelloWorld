package ConstructorExample;

public class Cat {
    int height;
    int weight;
   String name;

    public Cat(int height, int weight, String name) {
        this.height = height;
        this.weight = weight;
        this.name = name;
    }

    public Cat(int height, int weight) {
        this.height = height;
        this.weight = weight;
    }

    public Cat(int i, String name) {
        this(i, i, name);
    }

}
