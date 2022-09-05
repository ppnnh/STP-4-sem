package com.company;

public class TeamLead extends Staff {
    public TeamLead(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public void ManageWork() {
        System.out.println("Starting the meeting");
    }
}
