import admin.Admin;
import cards.*;
import cardTypes.*;
import accounts.*;
import admin.*;
import client.Client;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import xmlparser.SaxParser;
import javax.xml.XMLConstants;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;

public class Payments {
    private static final Logger logger = Logger.getLogger(Payments.class);

    public static void main(String[] args) throws cardException {
        try {
            Card a=new Card(1, 2000);
            Card b=new Card(2, 2300);
            Card c=new Card(3, 5000);

            // XML parse
            ArrayList<Card>h=new ArrayList<Card>();
            h.add(a);
            h.add(b);
            h.add(c);
            SAXParserFactory factory= SAXParserFactory.newInstance();
            SAXParser parser=factory.newSAXParser();
            SaxParser saxp = new SaxParser();
            parser.parse(new File("files/cardList.xml"), saxp);
            Card card1 = saxp.getResult();
            System.out.println(card1.number);
            System.out.println(card1.balance);
            //XML serialization
            System.out.println("--------------XML serialization------------------");
            FileOutputStream out = new FileOutputStream("files/Serialize.xml");
            XMLEncoder xmlEncoder = new XMLEncoder(out);
            xmlEncoder.writeObject(card1);
            xmlEncoder.close();
            //deserialization XML
            System.out.println("--------------XML deserialization------------------");
            FileInputStream in = new FileInputStream("files/Serialize.xml");
            XMLDecoder xmlDecoder = new XMLDecoder(in);
            Card card2 = (Card) xmlDecoder.readObject();
            xmlDecoder.close();
            System.out.println(card2.number);
            System.out.println(card2.balance);
            //Gson serialization
            System.out.println("--------------JSON Serialization---------------");
            Gson gson = new GsonBuilder().create();
            String json = gson.toJson(card1);
            System.out.println(json);
            FileOutputStream jsonOut = new FileOutputStream("files/Serialize.json");
            byte[] outText = json.getBytes(StandardCharsets.UTF_8);
            jsonOut.write(outText, 0, outText.length);
            //Gson deserialization
            System.out.println("--------------JSON Deserialization---------------");
            Scanner scanner = new Scanner(new File("files/Serialize.json"));
            String res = "";
            while(scanner.hasNext())
                res += scanner.nextLine();
            scanner.close();
            Card m3 = gson.fromJson(res, Card.class);
            System.out.println( m3.number);
            System.out.println(m3.balance);
            System.out.println("----------------------------------");
            Admin.printCompany(comp);
            //Stream API
            System.out.println("-------------------Stream API-------------");
            Stream<Staff> res_stream = h.stream().filter(w -> w.getSalary() > 1000);
            for(var x: res_stream.collect(Collectors.toList()))
            {
                System.out.println(x.name + " " + x.salary);
            }
            System.out.println("----------------------------------");
            Stream<Staff> res_stream2=h.stream().limit(2);
            for(var x: res_stream2.collect(Collectors.toList()))
            {
                System.out.println(x.name + " " + x.salary);
            }

            /*3 lab*/
   /*         Card a = new Card();
            a.sInfo();
            BasicConfigurator.configure();
            logger.info("Starting program_____________________________");
            logger.warn("Be careful with input data!\n");
            Credit card1 = new Credit(54432, 100);
            Debit card2 = new Debit(43278, 200);
            Overdraft card3 = new Overdraft(38574, 2942);
            Prepaid card4 = new Prepaid(47298, 397);
            logger.debug("Check all input data...");
            Account cardList1 = new Account();
            cardList1.add(card1);
            cardList1.add(card2);
            cardList1.add(card3);
            cardList1.add(card4);
            cardList1.number = 1983;
            cardList1.balance = card1.balance + card2.balance + card3.balance + card4.balance;
            cardList1.displayInfo();

            Admin a1 = new Admin();
            a1.Block(1983);
            cardList1.displayInfo();
            a1.Search("0");
            //a1.Search("89");
            a1.NewAccount(1745, 267);
            cardList1.displayInfo();

            Client client1 = new Client("Nike");
            client1.Addition(1745, 897);
            cardList1.displayInfo();

            //client1.Show(1980);
            client1.Show(1745);
            client1.Block(1745);
            System.out.println("After blocking:");
            client1.Show(1745);
            logger.info("You successfully ran this program!");*/
        }
        catch (Exception e) {
            logger.fatal("Fatal error! " + e.getMessage());
        }
    }
}
