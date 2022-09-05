package com.company.shower;

public class Shower {
    private int maxCapacity;
    private int currentCapacity = 0;
    private GenderType currentGender;
    private int currentTime = 0;

    public Shower(int maxCapacity)
    {
        this.maxCapacity = maxCapacity;
    }

    public synchronized void goToShower(Person person)
    {

        while ((currentCapacity>=maxCapacity || currentGender!=person.getGender() || currentTime<person.getHour())
                && currentCapacity!=0 && currentTime!=0)
        {
            try
            {
                System.out.println(person.getPersonName() + " ������� ����� �������(" + person.getHour() + " �����, � ���� "
                        + currentCapacity + " �������)");
                wait();
            }
            catch (InterruptedException e){}
        }

        if(currentCapacity == 0){
            currentGender = person.getGender();
            currentTime = person.getHour();
        }
        currentCapacity++;
        System.out.println(person.getPersonName() + " �����(�) � ���(" + person.getHour() + " �����, � ���� "
                + currentCapacity + " �������)");
        notify();
    }

    public  synchronized void  goOutShower(Person person)
    {
        currentCapacity--;
        System.out.println(person.getPersonName() + " �����(�) �� ����(" + person.getHour() + " �����, � ���� "
                + currentCapacity + " �������)");
        notify();
    }

}

