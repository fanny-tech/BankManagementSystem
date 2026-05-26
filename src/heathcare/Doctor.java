package heathcare;

public class Doctor extends Person {
    private String specialization;

    public Doctor(String name, int age, String email, String specialization) {
        super(name, age, email, "");
        this.specialization = specialization;
    }

    public String getSpecialization() { return specialization; }

    @Override
    public void displayInfo() {
        System.out.println("Doctor Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Email: " + email);
        System.out.println("Specialization: " + specialization);
        System.out.println("---------------------------");
    }
}