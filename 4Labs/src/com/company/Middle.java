package com.company;

public class Middle extends Staff {
    public Middle(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public Middle() {
    }

    public void Work() {
        System.out.println(this.name + " working on the project");
    }
}
