package com.sist.dao;
/* 자바에서는 데이터를 보호할 목적으로 캡슐화를 함
	- 캡슐화 : 변수는 은닉화를 해서 메소드를 통해서만 접근할 수 있게 하는 방법이다.
	- 은닉화 방법 : private 제어자 사용
*/

/*
	마이바티스나 스프링을 사용할 때, 
	변수를 public으로 잡을 수도 있는데
	그래도 값을 설정하거나 값을 얻어오는 경우
	setXxx(), getXxx()를 만들지 않으면 
	값을 얻어오지 못한다.
	이게 바로 Secure코딩(보안)의 기본이다.	
 */

/*
	<재사용기법>
	1. 포함클래스
	2. 상속(속도문제가 있어서 잘 쓰지 않음)
	3. 재사용을 하려면 프로그래머들이 만든 클래스나 변수가 필요한데 
		이 변수를 저장하는 공간이 바로 XML이다.
	4. 프로그래머가 저장하지 않고 직접 처리하는 부분도 있다.
		이것을 바로 어노테이션이라고 한다. 
 */
public class RecipeVO {
	private int no;
	private String title;
	private String poster;
	private String chef;
	private String link;
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getPoster() {
		return poster;
	}
	public void setPoster(String poster) {
		this.poster = poster;
	}
	public String getChef() {
		return chef;
	}
	public void setChef(String chef) {
		this.chef = chef;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}

}
