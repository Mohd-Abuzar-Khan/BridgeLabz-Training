package hospitalmanagement;

class OutPatient extends Patient {

    private String visitDate;

    public OutPatient(int id, String name, int age, String visitDate) {
        super(id, name, age);
        this.visitDate = visitDate;
    }

    @Override
    void displayInfo() {
        System.out.println(getSummary() + ", Visit Date: " + visitDate);
    }
}
