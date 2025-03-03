package Section8Polymorphism.Polymorphism;

public class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.engine = true;
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
    }

    public String startEngine() {
        return "Car -> Start Engine";
    }

    public String accelerate() {
        return "Car -> Accelerate";
    }

    public String brake() {
        return "Car -> Brake";
    }

    public int getCylinders() {
        return this.cylinders;
    }

    public String getName() {
        return this.name;
    }
}
