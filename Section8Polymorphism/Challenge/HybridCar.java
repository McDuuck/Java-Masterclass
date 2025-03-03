package Section8Polymorphism.Challenge;

public class HybridCar extends Car {
    
    private double avgKmPerLitre;
    private int batterySize;
    private int cylinders;

    public HybridCar(String description, double avgKmPerLitre, int batterySize, int cylinders) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }

    @Override
    public void drive() {
        System.out.println("HybridCar -> drive()");
    }

    public void basicInfo() {
        System.out.println("HybridCar: " + getDescription() + ", " + avgKmPerLitre + " km/l, " + batterySize + " kWh battery, " + cylinders + " cylinders");
    }
}
