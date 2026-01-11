package loanbuddy;

public class HomeLoan extends LoanApplication {

    // Constructor sets Home Loan specific rules
    public HomeLoan(int term, double interestRate, int requiredCreditScore) {
        super("Home Loan", term, interestRate, requiredCreditScore);
    }

    // EMI calculation specific to Home Loan
    // Home loans usually have longer tenure and lower interest
    @Override
    public double calculateEMI(int principal) {

        double monthlyRate = interestRate / (12 * 100);
        int months = term;

        return (principal * monthlyRate * Math.pow(1 + monthlyRate, months))
                / (Math.pow(1 + monthlyRate, months) - 1);
    }

    // Home loan approval logic (stricter rules)
    @Override
    public boolean approveLoan(Applicant applicant) {

        if (applicant.isEligible(this) && applicant.getIncome() > principalEligibilityThreshold()) {
            System.out.println(" Home Loan Approved");
            setLoanStatus("APPROVED");
            return true;
        }

        System.out.println("Home Loan Rejected");
        setLoanStatus("REJECTED");
        return false;
    }

    // Internal income threshold logic
    private int principalEligibilityThreshold() {
        return 30000; // Example minimum income
    }
}
