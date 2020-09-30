package com.sist.xml;
import java.io.*;
import javax.xml.parsers.*;
import org.w3c.dom.*;

public class DomManager2 {
	
	public static void main(String[] args) {
		try {
			
			// 1. 파서기를 생성 
			// * 파서기의 역할 : xml데이터를 메모리에 트리형태로 저장하는 장치
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			
			// 2. 파서기를 이용하기
			DocumentBuilder db = dbf.newDocumentBuilder();
			
			// 3. XML을 읽어서 트리형태로 메모리에 저장하기
			Document doc=db.parse(new File("C:\\webDev\\20200917-JxspStudy1\\src\\com\\sist\\dom\\sawon2.xml"));
			
			// 4. 최상위 태그(XMLRootElement)가져오기
			// * 최상위태그=테이블명 *
			Element root=doc.getDocumentElement();
			System.out.println(root.getTagName());
			
			// 5. sawon태그를 묶어서 처리하기
			NodeList list=root.getElementsByTagName("sawon");
			System.out.println(list.getLength());
			
			// 6. for문 돌려서 속성값들 가져오기
			for(int i=0;i<list.getLength();i++)
			{
				// (1) 사원태그를 한 개씩 읽어오기
				Element sawon=(Element)list.item(i);
				String sabun=sawon.getAttribute("sabun");
				String name=sawon.getAttribute("name");
				String dept=sawon.getAttribute("dept");
				
				System.out.println(sabun+" "+name+" "+dept );
				
			}
			
		} catch (Exception e) {}
	}
	
}
