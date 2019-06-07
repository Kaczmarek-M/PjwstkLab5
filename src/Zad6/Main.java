// Marta Rosinska s18874
// Michal Kaczmarek s18464

package Zad6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ICompanyName company = new Company();
        BusinessLoan TomBusiness = new BusinessLoan(1234599785, "Hardy", 30000, 12, 0, 0);
        BusinessLoan MaxBusiness = new BusinessLoan(12325663, "Kowalczyk", 100000, 36, 0, 0);
        PersonalLoan MichaelPerson = new PersonalLoan(12874375, "Kaczmarek", 85000, 60, 0, 0);
        PersonalLoan BarbaraPerson = new PersonalLoan(124534365, "Streisand", 21200, 36, 0, 0);
        PersonalLoan newPerson = new PersonalLoan(0, "", 0, 0, 0, 0);
        BusinessLoan newBusiness = new BusinessLoan(0, "", 0, 0, 0, 0);
        List<ILoanConstants> list = new ArrayList<>();
        list.add(TomBusiness);
        list.add(MaxBusiness);
        list.add(MichaelPerson);
        list.add(BarbaraPerson);

        TomBusiness.shortTerm();
        MaxBusiness.mediumTerm();
        MichaelPerson.longTerm();
        BarbaraPerson.mediumTerm();
        for (ILoanConstants lo : list)
            System.out.println(lo);

        System.out.println("\nWitamy w firmie " + company.companyName());
        for (int i = 0; i < 1; i++) {
            int amount;
            int choice;
            long number;
            String lastname;
            int term;
            System.out.println("Jezeli interesuje cie pozyczka osobista wybierz 1\nJezeli pozyczka biznesowa wybierz 2");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Podaj nazwisko");
                    lastname = sc.next();
                    newPerson.setCustomerLastName(lastname);

                    for (int j = 0; j < 1; j++) {
                        System.out.println("Podaj kwote");
                        amount = sc.nextInt();
                        if (amount <= 100000) {
                            newPerson.setAmountOfLoan(amount);
                        } else {
                            System.out.println("Nieodpowiednia kwota\nMaksymalna kwota to " + newPerson.maxLoanAmount());
                            j--;
                        }
                    }
                    System.out.println("Podaj numer pozyczki");
                    number = sc.nextLong();
                    newPerson.setLoanNumber(number);
                    for (int j = 0; j < 1; j++) {
                        System.out.println("Realizujemy trzy okresy kredytowania\n1. na rok\n2. na 3 lata\n3, na 5 lat");
                        System.out.println("Podaj okres kredytowania");
                        term = sc.nextInt();
                        if (term == 1) {
                            newPerson.setTerm(term * 12);
                            newPerson.shortTerm();
                        }
                        if (term == 3) {
                            newPerson.setTerm(term * 12);
                            newPerson.mediumTerm();
                        }
                        if (term == 5) {
                            newPerson.setTerm(term * 12);
                            newPerson.longTerm();
                        }
                        if (term == 2 || term == 4 || term > 5) {
                            newPerson.setTerm(12);
                            newPerson.shortTerm();
                        }
                    }
                    list.add(newPerson);
                    for (ILoanConstants l : list) {
                        System.out.println(l);
                    }
                    break;
                case 2:
                    System.out.println("Podaj nazwisko");
                    lastname = sc.next();
                    newBusiness.setCustomerLastName(lastname);
                    for (int j = 0; j < 1; j++) {
                        System.out.println("Podaj kwote");
                        amount = sc.nextInt();
                        if (amount <= 100000) {
                            newBusiness.setAmountOfLoan(amount);
                        } else {

                            System.out.println("Nieodpowiednia kwota\nMaksymalna kwota to " + newBusiness.maxLoanAmount());
                            j--;
                        }
                    }
                    System.out.println("Podaj numer pozyczki");
                    number = sc.nextLong();
                    newBusiness.setLoanNumber(number);
                    for (int j = 0; j < 1; j++) {
                        System.out.println("Realizujemy trzy okresy kredytowania\n1. na rok\n2. na 3 lata\n3, na 5 lat");
                        System.out.println("Podaj okres kredytowania");
                        term = sc.nextInt();
                        if (term == 1) {
                            newBusiness.setTerm(term * 12);
                            newBusiness.shortTerm();
                        }
                        if (term == 3) {
                            newBusiness.setTerm(term * 12);
                            newBusiness.mediumTerm();
                        }
                        if (term == 5) {
                            newBusiness.setTerm(term * 12);
                            newBusiness.longTerm();
                        }
                        if (term == 2 || term == 4 || term > 5) {
                            newBusiness.setTerm(12);
                            newBusiness.shortTerm();
                        }
                    }
                    list.add(newBusiness);
                    for (ILoanConstants l : list) {
                        System.out.println(l);
                    }
                    break;
            }
        }
    }
}
