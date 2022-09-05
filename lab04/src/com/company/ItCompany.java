package com.company;

import java.util.ArrayList;

public class ItCompany implements Company {
    public String companyName;
    private int countTeam;
    private ArrayList<Staff> itCompany = new ArrayList();

    public void setItCompany(ArrayList<Staff> comps) {
        this.itCompany = comps;
    }

    public ArrayList<Staff> getItCompany() {
        return this.itCompany;
    }

    public void AddWorker(Staff staff) {
        this.itCompany.add(staff);
        ++this.countTeam;
    }

    public int getCountTeam() {
        return this.countTeam;
    }

    public void setCountTeam(int count) throws Exception {
        if (count > 130) {
            throw new Exception("Превышен размер команды");
        } else {
            this.countTeam = count;
        }
    }

    public ItCompany(String name) {
        this.companyName = name;
    }
}

