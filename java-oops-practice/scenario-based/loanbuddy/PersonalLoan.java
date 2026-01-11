package loanbuddy;

public class PersonalLoan extends LoanApplication {

    // Constructor sets Personal Loan specific rules
    public PersonalLoan(int term, double interestRate, int requiredCreditScore) {
        super("Personal Loan", term, interestRate, requiredCreditScore);
    }

    // EMI calculation for Personal Loan
    // Personal loans usually have higher interest and shorter tenure
    @Override
    public double calculateEMI(int principal) {

        double monthlyRate = interestRate / (12 * 100);
        int months = term;

        return (principal * monthlyRate * Math.pow(1 + monthlyRate, months))
                / (Math.pow(1 + monthlyRate, months) - 1);
    }

    // Approval logic specific to Personal Loan
    @Override
    public boolean approveLoan(Applicant applicant) {

        // Personal loans are less strict but higher risk
        if (applicant.isEligible(this)) {
            setLoanStatus("APPROVED");
            System.out.println("Personal Loan Approved");
            return true;
        }

        setLoanStatus("REJECTED");
        System.out.println("Personal Loan Rejected");
        return false;
    }
}
