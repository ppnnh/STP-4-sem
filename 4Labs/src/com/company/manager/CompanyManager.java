package com.company.manager;

import com.company.CustomComparator;
import com.company.ItCompany;
import com.company.Staff;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class CompanyManager extends Staff {
    public CompanyManager() {
    }

    public void printCompany(ItCompany comp) {
        Iterator var2 = comp.getItCompany().iterator();

        while(var2.hasNext()) {
            Staff k = (Staff)var2.next();
            System.out.println("Имя " + k.name + " Зарплата: " + k.salary);
        }

    }

    public int TeamSize(ItCompany comp) {
        return comp.getItCompany().size();
    }

    public void Sort(ArrayList<Staff> list) {
        Collections.sort(list, new CustomComparator());
    }

    public void CompanyInfo(ItCompany company) {
        String var10001 = company.companyName;
        System.out.println("Имя комании: " + var10001 + "\nКол-во сотрудников: " + company.getCountTeam());
    }
}

