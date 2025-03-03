package Section8Polymorphism.Polymorphism;

public class Holden extends Car {
    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Holden -> Start Engine";
    }

    @Override
    public String accelerate() {
        return "Holden -> Accelerate";
    }

    @Override
    public String brake() {
        return "Holden -> Brake";
    }
}
