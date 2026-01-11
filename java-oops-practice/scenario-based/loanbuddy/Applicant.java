package loanbuddy;

import java.util.ArrayList;
import java.util.List;

public class Applicant {

    // Applicant basic details
    protected String name;
    protected String employment;

    // Sensitive financial data (encapsulated)
    private int creditScore;
    private int income;
    protected int loanAmount;

    // List of loan applications made by applicant
    private List<LoanApplication> loans;

    // Constructor with validation
    public Applicant(String name, int creditScore, int income, int loanAmount, String employment) {
        this.name = name;
        this.creditScore = Math.max(creditScore, 0);
        this.income = Math.max(income, 0);
        this.loanAmount = Math.max(loanAmount, 0);
        this.employment = employment;
        this.loans = new ArrayList<>();
    }

    // Checks eligibility based on credit score
    public boolean isEligible(LoanApplication loan) {
        return this.creditScore >= loan.getRequiredCreditScore();
    }

    // Calculates credit risk percentage
    public double calculateCreditRisk(LoanApplication loan) {

        int requiredScore = loan.getRequiredCreditScore();

        // Maximum risk if no credit history
        if (creditScore == 0) {
            return 100.0;
        }

        // No risk if credit score is sufficient
        if (creditScore >= requiredScore) {
            return 0.0;
        }

        // Risk calculation formula
        return ((double) (requiredScore - creditScore) / requiredScore) * 100;
    }

    // Adds a loan application to applicant history
    public void applyForLoan(LoanApplication loan) {
        loans.add(loan);
    }

    // Getters (controlled access)
    public int getCreditScore() {
        return creditScore;
    }

    public int getIncome() {
        return income;
    }

    // Controlled setters (business-rule safe)
    protected void updateCreditScore(int newScore) {
        this.creditScore = Math.max(newScore, 0);
    }

    protected void updateIncome(int newIncome) {
        this.income = Math.max(newIncome, 0);
    }
}
