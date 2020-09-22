package ru.geekbrains.lesson7;
public class Main {
    public static void main(String[] args) {
        System.out.println("Котики:");
        Cat[] x = {new Cat("Умка", 20), new Cat("Том", 40), new Cat("Филя", 25)};
        Plate plate = new Plate(50);
        for (Cat c : x) {
            System.out.println(c);
        }
        System.out.println("\n" + plate);
        System.out.println("***********************************************");
        plate.increaseFood(100);
        System.out.println("Накладываем покушоц");
        System.out.println(plate);
        System.out.println("***********************************************");
        System.out.println("Котики кушают:");
        for (Cat c : x) {
            c.eat(plate);
            System.out.println(c);
            System.out.println(plate);
        }
    }
}
