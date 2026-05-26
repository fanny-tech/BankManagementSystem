package heathcare;

public class Patient extends Person {
    private int id;
    private String disease;

    public Patient(int id, String name, int age, String disease) {
        super(name, age, "", "");
        this.id = id;
        this.disease = disease;
    }

    @Override
    public void displayInfo() {
        System.out.println("Patient ID: " + id);
        System.out.println("Patient Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Disease: " + disease);
        System.out.println("---------------------------");
    }
}