package com.sist.json;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

//http://www.kobis.or.kr/kobis/business/main/searchMainDailyBoxOffice.do


import java.util.*;
public class JSONManager {
	
	public List<MovieVO> movieListData(int no)
	{
		List<MovieVO> list=new ArrayList<MovieVO>();
		try 
		{
			String site="";
			if(no==1)
			{
				site="http://www.kobis.or.kr/kobis/business/main/searchMainDailyBoxOffice.do";
			}
			else if(no==2)
			{
				site="http://www.kobis.or.kr/kobis/business/main/searchMainRealTicket.do";
			}
			else if(no==3)
			{
				site="http://www.kobis.or.kr/kobis/business/main/searchMainDailySeatTicket.do";
			}
			else if(no==4)
			{
				site="http://www.kobis.or.kr/kobis/business/main/searchMainOnlineDailyBoxOffice.do";
			}
			
			// 연결 시도
			Document doc=Jsoup.connect(site).get();
			Element json=doc.selectFirst("body");
			// System.out.println(json.text());
			
			// JSON 파싱 시작
			JSONParser jp=new JSONParser();
			
			// 데이터를 받는다 => [{},{},{},{}...]
			// 1) [] 형태로 되어 있으면, JSONArray로 받아야 한다.
			// 2) {} 형태로 되어 있으면, JSONObject로 받는다.
			JSONArray arr = (JSONArray)jp.parse(json.text());
			//System.out.println(arr.toJSONString());
			
			for(int i=0;i<arr.size();i++)
			{
				// {}는 JSONObject로 받아와야 한다.
				JSONObject obj=(JSONObject)arr.get(i);
				// {}에 10개 출력
				//System.out.println(obj.toJSONString());
				
				// 데이터를 vo에 저장
				MovieVO vo=new MovieVO();
				vo.setMovieCd((String)obj.get("movieCd"));
				vo.setMovieNm((String)obj.get("movieNm"));
				vo.setMovieNmEn((String)obj.get("movieNmEn"));
				vo.setDirector((String)obj.get("director"));
				vo.setWatchGradeNm((String)obj.get("watchGradeNm"));
				vo.setRank((long)obj.get("rank"));
				vo.setGenre((String)obj.get("genre"));
				vo.setSynop((String)obj.get("synop"));
				vo.setThumbUrl((String)obj.get("thumbUrl"));
				
				//System.out.println("영화번호:"+vo.getMovieCd());
				//System.out.println("영화명:"+vo.getMovieNm());
				//System.out.println("영화명(영문):"+vo.getMovieNmEn());
				
				list.add(vo);
			}
			
		} catch (Exception e) {}
		
		return list;
	}
	
	
	public static void main(String[] args) {
		
		JSONManager m = new JSONManager();
		m.movieListData(1);
		
	/*
	try {
		// 
		String url="http://www.kobis.or.kr/kobis/business/main/searchMainDailyBoxOffice.do";
		Document doc=Jsoup.connect(url).get();
		// System.out.println(doc.toString());
		
		// body안에 있는 json부분만 읽어오기
		Element json=doc.selectFirst("body");
		//System.out.println(json.text());
		String movie_data=json.text();
		JSONParser jp = new JSONParser();
		JSONArray arr=(JSONArray)jp.parse(movie_data);
		//System.out.println(arr.toJSONString());
		for(int i=0;i<arr.size();i++)
		{
			JSONObject obj=(JSONObject)arr.get(i);
			//System.out.println(obj.toJSONString());
			
			long rank=(long)obj.get("rank");
			String movie_name=(String)obj.get("movieNm");
			String genre=(String)obj.get("genre");
			String grade=(String)obj.get("watchGradeNm");
			String director=(String)obj.get("director");
			
			System.out.println(rank);
			System.out.println(movie_name);
			System.out.println(genre);
			System.out.println(grade);
			System.out.println(director);
			System.out.println("========================");
		}
		
		/*
		[	==> JSONArray
			{	==> JSONObjec
				
			}
		]
		*/
	/*
	} catch (Exception e) {}	
	
	*/
	}
	
}
