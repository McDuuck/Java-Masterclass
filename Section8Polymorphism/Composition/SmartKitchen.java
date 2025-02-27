package Section8Polymorphism.Composition;

public class SmartKitchen {
    
    private CoffeeMaker brewMaster;
    private DishWasher dishWasher;
    private Refrigerator iceBox;

    public SmartKitchen() {
        brewMaster = new CoffeeMaker();
        dishWasher = new DishWasher();
        iceBox = new Refrigerator();
    }

    public CoffeeMaker getBrewMaster() {
        return brewMaster;
    }

    public DishWasher getDishWasher() {
        return dishWasher;
    }

    public Refrigerator getIceBox() {
        return iceBox;
    }

    public void setKitchenWork(boolean coffee, boolean dish, boolean refri) {
        brewMaster.setHasWorkToDo(coffee);
        dishWasher.setHasWorkToDo(dish);
        iceBox.setHasWorkToDo(refri);
    }

    public void doKitchenWork() {
        brewMaster.brewCoffee();
        dishWasher.doDishes();
        iceBox.orderFood();
    }

}
