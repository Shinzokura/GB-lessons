package ru.geekbrains.lesson1;

public class Main {
    public static void main(String[] args) {
        byte by = 77;
        short sh = 777;
        int in = 3000;
        long lo = 100500L;
        float fl = 14.88f;
        double dou = 3.22;
        char ch = 16;
        boolean bool = true;
        System.out.println(calculate(100, 15, 50, 30));
        System.out.println(task10and20(50, 10));
        isPositiveOrNegative(0);
        System.out.println(isNegative(100));
        greetings("Дмитрий");
    }

    public static float calculate(int a, int b, int c, int d) {

        return a * (b + (c / d));
    }
    public static boolean task10and20(int x1, int x2) {
        int res = x1 + x2;
        if (res >= 10 && res <= 20) {
            return true;
        }
        return false;

    }
    public static void isPositiveOrNegative(int x){

            if (x >= 0) {
                System.out.println("Введено положительное число");
            } else {
                System.out.println("Введено отрицательное число");
            }
        }
    public static boolean isNegative(int x) {
        if(x<0) {
            return true;
        }
        return false;
    }
    public static void greetings(String name) {
        System.out.println("Дратути, " + name);
    }




}


