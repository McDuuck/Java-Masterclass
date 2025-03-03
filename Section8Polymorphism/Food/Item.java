package Section8Polymorphism.Food;

public class Item {
    
    private String type;
    private String name;
    private double price;
    private String size = "MEDIUM";

    public Item(String type, String name, double price) {
        this.type = type.toUpperCase();
        this.name = name.toUpperCase();
        this.price = price;
    }

    public String getName() {

        if (type.equals("DRINK") || type.equals("SIDE")) {
            return size + " " + name;
        }
        return name;
    }

    public double getBasePrice() {
        return price;
    }

    public double getAdjustedPrice() {
        return switch (size) {
            case "SMALL" -> price - 0.50;
            case "LARGE" -> price + 1;
            default -> price;
        };
    }

    public void setSize(String size) {
        this.size = size;
    }

    public static void printItem(String name, double price) {
        System.out.printf("%20s: %6.2f%n", name, price);
    }

    public void printItem() {
        printItem(getName(), getAdjustedPrice());
    }
}
