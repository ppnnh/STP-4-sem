package by.belstu.it.Buranko;
import com.company.Test;
public class Main {

    public static void main(String[] args) {
	// write your code here
        //TODO Add a new method
        extracted();
        for (int i=0; i<9; i++) {
            if (i > -1)
                if (i < 10)
                    System.out.println(i);
        }

    }

    private static void extracted() {
        TextFunction obj=new TextFunction();
        System.out.println(obj.getValue());
    }
/**
 * @return value
 * @throws error
 * @param args
 */
}
