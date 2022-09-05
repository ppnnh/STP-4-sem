package com.company.Serilization4laba;

import com.company.Middle;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class SaxParser extends DefaultHandler {
    Middle worker = new Middle();
    String thisElement = "";

    public SaxParser() {
    }

    public void startDocument() throws SAXException {
        System.out.println("----> Start parse XML...");
    }

    public void startElement(String namespaceURI, String localName, String qName, Attributes atts) throws SAXException {
        this.thisElement = qName;
    }

    public Middle getResult() {
        return this.worker;
    }

    public void characters(char[] ch, int start, int length) throws SAXException {
        if (this.thisElement.equals("name")) {
            this.worker.name = new String(ch, start, length);
        } else if (this.thisElement.equals("age")) {
            this.worker.age = new Integer(new String(ch, start, length));
        } else if (this.thisElement.equals("salary")) {
            this.worker.salary = new Integer(new String(ch, start, length));
        }

    }

    public void endElement(String namespaceURI, String localName, String qName) throws SAXException {
        this.thisElement = "";
    }

    public void endDocument() {
        System.out.println("----> Stop parse XML...");
    }
}

