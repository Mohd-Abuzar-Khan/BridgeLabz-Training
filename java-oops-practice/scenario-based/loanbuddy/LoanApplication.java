package loanbuddy;

public abstract class LoanApplication implements IApprovable {

    // Common loan attributes
    protected String type;
    protected int term;                 // in months
    protected double interestRate;
    protected int requiredCreditScore;

    // Loan status controlled internally
    private String loanStatus;

    // Base constructor
    public LoanApplication(String type, int term, double interestRate, int requiredCreditScore) {
        this.type = type;
        this.term = term;
        this.interestRate = interestRate;
        this.requiredCreditScore = requiredCreditScore;
        this.loanStatus = "PENDING";
    }

    // Getter for required credit score (read-only)
    public int getRequiredCreditScore() {
        return requiredCreditScore;
    }

    // Read-only loan status
    public String getLoanStatus() {
        return loanStatus;
    }

    // Status change allowed only internally
    protected void setLoanStatus(String status) {
        this.loanStatus = status;
    }

    // Default approval logic (can be overridden)
    @Override
    public boolean approveLoan(Applicant applicant) {

        if (applicant.isEligible(this)) {
            setLoanStatus("APPROVED");
            System.out.println("✅ " + type + " Approved");
            return true;
        }

        setLoanStatus("REJECTED");
        System.out.println("❌ " + type + " Rejected");
        return false;
    }

    // Force subclasses to implement EMI logic
    @Override
    public abstract double calculateEMI(int principal);
}