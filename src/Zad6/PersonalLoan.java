// Marta Rosinska s18874
// Michal Kaczmarek s18464

package Zad6;

public class PersonalLoan extends Loan{
    @Override
    public long getLoanNumber() {
        return super.getLoanNumber();
    }

    @Override
    public void setLoanNumber(long loanNumber) {
        super.setLoanNumber(loanNumber);
    }

    @Override
    public String getCustomerLastName() {
        return super.getCustomerLastName();
    }

    @Override
    public void setCustomerLastName(String customerLastName) {
        super.setCustomerLastName(customerLastName);
    }

    @Override
    public double getAmountOfLoan() {
        return super.getAmountOfLoan();
    }

    @Override
    public void setAmountOfLoan(double amountOfLoan) {
        super.setAmountOfLoan(amountOfLoan);
    }

    @Override
    public double getInterestRate() {
        return super.getInterestRate();
    }

    @Override
    public void setInterestRate(double interestRate) {
        super.setInterestRate(interestRate);
    }

    @Override
    public int getTerm() {
        return super.getTerm();
    }

    @Override
    public void setTerm(int term) {
        super.setTerm(term);
    }

    @Override
    public double getTotalAmount() {
        return super.getTotalAmount();
    }

    @Override
    public void setTotalAmount(double totalAmount) {
        super.setTotalAmount(totalAmount);
    }

    public PersonalLoan(long loanNumber, String customerLastName, double amountOfLoan, int term, double interestRate, double totalAmount) {
        super(loanNumber, customerLastName, amountOfLoan, term, interestRate + 2, totalAmount);




    }
}
