package ClassExample;

public class App {

    public static void main(String[] args) {
        App app = new App();
        app.buildCar();
        app.buildTruck();
    }

    public void buildCar(){
        Car firstCar = new Car();
        firstCar.name = "Lada Vesta";
        firstCar.numberOfDoors = 4;
        firstCar.numberOfWheels = 4;
        firstCar.steeringWheel = 'L';
        firstCar.horsePower = 122;

        System.out.println(firstCar.name);
        firstCar.go();
        firstCar.turn();
        firstCar.stop();

        Car secondCar = new Car();
        secondCar.name = "BMW";
        secondCar.numberOfDoors = 4;
        secondCar.numberOfWheels = 4;
        secondCar.steeringWheel = 'L';
        secondCar.horsePower = 250;

        System.out.println(secondCar.name);
        secondCar.go();
        secondCar.turn();
        secondCar.stop();
    }

    public void buildTruck(){
        Truck firstTruck = new Truck();
        firstTruck.name = "Камаз";
        firstTruck.numberOfDoors = 2;
        firstTruck.numberOfWheels = 10;
        firstTruck.steeringWheel = 'L';
        firstTruck.horsePower = 350;

        System.out.println(firstTruck.name);
        firstTruck.go();
        firstTruck.turn();
        firstTruck.stop();
    }
}
