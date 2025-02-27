package Section8Polymorphism.Composition;

public class CoffeeMaker{
    
    private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void brewCoffee() {
        if (hasWorkToDo) {
            System.out.println("Brewing!");
            hasWorkToDo = false;
        }
    }


}
