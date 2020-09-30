package com.sist.xml;

import javax.xml.bind.annotation.XmlRootElement;

/*
		XML 	JSON 	CSV
		
<rss>							<!--Rss클래스-->
	<channel>					<!--channel클래스-->
		<item>					<!--item클래스-->
			<title>aaa</title>	<!--title변수-->
			<img>aaa</img>		<!--img변수-->
			<link>aaa</link>	<!--link변수-->
		</item>
	</channel>
</rss>
	
	
 */
@XmlRootElement
public class Rss {
	private Channel channel= new Channel();

	public Channel getChannel() {
		return channel;
	}

	public void setChannel(Channel channel) {
		this.channel = channel;
	}
	

}
