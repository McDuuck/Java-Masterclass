package Section7OopInheritance.ConstructorChallenge;

public class Constructos {
    private String name;
    private double limit;
    private String email;

    public Constructos(String name, double limit, String email) {
        this.name = name;
        this.limit = limit;
        this.email = email;
    }

    public Constructos() {
        this("Ilmo", 200.50, "asd@gmail.com");
    }

    public Constructos(String name, String email) {
        this(name, 200, email);
    }

    public String getName() {
        return this.name;
    }

    public double getLimit() {
        return this.limit;
    }

    public String getEmail() {
        return this.email;
    }


}
