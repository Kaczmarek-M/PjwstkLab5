// Marta Rosinska s18874
// Michal Kaczmarek s18464

package Zad6;

public abstract class Loan implements ILoanConstants {
    private long loanNumber;
    private String customerLastName;
    private double amountOfLoan;
    private double interestRate;
    private int term;
    private double totalAmount;

    public Loan(long loanNumber, String customerLastName, double amountOfLoan, int term, double interestRate, double totalAmount) {
        this.loanNumber = loanNumber;
        this.customerLastName = customerLastName;
        this.amountOfLoan = amountOfLoan;
        this.term = term;
        this.interestRate = interestRate + 2;
        this.totalAmount = totalAmount;
    }

    @Override
    public void shortTerm() {
        double totalAmountTerm;
        double sum;
        totalAmountTerm = amountOfLoan / 100;
        sum = totalAmountTerm * interestRate;
        totalAmount = amountOfLoan + sum;
    }

    @Override
    public void mediumTerm() {
        double totalAmountTerm;
        double sum;
        totalAmountTerm = amountOfLoan / 100;
        sum = totalAmountTerm * interestRate;
        totalAmount = amountOfLoan + (3 * sum);
    }

    @Override
    public void longTerm() {
        double totalAmountTerm;
        double sum;
        totalAmountTerm = amountOfLoan / 100;
        sum = totalAmountTerm * interestRate;
        totalAmount = amountOfLoan + (5 * sum);
    }

    @Override
    public int maxLoanAmount() {
        return 100000;
    }

    @Override
    public String toString() {
        return "Loan{" +
                "loanNumber=" + loanNumber +
                ", customerLastName='" + customerLastName + '\'' +
                ", amountOfLoan=" + amountOfLoan +
                ", totalAmount=" + totalAmount +
                ", interestRate=" + interestRate +
                ", term=" + term +
                '}';
    }

    public long getLoanNumber() {
        return loanNumber;
    }

    public void setLoanNumber(long loanNumber) {
        this.loanNumber = loanNumber;
    }

    public String getCustomerLastName() {
        return customerLastName;
    }

    public void setCustomerLastName(String customerLastName) {
        this.customerLastName = customerLastName;
    }

    public double getAmountOfLoan() {
        return amountOfLoan;
    }

    public void setAmountOfLoan(double amountOfLoan) {
        this.amountOfLoan = amountOfLoan;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public int getTerm() {
        return term;
    }

    public void setTerm(int term) {
        this.term = term;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }
}
