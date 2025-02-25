package Section7OopInheritance.ConstructorChallenge;

public class Main {
    public static void main(String[] args) {
        Constructos obj1 = new Constructos("John Doe", "john.doe@example.com");
        Constructos obj2 = new Constructos("Jane Smith", 3000, "asdddddd@gmail.com");
        Constructos obj3 = new Constructos();

        System.out.println(obj1.getName());
        System.out.println(obj2.getName());
        System.out.println(obj3.getName() + " " + obj3.getEmail() + " " + obj3.getLimit());
        
    }
}
