package cardTypes;
import accounts.Account;
import cards.Card;
import cards.cardType;
import cards.cardException;

public class Debit extends Card{
    private final cardType type=cardType.debit;
    private int balance;
    private int number;

    public Debit(){}
    public Debit(int number,int b) throws cardException {
        super(number,b);
        if (number<0 || number/10000<0 || number/10000>9) throw new cardException("Неверный номер карты");
        this.balance=b;
    }

    public void Type(){System.out.println(type);}

    @Override
    public cardType getType() {return type;}
}
