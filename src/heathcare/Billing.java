package heathcare;

public class Billing {
    private double amount;
    private int service;

    public Billing(double amount, int service) {
        this.amount = amount;
        this.service = service;
    }

    public double getTotalAmount() {
        return amount * service;
    }

    public void displayBill() {
        System.out.println("Amount per service: " + amount);
        System.out.println("Number of services: " + service);
        System.out.println("Total Bill: " + getTotalAmount() + " RWF");
        System.out.println("---------------------------");
    }
}