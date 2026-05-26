package heathcare;

public abstract class Person {
    protected String name;
    protected int age;
    protected String email;
    protected String location;

    public Person(String name, int age, String email, String location) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.location = location;
    }

    public String getName()     { return name; }
    public int getAge()         { return age; }
    public String getEmail()    { return email; }
    public String getLocation() { return location; }

    public abstract void displayInfo();
}