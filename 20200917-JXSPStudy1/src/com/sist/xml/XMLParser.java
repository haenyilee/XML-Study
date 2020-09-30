package com.sist.xml;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class XMLParser extends DefaultHandler{
	
	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		// System.out.println(qName+"태그 읽기 시작");
		if(qName.equals("sawon"))
		{
			String sabun=attributes.getValue("sabun");
			String name=attributes.getValue("name");
			String dept=attributes.getValue("dept");
			System.out.println(sabun+" "+name+" " +dept);			
		}
		
		// XML읽을 때, 태그명과 속성명이 일치해야 함!
	}

	@Override
	public void startDocument() throws SAXException {
		System.out.println("XML문서가 시작!!");
	}

	@Override
	public void endDocument() throws SAXException {
		System.out.println("XML 문서 읽기 종료!!");
	}


	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		System.out.println(qName+"태그 읽기 종료");
	}

	
}
