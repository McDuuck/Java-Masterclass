package Section8Polymorphism.Challenge;

public class Main {
    public static void main(String[] args) {
        
        Car car = new Car("Base car");
        runRace(car);

        Car toyota = new GasCar("Toyota", 12.5, 6);
        runRace(toyota);
    }

    public static void runRace(Car car) {
        car.startEngine();
        car.drive();
    }
}
