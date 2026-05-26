package heathcare;

import java.util.ArrayList;

public class HeathcareInformationSystem {

    public static void main(String[] args) {

        ArrayList<Patient>      patients      = new ArrayList<>();
        ArrayList<Doctor>       doctors       = new ArrayList<>();
        ArrayList<Pharmasist>   pharmacists   = new ArrayList<>();
        ArrayList<Receptionist> receptionists = new ArrayList<>();

        // Patients
        patients.add(new Patient(1, "Eric",  22, "Malaria"));
        patients.add(new Patient(2, "Alice", 20, "Typhoid"));

        // Doctors
        doctors.add(new Doctor("Karisa", 56, "karis@gmail.com", "Cardiology"));
        doctors.add(new Doctor("Keven",  45, "kev@gmail.com",   "Dentist"));

        // Pharmacists
        pharmacists.add(new Pharmasist("Keza", 35, "kez@gmail.com", "Paracetamol"));

        // Receptionists
        receptionists.add(new Receptionist("Alice", 33, "alic@gmail.com"));

        System.out.println("========== PATIENTS ==========");
        for (Patient p : patients)       p.displayInfo();

        System.out.println("========== DOCTORS ==========");
        for (Doctor d : doctors)         d.displayInfo();

        System.out.println("========== PHARMACISTS ==========");
        for (Pharmasist ph : pharmacists) ph.displayInfo();

        System.out.println("========== RECEPTIONISTS ==========");
        for (Receptionist r : receptionists) {
            r.displayInfo();
            r.registerPatient();
        }

        System.out.println("========== APPOINTMENTS ==========");
        Appointment appt = new Appointment("Eric", "Karisa", "2025-06-10");
        appt.showAppointment();

        System.out.println("========== BILLING ==========");
        Billing bill = new Billing(5000, 3);
        bill.displayBill();
    }
}