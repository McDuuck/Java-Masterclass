package Section7OopInheritance.ExtraChallenge;

public class Main {
    public static void main(String[] args) {
        Employee ilmo = new Employee("Ilmo", "27/06/1800", "11/11/11");
        SalariedEmployee erno = new SalariedEmployee("Erno", "27/06/1800", "11/11/11", 50000);
        System.out.println(ilmo);
        System.out.println(ilmo.getAge());
        System.out.println(ilmo.collectPay());
        System.out.println(erno);
        System.out.println("Ernos salary: " + erno.collectPay());

        erno.retire();
        System.out.println("Ernos pension: " + erno.collectPay());
    }
}

