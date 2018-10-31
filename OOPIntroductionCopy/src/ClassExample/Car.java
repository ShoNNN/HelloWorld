package ClassExample;

public class Car extends Object {

    String name;
    int numberOfDoors;
    int numberOfWheels;
    char steeringWheel;
    int horsePower;


    public Car(String name, int numberOfDoors, int numberOfWheels, char steeringWheel, int horsePower) {
        this.name = name;
        this.numberOfDoors = numberOfDoors;
        this.numberOfWheels = numberOfWheels;
        if(steeringWheel == 1 || steeringWheel == 2) {
            this.steeringWheel = steeringWheel;
        }
        this.horsePower = horsePower;
    }

    Car(){

    }

    protected void go(){
        System.out.println("Машина едет...");
    }

    public void stop(){
        System.out.println("Машина остановилась...");
    }

    public void turn(){
        System.out.println("машина повернула...");
    }

    @Override
    public String toString() {
        StringBuilder info = new StringBuilder(
                this.name + " " +
                this.numberOfDoors + " " +
                this.numberOfWheels + " " +
                this.steeringWheel + " " +
                this.horsePower);
        return info.toString();
    }
}
