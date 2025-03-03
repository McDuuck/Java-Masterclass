package Section8Polymorphism.Challenge;

public class GasCar extends Car {

    private double avgKmPerLitre;
    private int cylinders;

    public GasCar(String description) {
        super(description);
    }

    public GasCar(String description, double avgKmPerLitre, int cylinders) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
    }

    @Override
    public void startEngine() {
        System.out.printf("GasCar -> startEngine(), %d cylinders\n", cylinders);
        runEngine();
    }

    @Override
    protected void runEngine() {
        System.out.printf("GasCar -> average km per litre: %.2f\n", avgKmPerLitre);
    }

    public void drive() {
        System.out.println("GasCar -> drive()");
        basicInfo();
    }

    public void basicInfo() {
        System.out.println("GasCar: " + getDescription() + ", " + avgKmPerLitre + " km/l, " + cylinders + " cylinders");
    }
    
}
