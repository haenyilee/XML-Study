package com.sist.dao;

/*
 <XML알아야 하는 것들>
	1. XML 태그 제작 방법
	2. XML 문법
	3. 자바에서 XML 데이터를 읽어오는 파싱방법
		1) DOM (데이터베이스 대체) : 수정, 추가, 삭제 , 검색 가능
		2) SAX : 검색만 가능
		3) JAXB : 자바클래스와 XML을 연결
 */

// 마이바티스에서는 변수명과 컬럼명이 반드시 일치해야함!!!
// DESC 테이블명을 통해서 컬럼명 꼭 확인하기
public class MusicVO {
	private int mno;
	private String title;
	private String singer;
	private String album;
	private String poster;
	private String state;
	private int idcrement;
	private String key;
	public int getMno() {
		return mno;
	}
	public void setMno(int mno) {
		this.mno = mno;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	public String getPoster() {
		return poster;
	}
	public void setPoster(String poster) {
		this.poster = poster;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getIdcrement() {
		return idcrement;
	}
	public void setIdcrement(int idcrement) {
		this.idcrement = idcrement;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
}


