package basejava;
import by.belstu.it.Buranko.WrapperString;

import java.nio.charset.StandardCharsets;

import static java.lang.Math.*;
public class JavaTest {
    static int sint;

    final int c1=8;
    public final int c2=4;
    public static final int c3=6;


    public static void main(String[] args) {
        char ch='K';
        int i=6;
        short sh=32767;
        byte b=127;
        long l=36466;
        boolean bl=true;
        String s="kfglfll";
        double d=4848.394;
        System.out.println(s+i);
        System.out.println(s+ch);
        System.out.println(s+d);
        //byte b1=b+i;
        //int i1=d+l;
        long l1=i+2147483647;
        System.out.println(sint);
        boolean bl1=bl && bl;
        boolean bl2=bl ^ bl;
        //boolean bl3=bl+bl;
        long ll=9223372036854775807l;
        long lll=0x7fff_ffff_fffl;
        char ch1='a';
        char ch2='\u0061';
        char ch3=97;
        System.out.println(ch1+ch2+ch3);
        System.out.println(3.45%2.4);
        System.out.println(1.0/0.0);
        System.out.println(0.0/0.0);
        System.out.println(Math.log(-345));
        System.out.println(Float.intBitsToFloat(0x7F800000));
        System.out.println(Float.intBitsToFloat(0xFF800000));
        System.out.println(Math.PI);
        System.out.println(Math.E);
        System.out.println(Math.round(Math.PI));
        System.out.println(Math.min(Math.PI,Math.E));
        System.out.println(Math.random()%1);

        Integer i1=Integer.valueOf("67");
        Boolean b1=Boolean.valueOf("str");
        Character c1=Character.valueOf('G');
        Byte bb1=Byte.valueOf("45");
        Short sh1=Short.valueOf("5456");
        Long lo1=Long.valueOf(1111);
        Double do1=Double.valueOf(2.3);
        System.out.println(i1<<bb1);
        System.out.println(do1+lo1);
        System.out.println(Long.MAX_VALUE+" "+Long.MIN_VALUE);
        System.out.println(Double.MAX_VALUE+" "+Double.MIN_VALUE);
        Integer ii1=10;
        int ii2=34;
        ii2=new Integer(23);
        Byte by1=78;
        byte by2=6;
        by2=new Byte(by1);
        System.out.println(Integer.parseInt("89"));
        System.out.println(Integer.toHexString(55));
        System.out.println(Integer.compare(3,4));
        System.out.println(Integer.toString(5));
        System.out.println(Integer.bitCount(77));
        System.out.println(Double.isNaN(6.6));
        System.out.println(Double.isNaN(Math.log(-7)));

        System.out.println(new Integer("55"));
        String s34="2345";
        System.out.println(Integer.valueOf(s34));
        System.out.println(Integer.parseInt(s34));
        System.out.println(s34.getBytes());
        System.out.println(new String(s34.getBytes()));
        System.out.println(Boolean.parseBoolean(s34));
        System.out.println(Boolean.valueOf(s34));
        String f1="gogo";
        String f2="gg";
        System.out.println(f1==f2); //ссылки
        System.out.println(f1.equals(f2)); //значения
        System.out.println(f2.compareTo(f1)); //длина
        System.out.println(f1.split("o"));
        System.out.println(f1.contains("go"));
        System.out.println(f1.hashCode());
        System.out.println(f1.indexOf("o"));
        System.out.println(f1.length());
        System.out.println(f1.replace("g","o"));

        char [][] cc1;
        char[] cc2[]={{3,2},{5,6}};
        char cc3[][]={{5,4},{2,4}};
        cc1=new char[3][];
        cc1[0]=new char[1];
        cc1[1]=new char[2];
        cc1[2]=new char[3];
        cc1[0][0]='h';
        cc1[1][0]='g';
        cc1[1][1]='k';
        cc1[2][0]='l';
        cc1[2][1]='f';
        cc1[2][2]='s';
        System.out.println(cc1.length);
        System.out.println(cc1[0].length);
        System.out.println(cc1[1].length);
        System.out.println(cc1[2].length);
        boolean comRex=cc2==cc3;
        System.out.println(comRex);
        System.out.println(cc2=cc3);
        for(char m[]:cc1) {
            System.out.println(m);
        }
    }
}