package client;

import accounts.Account;
import cards.cardException;

public class Client extends Account {
    private String name;
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name=name;
    }

    public Client(String s){
        this.name=s;
    }

    public void Show(int n) throws cardException {
        if (Account.number!=n) {throw new cardException("Account not found");}
        else Account.number=n;
        System.out.println("Balance: "+Account.balance);
    }
    public void Block(int n){
        Account.number=n;
        Account.balance=0;
    }
    public void Addition(int n, int i) {
        Account.number = n;
        Account.balance += i;
    }
}