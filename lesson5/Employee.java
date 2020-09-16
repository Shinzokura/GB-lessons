package ru.geekbrains.lesson5;

public class Employee {
     String fullName;
     String post;
     String email;
     String phoneNum;
     int salary;
     int age;

    public Employee(String fullName, String post, String email, String phoneNum, int salary, int age) {
        this.fullName = fullName;
        this.post = post;
        this.email = email;
        this.phoneNum = phoneNum;
        this.salary = salary;
        this.age = age;
    }
  public void printInfo(){
      System.out.println(this);

  }

    @Override
    public String toString() {
        return "Employee{ " +
                "Name='" + fullName + '\'' +
                ", Post='" + post + '\'' +
                ", Email='" + email + '\'' +
                ", Phone number='" + phoneNum + '\'' +
                ", Salary=" + salary +
                ", Age=" + age +
                " }";
    }
}

