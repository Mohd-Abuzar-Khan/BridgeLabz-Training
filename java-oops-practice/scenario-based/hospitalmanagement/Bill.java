package hospitalmanagement;

class Bill implements Payable {

    private double consultationFee;
    private double medicineCost;
    private double taxRate = 0.05; // 5% tax
    private double discount = 0.10; // 10% discount

    public Bill(double consultationFee, double medicineCost) {
        this.consultationFee = consultationFee;
        this.medicineCost = medicineCost;
    }

    @Override
    public double calculatePayment() {
        double total = consultationFee + medicineCost;
        double tax = total * taxRate;
        double discountAmount = total * discount;

        return total + tax - discountAmount;
    }
}
