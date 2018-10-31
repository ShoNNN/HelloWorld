package ConstructorExample;

public class Dog extends Animal {
    String name;
    int numbersOfLegs;
    final int numbersOfTail = 1;

    public Dog() {

    }

    public Dog(int height, int weight, int eyes, String name, int numbersOfLegs) {
        super(height, weight, eyes);
        this.name = name;
        this.numbersOfLegs = numbersOfLegs;
    }
}
