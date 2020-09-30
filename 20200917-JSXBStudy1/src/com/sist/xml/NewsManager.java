package com.sist.xml;
import java.util.*;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import java.net.*;

public class NewsManager {
	public List<Item> newsAllData(String fd)
	{
		List<Item> list = new ArrayList<Item>();
		
		try {
			// 1. 웹사이트에 연결
			/*
				where=rss(XML로 전송 받는 부분)
				query=(사용자가 보내준 검색이를 받는 부분) 
					- 한글을 보내게 되면 반드시 인코딩해서 보내야함
					- 인코딩 할 때 사용하는 api : import java.net.*
					- 웹서버에 데이터 전송 시 인코딩해서 전송하는 메소드 : URLEncoder
			 */
			String strUrl="http://newssearch.naver.com/search.naver?where=rss&query="
					+ URLEncoder.encode(fd,"UTF-8");
			
			// 2. 실제 연결하는 클래스 : URL
			URL url= new URL(strUrl);
			
			// 3. 명령을 내리기
			/*
				- @XMLRootElemnet가 붙어 있는 클래스를 보내야함
			 */
			JAXBContext jb=JAXBContext.newInstance(Rss.class);
			
			// 4. 파싱을 해서 데이터를 읽어온 뒤, 자바 클래스에 값을 넣어주도록 설정 요청
			Unmarshaller un=jb.createUnmarshaller();
			
			// 5. 값을 채워주기
			Rss rss= (Rss)un.unmarshal(url);
			list=rss.getChannel().getItem();
			
			
			
			
			
		} catch (Exception e) {}
		
		return list;
	}

}
