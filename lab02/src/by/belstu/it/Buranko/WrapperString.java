package by.belstu.it.Buranko;

public class WrapperString {
    private String str="oo";
    public WrapperString(String str) {
        this.str=str;
    }
    public void replace(char oldchar, char newchar){
        System.out.println(str.replace(oldchar,newchar));
    }
    public void anonim() {
        WrapperString ww = new WrapperString(str) {
            public void replace(char oldchar, char newchar) {
                System.out.println(str.replace(oldchar, newchar));
            }

            public void delete(String newchar) {
                System.out.println(str.replace(newchar, ""));
            }
        };
    }
    /**
     * @author Lera
     * @version 1.0
     */
}
