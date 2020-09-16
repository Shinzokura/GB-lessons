package ru.geekbrains.lesson6;


abstract class Animal {

    abstract void run(int length);

    abstract void swim(int length);

    abstract void jump(double height);
}

class Cat extends Animal {
    private final int MAX_RUN_LENGTH = 200;
    private final double MAX_JUMP_HEIGHT = 2;

    @Override
    void run(int length) {
        if ((length > 0) && (length <= MAX_RUN_LENGTH)) System.out.println("Беги, котя, беги");
        else System.out.println("Малясь не добежал");
    }

    @Override
    void swim(int length) {
        System.out.println("Котэ утоп");
    }

    @Override
    void jump(double height) {
        if ((height > 0) && (height <= MAX_JUMP_HEIGHT)) System.out.println("Бесконечность для кота - не предел");
        else System.out.println("Упсь...");
    }
}

class Dog extends Animal {
    private final int MAX_RUN_LENGTH = 500;
    private final int MAX_SWIM_LENGTH = 10;
    private final double MAX_JUMP_HEIGHT = 0.5;

    @Override
    void run(int length) {
        if ((length > 0) && (length <= MAX_RUN_LENGTH)) System.out.println("Фас!");
        else System.out.println("Мдемс");
    }

    @Override
    void swim(int length) {
        if ((length > 0) && (length <= MAX_SWIM_LENGTH)) System.out.println("Пойдем поплаваем?");
        else System.out.println("Пёся утоп");
    }

    @Override
    void jump(double height) {
        if ((height > 0) && (height <= MAX_JUMP_HEIGHT)) System.out.println("Достанешь - получишь вкусняшку");
        else System.out.println("Собакен старый стал совсем");
    }
}

class HW6_1to4 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.run(192);
        cat.swim(1);
        cat.jump(1.9);

        Dog dog = new Dog();
        dog.run(520);
        dog.swim(0);
        dog.jump(0.4);
    }
}
