package Section8Polymorphism.Composition;

public class Main {
    public static void main(String[] args) {
        
        SmartKitchen smartKitchen = new SmartKitchen();
        smartKitchen.setKitchenWork(true, false, true);

        smartKitchen.doKitchenWork();
    }
}
