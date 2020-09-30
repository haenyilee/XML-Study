<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*, com.sist.json.*"%>

<%
	// 데이터 읽기
	JSONManager m = new JSONManager();

	// 사용자가 요청한 영화정보 보여주기 시작 => 해당 번호 보내주기
	String no = request.getParameter("no");
	
	// 첫페이지 디폴트값으로 설정해주기
	if(no==null)
		no="1";
	
	// 해당 번호의 데이터 받아오기
	List<MovieVO> list = m.movieListData(Integer.parseInt(no));
	
	// 이미지 링크 만들어주기
	// http://www.kobis.or.kr/kobis/business/
	

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
</style>
</head>
<body>
	<div class="container">
		<h1>영화목록</h1>
		<div class="row">
		<!-- 링크 걸기 -->
		<a href="movie.jsp?no=1" class="btn btn-lg btn-primary">일일 박스오피스</a>
		<a href="movie.jsp?no=2" class="btn btn-lg btn-success">실시간 예매율</a>
		<a href="movie.jsp?no=3" class="btn btn-lg btn-info">좌석 점유율</a>
		<a href="movie.jsp?no=4" class="btn btn-lg btn-danger">온라인 상영관</a>
		</div>
		<div class="row">
			<div class="col-sm-6">
			
			</div>
			<div class="col-sm-6">
				<table class="table table-striped">
					<tr>
						<th class="text-center">순위</th>
						<th class="text-center"></th>
						<th class="text-center">영화명</th>
						<th class="text-center">감독</th>
					</tr>
					<%
						for(MovieVO vo: list)
						{
					%>
							<tr>
								<td class="text-center"><%=vo.getRank() %></td>
								<td class="text-center">
								<img src="http://www.kobis.or.kr<%=vo.getThumbUrl() %>" width=35 height=35>
								</td>
								<td><%=vo.getMovieNm() %></td>
								<td class="text-center"><%=vo.getDirector() %></td>
							</tr>
					<%
						}
					%>
				</table>
			</div>
		</div>
	</div>
</body>
</html>