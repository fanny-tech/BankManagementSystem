package heathcare;

public class Pharmasist extends Person {
    private String medicine;

    public Pharmasist(String name, int age, String email, String medicine) {
        super(name, age, email, "");
        this.medicine = medicine;
    }

    @Override
    public void displayInfo() {
        System.out.println("Pharmacist Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Email: " + email);
        System.out.println("Medicine Given: " + medicine);
        System.out.println("---------------------------");
    }
}