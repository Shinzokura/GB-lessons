package ru.geekbrains.lesson2;

public class Task2 {
    public static void main(String[] args) {
        fillArray();
    }
    public static void fillArray() {
        int[] fill = new int[8];
        for (int i = 0, j = 0; i < fill.length; i++, j+=3) {
            fill[i] = j;
            System.out.print(fill[i] + " ");
        }
    }

}
