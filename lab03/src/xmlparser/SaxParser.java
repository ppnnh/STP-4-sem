package xmlparser;

import javax.xml.stream.*;
import javax.xml.stream.events.XMLEvent;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;


import cards.Card;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class SaxParser extends DefaultHandler {
    Card card1 = new Card();
    String thisElement = "";

    public SaxParser() {
    }

    public void startDocument() throws SAXException {
        System.out.println("----> Start parse XML...");
    }

    public void startElement(String namespaceURI, String localName, String qName, Attributes atts) throws SAXException {
        this.thisElement = qName;
    }

    public Card getResult() {
        return this.card1;
    }

    public void characters(char[] ch, int start, int length) throws SAXException {
        if (this.thisElement.equals("number")) {
            this.card1.number = Integer.parseInt(new String(ch, start, length));
        } else if (this.thisElement.equals("balance")) {
            this.card1.balance = Integer.parseInt(new String(ch, start, length));
        }
    }

    public void endElement(String namespaceURI, String localName, String qName) throws SAXException {
        this.thisElement = "";
    }

    public void endDocument() {
        System.out.println("----> Stop parse XML...");
    }
}
