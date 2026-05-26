package heathcare;

public class Receptionist extends Person {

    public Receptionist(String name, int age, String email) {
        super(name, age, email, "");
    }

    public void registerPatient() {
        System.out.println(name + " registered a patient");
    }

    @Override
    public void displayInfo() {
        System.out.println("Receptionist Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Email: " + email);
        System.out.println("---------------------------");
    }
}