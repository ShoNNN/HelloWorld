package ClassExample;

public class App {

    public static void main(String[] args) {
        App app = new App();
        app.buildCar();
        app.buildSportCar();
        app.buildTruck();
    }

    public void buildCar(){
        Car firstCar = new Car("Lada Vesta", 4, 4, 'L', 200);
        System.out.println(firstCar.toString());
        firstCar.go();
        firstCar.turn();
        firstCar.stop();

        Car secondCar = new Car("BMW", 4, 4, 'L', 250);
        System.out.println(secondCar.toString());
        secondCar.go();
        secondCar.turn();
        secondCar.stop();

        Car thirdCar = new Car("Audi", 4, 4, 'L', 170);
        System.out.println(thirdCar.toString());
        thirdCar.go();
        thirdCar.turn();
        thirdCar.stop();

    }

    public void buildTruck(){
        Truck firstTruck = new Truck("Камаз", 2, 8, 'L', 350);
        System.out.println(firstTruck.toString());
        firstTruck.go();
        firstTruck.turn();
        firstTruck.stop();
    }

    public void buildSportCar(){
        SportCar firstCar = new SportCar("Lada Vesta Sport", 4, 4, 'L', 200);
        System.out.println(firstCar.toString());
        firstCar.go();
        firstCar.turn();
        firstCar.stop();
    }
}
