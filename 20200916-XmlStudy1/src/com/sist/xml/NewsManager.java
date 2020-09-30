/*
	오픈 API : XML 파싱해서 데이터만 넘겨준다
	JAXP : 데이터를 한 개씩 읽어서 데이터를 추출한다. 
		1_읽기 전용 : SAS
		2_읽기 전용(X) : DOM파일
	
	JAXB : 자바 클래스에 연결하는 것
	
	==> XML이 사라지고 있다. => XML을 대체하는 프로그램(Annotation)
	==> MVC구조를 만들어야지 Spring 이해하기 쉽다. 
	==> 지능형웹을 만들려면 가상메모리를 알아야함
	==> 5g가 도입되면서 속도가 빨라져서 화면 출력하는 속도가 못따라간다
	==> 그래서 도입된 것이  Vue , React다.
	
	==> 실시간이라는 단어가 들어가면 바로 ajax임
 */
package com.sist.xml;
import java.util.*;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import java.net.*;
public class NewsManager {
   public List<Item> naverNewsData(String fd)
   {
	   List<Item> list=new ArrayList<Item>();
	   try
	   {
		   String strUrl="http://newssearch.naver.com/search.naver?where=rss&query="
				        +URLEncoder.encode(fd, "UTF-8");
		   URL url=new URL(strUrl);
		   JAXBContext jb=JAXBContext.newInstance(Rss.class);
		   Unmarshaller un=jb.createUnmarshaller();
		   Rss rss=(Rss)un.unmarshal(url);
		   list=rss.getChannel().getItem();
	   }catch(Exception ex) {}
	   return list;
   }
   public static void main(String[] args) {
	  NewsManager m=new NewsManager();
	  List<Item> list=m.naverNewsData("영화");
	  for(Item i:list)
	  {
		  System.out.println(i.getTitle());
		  System.out.println(i.getDescription());
		  System.out.println(i.getAuthor());
		  System.out.println("========================");
	  }
   }
}