package hospitalmanagement;

public class HospitalManagementSystem {

    public static void main(String[] args) {

        // Creating Doctor object
        Doctor doctor = new Doctor(101, "Dr. Sharma", "Cardiology");
        doctor.displayInfo();

        // Polymorphism : Patient reference
        Patient p1 = new InPatient(1, "Arif", 23, 5);
        Patient p2 = new OutPatient(2, "Rahul", 30, "01-Jan-2026");

        p1.displayInfo();
        p2.displayInfo();

        // Billing
        Payable bill = new Bill(500, 1200);
        System.out.println("Total Bill Amount: ₹" + bill.calculatePayment());
    }
}
