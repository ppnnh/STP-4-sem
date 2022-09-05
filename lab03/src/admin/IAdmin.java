package admin;
import cards.*;
public interface IAdmin {
    public void Search(String s) throws cardException;
    public void Block(int n);
}
