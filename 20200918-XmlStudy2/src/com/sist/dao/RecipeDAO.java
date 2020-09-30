package com.sist.dao;

import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class RecipeDAO {
	private static SqlSessionFactory ssf;
	
	// 자동처리 => 변수에 초기화
	static
	{
		try {
			// 1. XML 파일 읽기 ==> 파일명은 대소문자 유의해서 작성
			Reader reader=Resources.getResourceAsReader("Config.xml");
			
			// 2. 파싱 (XML에 등록된 데이터 읽기) ==> build(xml 파일설정하면 됨)
			
			// 3. 파싱한 결과를 ssf에 첨부하기 ==> getConnection() , disConnection()
			// SAX라는 프로그램 이용해서 등록된 데이터를 읽어오기 시작할 것임
			ssf=new SqlSessionFactoryBuilder().build(reader);
			
			// 4. Map으로 저장해놓고 사용자가 요청시마다 처리하기 => id요청하면, SQL문장 실행
		} catch (Exception e) {
			e.printStackTrace(); // 예외처리를 하지 않으면 에러 처리가 어려움			
		}
	}
	
	// 활용하기
	/*
		start , end => Map
	 */
	public static List<RecipeVO> recipeListData(Map map)
	{
		List<RecipeVO> list=new ArrayList<RecipeVO>();
		SqlSession session=null;
		// 에러처리
		try {
			session = ssf.openSession();
			// Connection이 미리 만들어져 있기 때문에, 만들어진 Connection객체 주소 가져오기
			list=session.selectList("recipeListData",map);
			// recipeListData : mapper에서의 id
			// map : mapper에서의 #{}에 값을 채우는 것
		} catch (Exception e) {
			System.out.println(e.getMessage());			
		} finally {
			if(session!=null)
				session.close();
		}
		
		return list;
	}
	
	// recipe 총 페이지 구하기
	public static int recipeTotalPage()
	{
		int total=0;
		SqlSession session =null;
		try {
			// 미리 생성해둔 Connection 객체 가져오기
			session=ssf.openSession();
			
			// 데이터 Record,Row가 한 개일때는 selectOne이지만 여러개일때는 selectList
			total=session.selectOne("recipeTotalPage");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(session!=null)
				session.close();
		}
		return total;
	}
	
	// chef목록 얻어오기
	public static List<ChefVO> chefListData(Map map)
	{
		// map에는 시작 위치, 끝위치가 들어감
		List<ChefVO> list=new ArrayList<ChefVO>();
		
		SqlSession session=null;
		try {
			// 연결할 수 있는 객체 얻어오기
			session = ssf.openSession();
			
			// SQL문장 보내고 결과값을 받아오기
			list=session.selectList("chefListData",map);
			
			// 더 간단히게 만드는 법 : 스프링 사용하기(열기, 닫기가 이미 만들어져 있음 : Annotation)
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 닫기 ==> 반환 (재사용이 가능하게 함)
			if(session!=null)
				session.close();
		}
		return list;
	}
	
	// Chef 총 페이지 구하기
		public static int chefTotalPage()
		{
			int total=0;
			SqlSession session =null;
			try {
				// 미리 생성해둔 Connection 객체 가져오기
				session=ssf.openSession();
				
				// 데이터 Record,Row가 한 개일때는 selectOne이지만 여러개일때는 selectList
				total=session.selectOne("chefTotalPage");
				
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				if(session!=null)
					session.close();
			}
			return total;
		}
		
	// 쉐프의 레시피를 20만 가지고 오기
	public static List<RecipeVO> chefMakeRecipeData(String chef)
	{
		List<RecipeVO> list = new ArrayList<RecipeVO>();
		SqlSession session =null;
		try {
			// 연결 시작 : 미리 생성해둔 Connection 객체 가져오기
			session=ssf.openSession();
			list=session.selectList("chefMakeRecipeData",chef);
			
			// 
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(session!=null)
				session.close();
		}
		return list;
	}

}
