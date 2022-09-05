package com.company;

import java.util.Comparator;

public class CustomComparator implements Comparator<Staff> {
    public CustomComparator() {
    }

    public int compare(Staff o1, Staff o2) {
        if (o1.getSalary() > o2.getSalary()) {
            return 1;
        } else {
            return o1.getSalary() < o2.getSalary() ? -1 : 0;
        }
    }
}
