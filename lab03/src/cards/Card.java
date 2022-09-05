package cards;

import accounts.Account;

import java.io.Serializable;

public class Card extends Account implements Serializable {
    public static int number;
    public static int balance;
    public cardType type;

    public cardType getType() {return type;}
    public void setType(cardType t) {this.type=t;}

    public void sInfo(){
        Info f = new Info();
        f.sendInfo();
    }
    public Card() {}
    public Card(int n, int b) {
        this.number=n;
        this.balance=b;
    }
    public Card(int n, int b, cardType t)
    {
        this.number=n;
        this.balance=b;
        this.type=t;
    }
    public class Info{
        public void sendInfo(){
            System.out.println("Info: Card");
        }
    }
    public int getNumber() {return number;}
    public  void setNumber(int number){this.number=number;}

    public int getBalance() {return balance;}
    public  void setBalance(int balance){this.balance=balance;}

}