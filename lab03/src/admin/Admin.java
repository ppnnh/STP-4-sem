package admin;

import accounts.Account;
import cards.*;

public class Admin extends Account implements IAdmin {
    public Admin(){}
    public void Search(String s) throws cardException {
        if (Integer.parseInt(s)== Account.number)
        {System.out.println("balance: "+Account.balance);}
        else if (Integer.parseInt(s)==Account.balance)
        {System.out.println("number: "+Account.number);}
        else throw new cardException("not found");
    }
    public void Block(int n){
        Account.number=n;
        Account.balance=0;
    }
    public void NewAccount(int n, int b){
        Account.number=n;
        Account.balance=b;
    }

    public void printCard(Card card) {

    }
}
