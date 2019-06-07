// Marta Rosinska s18874
// Michal Kaczmarek s18464

package Zad7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Pizza> list = new ArrayList<>();
        PizzaSpecial special1 = new PizzaSpecial(500, "SpecialA ,", 19.99, " mala", "mala ilosc", "srednia ilosc", "srednia ilosc");
        PizzaSpecial special2 = new PizzaSpecial(700, "SpecialB ,", 20.99, " mala", "duza ilosc", "srednia ilosc", "duza ilosc");
        PizzaSpecial special3 = new PizzaSpecial(450, "SpecialC ,", 23.00, " sredia", "mala ilosc", "duza ilosc", "mala ilosc");
        PizzaSpecial special4 = new PizzaSpecial(980, "SpecialD ,", 31.99, " duza", "srednia ilosc", "mala ilosc", "srednia ilosc");
        PizzaSpecial special5 = new PizzaSpecial(768, "SpecialE ,", 21.49, " srednia", "mala ilosc", "srednia ilosc", "duza ilosc");
        PizzaSpecial special6 = new PizzaSpecial(874, "SpecialF ,", 18.17, " mala", "duza ilosc", "duza ilosc", "duza ilosc");
        PizzaSpecial special7 = new PizzaSpecial(567, "SpecialG ,", 24.99, " srednia", "mala ilosc", "srednia ilosc", "mala ilosc");
        PizzaDeluxe deluxe1 = new PizzaDeluxe(767, "DeluxeA", 27.66, "duza", "mala ilosc", "duza ilosc", "srednia ilosc");
        PizzaDeluxe deluxe2 = new PizzaDeluxe(544, "DeluxeB", 22.33, "mala", "duza ilosc", "mala ilosc", "mala ilosc");
        PizzaDeluxe deluxe3 = new PizzaDeluxe(877, "DeluxeC", 19.99, "sredia", "mala ilosc", "srednia ilosc", "duza ilosc");
        PizzaDeluxe deluxe4 = new PizzaDeluxe(765, "DeluxeD", 16.87, "duza", "mala ilosc", "duza ilosc", "mala ilosc");
        PizzaDeluxe deluxe5 = new PizzaDeluxe(438, "DeluxeE", 24.56, "duza", "srednia ilosc", "srednia ilosc", "srednia ilosc");
        PizzaDeluxe deluxe6 = new PizzaDeluxe(654, "DeluxeF", 31.55, "duza", "mala ilosc", "duza ilosc", "duza ilosc");
        PizzaDeluxe deluxe7 = new PizzaDeluxe(677, "DeluxeG", 29.99, "mala", "duza ilosc", "mala ilosc", "srednia ilosc");
        PizzaWoogy woogy1 = new PizzaWoogy(455, "WoggyA", 22.98, "srednia", "duza ilosc", "mala ilosc", "srednia ilosc");
        PizzaWoogy woogy2 = new PizzaWoogy(664, "WoggyB", 19.12, "duza", "duza ilosc", "mala ilosc", "srednia ilosc");
        PizzaWoogy woogy3 = new PizzaWoogy(765, "WoggyC", 31.22, "duza", "mala ilosc", "duza ilosc", "srednia ilosc");
        PizzaWoogy woogy4 = new PizzaWoogy(987, "WoggyD", 32.65, "mala", "srednia ilosc", "mala ilosc", "duza ilosc");
        PizzaWoogy woogy5 = new PizzaWoogy(678, "WoggyE", 19.45, "mala", "duza ilosc", "mala ilosc", "srednia ilosc");
        PizzaWoogy woogy6 = new PizzaWoogy(612, "WoggyF", 24.44, "srednia", "duza ilosc", "srednia ilosc", "duza ilosc");
        PizzaWoogy woogy7 = new PizzaWoogy(714, "WoggyG", 32.17, "srednia", "srednia ilosc", "mala ilosc", "duza ilosc");
        PizzaSpecial newSpecial = new PizzaSpecial(0, "", 0, "", "", "", "");

        list.add(special1);
        list.add(special2);
        list.add(special3);
        list.add(special4);
        list.add(special5);
        list.add(special6);
        list.add(special7);
        list.add(deluxe1);
        list.add(deluxe2);
        list.add(deluxe3);
        list.add(deluxe4);
        list.add(deluxe5);
        list.add(deluxe6);
        list.add(deluxe7);
        list.add(woogy1);
        list.add(woogy2);
        list.add(woogy3);
        list.add(woogy4);
        list.add(woogy5);
        list.add(woogy6);
        list.add(woogy7);
        Collections.sort(list);
        for (Pizza pizza : list) {
            System.out.println(pizza);
        }
        String name;
        int calories;
        int price;
        int choice;
        System.out.println("Stworz nowa pizze");
        System.out.println("Podaj nazwe");
        name = sc.nextLine();
        newSpecial.setName(name);
        System.out.println("Podaj ilosc kalorii");
        calories = sc.nextInt();
        newSpecial.setCalories(calories);
        System.out.println("Podaj cene");
        price = sc.nextInt();
        newSpecial.setPrice(price);
        for (int i = 0; i < 1; i++) {
            System.out.println("podaj wielkosc pizzy\n1 - mala pizza\n2 - srednia pizza\n3 - duza pizza");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    newSpecial.smallSize();
                    break;
                case 2:
                    newSpecial.mediunSize();
                    break;
                case 3:
                    newSpecial.largeSize();
                    break;
                default:
                    System.out.println("Nieodpowiednia wartosc");
                    i--;
            }
        }
        for (int i = 0; i < 1; i++) {
            System.out.println("podaj ilosc oliwek");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    newSpecial.littleOlive();
                    break;
                case 2:
                    newSpecial.mediumOlive();
                    break;
                case 3:
                    newSpecial.largeOlive();
                    break;
                default:
                    System.out.println("Nieodpoweidnia wartosc");
                    i--;
            }
        }
        for (int i = 0; i < 1; i++) {
            System.out.println("podaj ilosc szynki parmenskiej");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    newSpecial.littleParmham();
                    break;
                case 2:
                    newSpecial.mediumParmHam();
                    break;
                case 3:
                    newSpecial.largeParmHam();
                    break;
                default:
                    System.out.println("Nieodpowiednia wartosc");
                    i--;
            }

        }
        for (int i = 0; i < 1; i++) {
            System.out.println("podaj ilosc pepperoni");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    newSpecial.littlePepperoni();
                    break;
                case 2:
                    newSpecial.mediumPepproni();
                    break;
                case 3:
                    newSpecial.largePepperoni();
                    break;
                default:
                    System.out.println("Nieodpowiednia wartosc");
                    i--;
            }
        }
        list.add(newSpecial);
        Collections.sort(list);
        for (Pizza pizza : list) {
            System.out.println(pizza);
        }
    }
}
