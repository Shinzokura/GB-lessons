package ru.geekbrains.lesson5;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Lukin Viktor", "CEO", "lukin77@yandex.ru", "89508761425", 60000, 45);
        employees[1] = new Employee("Sergeev Andrey", "HR-manager", "sandrew@gmail.com","89991684568", 40000, 30);
        employees[2] = new Employee("Vikhran Maria", "Secretary", "mayyamun@mail.ru", "89606489803", 38500, 24);
        employees[3] = new Employee("Filin Yegor", "PR-manager", "filin1234@ya.ru", "89505553535",39000, 40);
        employees[4] = new Employee("Nikulin Yaroslav","Manager", "nikuniku@gmail.com", "89642844048", 33000, 25);

        for(Employee employee : employees){
            if (employee.age > 40){
                employee.printInfo();
            }
    }

    }
}
