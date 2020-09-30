package com.sist.xml;
import java.io.*;
import javax.xml.parsers.*;
import org.w3c.dom.*;





public class DomManager {

	public static void main(String[] args) {
		try {
			// 1. DOM 파서기 생성
			// 1) 한번만 생성하는 싱글턴 패턴임 ==> newInstance()가 나오면 다 싱글턴 패턴임
			DocumentBuilderFactory dbf=DocumentBuilderFactory.newInstance();
			
			// 2) 파서기 => XML을 읽어서 트리 형태로 저장해주는 역할을 함
			DocumentBuilder db=dbf.newDocumentBuilder();
			
			// 3. XML을 파서한 내용을 번역해서 메모리게 저장하기
			// (1) 저장공간 이름 : Document
			Document doc=db.parse(new File("C:\\webDev\\20200917-JxspStudy1\\src\\com\\sist\\dom\\sawon.xml"));
			
			// (2) 최상위 태그(즉, 테이블명) 기억해서 가져오기
			Element root=doc.getDocumentElement();
			System.out.println(root.getTagName()); // 결과값 : sawon
			
			// (3) 같은 태그를 묶어서 반복문을 돌려서 처리하기
			// (3)-1. <list>에 묶인 태그 갯수 확인
			NodeList list=root.getElementsByTagName("list");
			System.out.println(list.getLength()); // 결과값 : 3 => 루프 3바퀴라는 뜻
			
			// (3)-2. 반복문 돌리기
			// *주의* 존재하지 않는 태그명이나 속성을 사용하면 error발생함
			for(int i=0;i<list.getLength();i++)
			{
				list=root.getElementsByTagName("sabun");
				String sabun=list.item(i).getFirstChild().getNodeValue();
				list=root.getElementsByTagName("name");
				String name=list.item(i).getFirstChild().getNodeValue();
				list=root.getElementsByTagName("dept");
				String dept=list.item(i).getFirstChild().getNodeValue();
				list=root.getElementsByTagName("job");
				String job=list.item(i).getFirstChild().getNodeValue();
				list=root.getElementsByTagName("sal");
				String sal=list.item(i).getFirstChild().getNodeValue();
				System.out.println(sabun+" "+name+" "+dept+" "+job+" "+sal);
			}
			
			
			
		} catch (Exception e) {}

	}

}
