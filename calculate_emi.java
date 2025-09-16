package Constructor_Question;

public class loan_emi {
    private double loan_Amount;
    private double interest_Rate; // Annual interest rate in %
    private double months;
    private double emi;

    // Parameterized constructor
    loan_emi(double loan_Amount, double interest_Rate, double months) {
        this.loan_Amount = loan_Amount;
        this.interest_Rate = interest_Rate;
        this.months = months;
    }

    // Method to calculate EMI
    void calculateEMI() {
        double monthlyRate = interest_Rate / (12 * 100); // Convert annual % to monthly decimal
        emi = (loan_Amount * monthlyRate * Math.pow(1 + monthlyRate, months)) /
              (Math.pow(1 + monthlyRate, months) - 1);
        System.out.printf("Calculated EMI: ₹%.2f\n", emi);
    }

    public static void main(String[] args) {
        loan_emi s1 = new loan_emi(50000, 12, 12); // ₹50,000 loan, 12% annual interest, 12 months
        s1.calculateEMI();
    }
}




















