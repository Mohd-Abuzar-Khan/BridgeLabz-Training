package loanbuddy;

public class LoanBuddy {

    public static void main(String[] args) {

        // Applicant with decent credit score
        Applicant applicant1 = new Applicant(
                "Mohd Abuzar Khan",
                630,
                55000,
                500000,
                "self-employed"
        );

        // Applicant with low credit score
        Applicant applicant2 = new Applicant(
                "Rahul Sharma",
                480,
                40000,
                300000,
                "salaried"
        );

        // Applicant with excellent credit score
        Applicant applicant3 = new Applicant(
                "Ayesha Khan",
                750,
                90000,
                800000,
                "business owner"
        );

        // Applicant with borderline credit score
        Applicant applicant4 = new Applicant(
                "Sneha Verma",
                520,
                60000,
                400000,
                "freelancer"
        );

        // Create a personal loan
        PersonalLoan personalLoan = new PersonalLoan(
                14,     // loan term
                12.0,   // interest rate
                520     // required credit score
        );

        // Test loan approval for each applicant
        personalLoan.approveLoan(applicant1);
        personalLoan.approveLoan(applicant2);
        personalLoan.approveLoan(applicant3);
        personalLoan.approveLoan(applicant4);

        // Calculate EMI for approved loan amount
        double emi = personalLoan.calculateEMI(500000);

        // Display EMI
        System.out.println("Monthly EMI: " + emi);
    }
}
