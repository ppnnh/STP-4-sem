package com.company;

public abstract class Staff {
    public String name;
    public int age;
    public int salary;

    public Staff() {
    }

    public int getSalary() {
        return this.salary;
    }
}
