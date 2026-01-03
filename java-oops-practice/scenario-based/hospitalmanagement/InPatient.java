package hospitalmanagement;

class InPatient extends Patient {

    private int daysAdmitted;

    public InPatient(int id, String name, int age, int daysAdmitted) {
        super(id, name, age);
        this.daysAdmitted = daysAdmitted;
    }

    @Override
    void displayInfo() {
        System.out.println(getSummary() + ", Days Admitted: " + daysAdmitted);
    }
}
