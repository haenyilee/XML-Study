package com.sist.xml;

import java.io.*;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

public class SAXManager {

	public static void main(String[] args) {
		try {
			// 1. SAX파서기를 생성하는 클래스 만들기
			SAXParserFactory spf=SAXParserFactory.newInstance();
			
			// 2. SAX파서기 가져오기
			SAXParser sp=spf.newSAXParser();
			
			// 3. 파일 읽기 요청하기
			XMLParser xp=new XMLParser();
			
			// 
			sp.parse(new File("C:\\webDev\\20200917-JxspStudy1\\src\\com\\sist\\dom\\sawon2.xml"), xp);
			
		} catch (Exception e) {}
	}

}
