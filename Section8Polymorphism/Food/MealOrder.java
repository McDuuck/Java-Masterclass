package Section8Polymorphism.Food;

public class MealOrder {
    
    private Burger burger;
    private Item drink;
    private Item side;

    public MealOrder() {
        this("regular", "soda", "fries");
    }

    public MealOrder(String burgerType, String drinkType, String sideType) {
        this.burger = new Burger(burgerType, 4);
        this.drink = new Item("Drink", drinkType, 2);
        this.side = new Item("Side", sideType, 1);
    }

    public double getTotalPrice() {
        return burger.getAdjustedPrice() + drink.getAdjustedPrice() + side.getAdjustedPrice();
    }

    public void printItemizedList() {
        burger.printItem();
        drink.printItem();
        side.printItem();
        System.out.println("-".repeat(30));
        Item.printItem("TOTAL", getTotalPrice());
    }

    public void addToppings(String extra1, String extra2, String extra3) {
        burger.addToppings(extra1, extra2, extra3);
    }

    public void setDrinkSize(String size) {
        drink.setSize(size);
    }
}
