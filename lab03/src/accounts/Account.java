package accounts;

import java.util.ArrayList;
import cards.Card;
import cards.cardException;

import java.util.List;

public class Account{
    public static int number;
    public static int balance;
    private List<Card> cardList=new ArrayList<>();

    public Account(){
        cardList=new ArrayList<>();
    }
    public List<Card> getCardList(){return cardList;}
    public void setCardList(List<Card> cardList){this.cardList=cardList;}
    public void add(Card card){cardList.add(card);}
    public void delete(Card card){cardList.remove(card);}
    public void deleteAll(){cardList.removeAll(cardList);}
    public void displayInfo(){
        System.out.println("number of Account: \t balance: \n"+number+"\t\t\t\t\t"+balance);
    }


}
