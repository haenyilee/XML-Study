package com.sist.dao;
import java.util.*;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.lf5.util.Resource;

import java.io.*;
/*
	클래스를 제작하면
	프로그램을 짜면 딱 한가지 밖에 없다
	그게 바로 데이터를 조작하는 기능임
	데이터를 조작하려면 데이터를 저장해야 하는데 조작한 데이터를 보여주는 내용이 프로그램이다.
	
	데이터를 저장한 다음에 초기값을 부여해야 하는데 이때 3가지 방법이 있다. 
	1. 명시적 초기화
		private int a=10;
	2. 초기화 블록
		1) 인스턴스 블록
		2) static 블록
	3. 생성자 : 자동 인식되지 않고, 호출해야지만 변수가 초기화된다.
		호출방법 : new 생성자()
	
	
 */



public class MusicDAO {
	private static SqlSessionFactory ssf;
	// ssf는 xml을 읽어와서 데이터를 저장하는 역할을 수행한다.
	/* 
		오라클을 읽어오는 것을 JDBC라고 하고, 
		XML을 읽어오는 것을 파싱이라고 한다.
		html을 읽어오는 것을 크롤링이라고 한다.
		
		Jsoup은 html의 파서
	*/
	
	static {
		
		// 자동 초기화할 예정임
		try {
			Reader reader=Resources.getResourceAsReader("config.xml");
			// XML파싱
			ssf= new SqlSessionFactoryBuilder().build(reader);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	public static List<MusicVO> musicAllData()
	{
		// music.xml의 <select>에 나오는 ID값을 아래 변수에 넣어줘야 한다.
		return ssf.openSession().selectList("musicAllData");
	}
}
