package Section8Polymorphism.Food;

public class Main {
    public static void main(String[] args) {
        
        // Burger burger = new Burger("regular", 4);

        // burger.addToppings("cheese", "bacon", "avocado");
        // burger.printItem();

        MealOrder meal = new MealOrder();
        meal.addToppings("BACON", "CHEESE", "MAYO");
        meal.setDrinkSize("LARGE");
        meal.printItemizedList();

        MealOrder secondMeal = new MealOrder("turkey", "water", "salad");
        secondMeal.addToppings("AVOCADO", "HAM", "EGG");
        secondMeal.setDrinkSize("SMALL");
        secondMeal.printItemizedList();
    }
}
