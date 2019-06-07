// Marta Rosinska s18874
// Michal Kaczmarek s18464

package Zad4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Runner machine = new Machine();
        Runner athlete = new Athlete();
        Runner political = new PoliticalCandidate();
        int choice;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 1; i++) {
            System.out.println("Choine 1: machine");
            System.out.println("Choine 2: athlete");
            System.out.println("Choine 3: political candidate");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    machine.run();
                    break;
                case 2:
                    athlete.run();
                    break;
                case 3:
                    political.run();
                    break;
                default:
                    System.out.println("Wrong choice \nTry one more time");
                    i--;
            }
        }
    }
}
