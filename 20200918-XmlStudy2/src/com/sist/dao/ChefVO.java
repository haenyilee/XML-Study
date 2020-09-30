package com.sist.dao;
/*
	마이바티스를 사용하는 경우 반드시 변수명과 컬럼명이 일치해야 한다.
	만일, 불일치하면 값을 받아올 수 없다.
	
	- 값을 받는 방법 중에 xml코드에서 매칭하는 과정이 있는데 
		<result property="변수명" column="컬럼명">
 */


public class ChefVO {
	private String poster;
	private String chef;
	private String mem_cont1;
	private String mem_cont3;
	private String mem_cont7;
	private String mem_cont2;
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
	public String getMem_cont1() {
		return mem_cont1;
	}
	public void setMem_cont1(String mem_cont1) {
		this.mem_cont1 = mem_cont1;
	}
	public String getMem_cont3() {
		return mem_cont3;
	}
	public void setMem_cont3(String mem_cont3) {
		this.mem_cont3 = mem_cont3;
	}
	public String getMem_cont7() {
		return mem_cont7;
	}
	public void setMem_cont7(String mem_cont7) {
		this.mem_cont7 = mem_cont7;
	}
	public String getMem_cont2() {
		return mem_cont2;
	}
	public void setMem_cont2(String mem_cont2) {
		this.mem_cont2 = mem_cont2;
	}

}
