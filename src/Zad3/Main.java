// Marta Rosinska s18874
// Michal Kaczmarek s18464

package Zad3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Insurance life = new Life();
        Insurance health = new Health();
        int choice;
        for (int i = 0; i < 1; i++) {
            System.out.println("1 = Life insurance \n2 = Health insurance");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println(life.display());
                    break;
                case 2:
                    System.out.println(health.display());
                    break;
                default:
                    System.out.println("Wrong choice\nTry one more time");
                    i--;
            }
        }
    }
}
