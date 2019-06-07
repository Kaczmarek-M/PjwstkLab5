// Marta Rosinska s18874
// Michal Kaczmarek s18464

package Zad6;

public class BusinessLoan extends Loan{
    public BusinessLoan(long loanNumber, String customerLastName, double amountOfLoan, int term, double interestRate, double totalAmount) {
        super(loanNumber, customerLastName, amountOfLoan, term, interestRate + 1, totalAmount);
    }

}
