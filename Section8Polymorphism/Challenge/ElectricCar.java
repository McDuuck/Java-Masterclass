package Section8Polymorphism.Challenge;

public class ElectricCar extends Car {
    
    private double avgKmPerCharge;
    private int batterySize;

    public ElectricCar(String description, double avgKmPerCharge, int batterySize) {
        super(description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }

    @Override
    public void drive() {
        System.out.println("ElectricCar -> drive()");
    }

    public void basicInfo() {
        System.out.println("ElectricCar: " + getDescription() + ", " + avgKmPerCharge + " km/charge, " + batterySize + " kWh battery");
    }
}
