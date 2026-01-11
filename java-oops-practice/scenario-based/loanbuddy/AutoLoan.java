package loanbuddy;

public class AutoLoan extends LoanApplication {

    // Constructor initializes AutoLoan-specific values
    public AutoLoan(int term, double interestRate, int requiredCreditScore) {
        super("Auto Loan", term, interestRate, requiredCreditScore);
    }

    // Auto loan approval logic
    @Override
    public boolean approveLoan(Applicant applicant) {

        if (applicant.isEligible(this)) {
            System.out.println("Auto Loan Approved");
            setLoanStatus("APPROVED");
            return true;
        }

        System.out.println(" Auto Loan Rejected");
        setLoanStatus("REJECTED");
        return false;
    }

    // EMI calculation specific to Auto Loan
    @Override
    public double calculateEMI(int principal) {

        double monthlyRate = interestRate / (12 * 100);
        int months = term;

        return (principal * monthlyRate * Math.pow(1 + monthlyRate, months))
                / (Math.pow(1 + monthlyRate, months) - 1);
    }
}
