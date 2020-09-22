package ru.geekbrains.lesson7;

public class Plate {
    private int amountOfFood;

    Plate(int amountOfFood) {
        this.amountOfFood = amountOfFood;
    }

    @Override
    public String toString() {
        return "Еды в тарелке: " + amountOfFood;
    }

    void decreaseFood(int appetite) {
        if (amountOfFood >= appetite) {
            amountOfFood -= appetite;
        }
    }

    int getAmountOfFood() {
        return amountOfFood;
    }

    void increaseFood(int amount) {
        amountOfFood += amount;
    }
}
