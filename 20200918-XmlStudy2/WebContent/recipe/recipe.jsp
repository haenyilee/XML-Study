d<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*,com.sist.dao.*"%>
<%
	// 1. 사용자의 요청 내역 받기 (페이지)
	String strPage=request.getParameter("page");
	if(strPage==null)
		strPage="1";
	
	// 2. 요청을 받아서 데이터베이스에 있는 데이터를 받아오기
	int curpage=Integer.parseInt(strPage);
	// Map에 요청하기
	int rowSize=12;
	int start=(rowSize*curpage)-(rowSize-1);
	int end=rowSize*curpage;
	
	// Map에 묶어서 전송
	Map map=new HashMap();
	map.put("start",start);
	map.put("end",end);
	
	List<RecipeVO> list= RecipeDAO.recipeListData(map);
    int totalpage=RecipeDAO.recipeTotalPage();// 총페이지를 DB로 부터 받아 온다 
	// static으로 설정했으니 메모리할당할 필요가 없다.
	
	// 3. 받아온 데이터를 출력하기

%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">

<!-- css -->
<style type="text/css">
h1 {
	text-align: center
}
.pages {
	/* 가운데 정렬하기 */
	margin: 0px auto;
	text-align: center;
}
</style>
</head>
<body>
	<div class="container">
	<h1>만 개의 레시피</h1>
	<div class="row">
		<!-- 리스트 출력위치 -->
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
	 <!-- 페이지 출력위치 -->
	 <div class="row pages">
        <a href="recipe.jsp?page=<%= curpage>1?curpage-1:curpage %>" class="btn btn-sm btn-danger">이전</a>
          <%=curpage %> page / <%=totalpage %> pages
        <a href="recipe.jsp?page=<%= curpage<totalpage?curpage+1:curpage %>" class="btn btn-sm btn-primary">다음</a>
     </div>
	 </div>
</body>
</html>