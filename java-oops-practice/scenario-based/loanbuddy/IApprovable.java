package loanbuddy;

public interface IApprovable {

    // Approves or rejects the loan based on rules
    boolean approveLoan(Applicant applicant);

    // Calculates EMI based on principal amount
    double calculateEMI(int principal);
}
