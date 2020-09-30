package com.sist.xml;
/*
	<JAXB>
	1. xml을 자바 클래스로 변환하는 것을 '언마샬'이라고 함
	2. java class를 xml로 변환하는 것을 '마샬'이라고 함
	
	news => naver
	
	
	태그 밑에 태그가 있으면 클래스명
	태그 밑에 데이터가 있으면 변수명
	
	<rss> => 클래스명
		<channel> => 클래스명
			<item>
				<title></title>  => 변수명
				<description></description>
				<author></author>
			</item>
			<item>
				<title>aaa</title>
				<description>aaa</description>
				<author>aaa</author>
				<link>aaa</link>
			</item>
			
			
			<member> => class Member
				<list> => class List
						  {
						  	private String name
						  	private String sex						  
						  }
					<name>aaa</name>
					<sex>aaa</sex>
				</list>
			</member>
 */

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Rss {
	
	// Rss에는 channel 태그가 있다....
	
	private Channel channel = new Channel();

	public Channel getChannel() {
		return channel;
	}

	public void setChannel(Channel channel) {
		this.channel = channel;
	}
	

}
