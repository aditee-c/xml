package com.zensar.xml.handlers;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class BookXmlHandler extends DefaultHandler {

	@Override
	public void characters(char[] arg0, int arg1, int arg2) throws SAXException {
		
		System.out.println("characters is called");
		for(int i= arg1;i<arg1+arg2;i++) {
			System.out.print(arg0[i]);
		}
		System.out.println();
	}

	@Override
	public void endDocument() throws SAXException {
		
		System.out.println("End document is called");
	}

	@Override
	public void endElement(String arg0, String arg1, String arg2) throws SAXException {
		
		System.out.println("end element is called  "+ arg2);
	
	}

	@Override
	public void startDocument() throws SAXException {
		
		System.out.println("startdoc is called");
	}

	@Override
	public void startElement(String arg0, String arg1, String arg2, Attributes arg3) throws SAXException {
		
	System.out.println("startelement is called  " + arg2);
	}
	
}
