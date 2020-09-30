<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*, com.sist.xml.*"%>

<%
	// 데이터 읽어가는 과정 및 순서
		// 6. 한글을 한글로 변환(디코딩)
		request.setCharacterEncoding("UTF-8");
	
		// 1. 사용자가 보내준 검색어 읽어오기
		String fd=request.getParameter("fd");
		// 2. 주의점 : 맨 처음에는 검색어를 보내줄 수 없어서, default로 설정해야함
		if(fd==null)
		{
			fd="맛집";
		}
		// 3. 네이버로 연결해서 데이터를 읽어오는 역할의 클래스 
		NewsManager m = new NewsManager(); 
		
		// 4. 네이버로부터 데이터 수집
		List<Item> list = m.newsAllData(fd); 
		
		// 5. 화면에 출력하기

%>    

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<style type="text/css">
/* 
	<오버라이딩>
	이미 만들어진 css를 변경하는 부분
*/
.row{
	width:800px;
	margin:0px auto; /* 가운데 정렬 */
}
h1{
	text-align: center; /* 문자열을 가운데 정렬 */
	

}
.title{
	font-size: 25px;
	color: #FC6;
}

</style>

</head>
<body>
	<!-- 1. 전체 테두리 만들기 : 960px (양쪽에 약간의 여백을 가지고 있음)-->
	<div class="container">
		<!-- 2. 타이틀 만들기 -->
		<div class="row">
			<h1>네이버 실시간 뉴스 검색</h1>
			<!-- 3. 검색창 만들기 -->
			<table class="table">
				<tr>
					<td>
					<form method="post" action="news.jsp">
					<input type=text name=fd size=15 class="input-sm">
					<input type=submit value="검색" class="btn btn-sm btn-primary">
					</form>
					</td>
				</tr>
			</table>
			<!-- 4. 뉴스 데이터를 출력하는 위치 -->
			<table class="table table-striped">
				<tr>
					<td>
						<%
							for(Item i:list)
							{
						%>
								<table class="table table-hover">
									<tr>
										<td class="text-center title">
										<%=i.getTitle() %>
										</td>
									</tr>
									<tr>
										<td><%=i.getDescription() %></td>
									</tr>
									<tr>
										<td>
										<a href="<%=i.getLink()%>">
										<%=i.getDescription()%>
										</a>
										</td>
									</tr>
									
									<tr>
										<td class="text-right">
										<%=i.getAuthor() %>
										</td>
									</tr>
								</table>
						<%
							}
						%>
					</td>
				</tr>
			</table>
		</div>
	</div>
</body>
</html>