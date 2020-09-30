<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*,com.sist.dao.*"%>
<%
	// 사용자가 보내준 데이터 받기 => chef명 받기
	//	?chef=값 ==> 사용자가 보낸 모든 데이터는 request 안에 저장
	String chef=request.getParameter("chef");
	
	// SQL문장을 작성하기 (chef-mapper.xml을 통해서)
	// 쉐프가 만든 레시피 DAO를 통해서 데이터 얻어오기
	
	// DAO에서 데이터베이스 연결(오라클)
	List<RecipeVO> list=RecipeDAO.chefMakeRecipeData(chef);
	
	// DAO로 들어온 데이터를 화면에 출력하기 : <body>
	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">

</head>
<body>
	<div class="container">
		<h1 class="text-center"><%=chef %>님의 레시피</h1>
		<div class="row">
		<%
			for(RecipeVO vo:list)
			{
		%>
				<div class="col-md-3">
			      <div class="thumbnail">
			        <a href=# target="_blank">
			          <img src="<%=vo.getPoster() %>" alt="Lights" style="width:100%">
			          <div class="caption">
			            <p><%=vo.getTitle() %></p>
			            <p><%=vo.getChef() %></p>
			          </div>
			        </a>
			      </div>
			    </div>
		<%
			}
		%>
		</div>
	</div>

</body>
</html>