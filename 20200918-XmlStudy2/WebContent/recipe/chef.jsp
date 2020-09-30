<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*,com.sist.dao.*"%>
    
<%
	/* 
		1. 사용자가 보내준 데이터 받기
			- 사용자가 보내준 모든 데이터는 request안에 들어가 있다.
			- 사용자가 요청할때마다 톰캣이 request에 모아서 넘겨준다. 
			- 이 값을 가져오려면, getParameter()
		2. 사용자로부터 받은 데이터를 DAO에 넘겨준다
		3. DAO가 요청한 데이터를 보여준다
		4. DAO로부터 받은 데이터 화면에 출력한다.
			- MV방식은 HTML과 JAVA로 나눠서 처리하는 것이다.
			- 이때, HTML과 JAVA를 연결하는 것이 Controller이며 서블릿으로 만든다.
			- 이때, 자바 하나에서 데이터까지 접근하려니 복잡해서 JAVA(DAO)와 오라클(XML)을 나눠서 처리해준다. 
	*/
	
	// 사용자가 보내주는 값 => page
	String strPage=request.getParameter("page");
	// 첫 페이지
	if(strPage==null)
		strPage="1";
	
	// 현재 실행중인 페이지 번호
	int curpage=Integer.parseInt(strPage);
	
	// 현재 실행 중인 페이지의 데이터를 DAO에서 받아오기
	// DAO에 어디부터 어디까지 데이터를 보내달라고 요청
	int rowSize=20; // 한 페이지에 데이터를 20개씩 출력하기
	int start=(rowSize*curpage)-(rowSize-1);
	int end=rowSize*curpage;
	
	// start와 end를 Map으로 저장하기
	Map map=new HashMap();
	map.put("start",start);
	map.put("end",end);
	
	// DAO로 전송
	// 결과값을 받아오기
	List<ChefVO> list = RecipeDAO.chefListData(map);
	int totalpage = RecipeDAO.chefTotalPage();
	
	// 받은 데이터를 출력하기 : <body>에서
	
%><!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<style type="text/css">
.row {
   margin: 0px auto;
   width:900px;
}
h1 {
    text-align: center;
}
</style>
</head>
<body>
  <div class="container">
    <h1>쉐프 목록</h1>
    <div class="row">
      <table class="table">
       <tr>
        <td>
          <%-- 데이터가 출력할 위치 --%>
          <%
             for(ChefVO vo:list)
             {
          %>
                <table class="table table-striped">
                 <tr bgcolor="white">
                   <td width=20% rowspan="2" class="text-center" bgcolor="white">
                     <img src="<%=vo.getPoster() %>" width=70 height=70 class="img-circle">
                   </td>
                   <td colspan=4 width=80% bgcolor="white"><font color=orange>
                   <a href="chef_list.jsp?chef=<%=vo.getChef()%>"><%=vo.getChef() %></a>
                   </font></td>
                 </tr>
                 <tr>
                   <td><img src="chef1.PNG"><%=vo.getMem_cont1() %></td>
                   <td><img src="chef2.PNG"><%=vo.getMem_cont3() %></td>
                   <td><img src="chef3.PNG"><%=vo.getMem_cont7() %></td>
                   <td><img src="chef4.PNG"><%=vo.getMem_cont2() %></td>
                 </tr>
                </table>
          <%
             }
          %>
        </td>
       </tr>
      </table>
      <table class="table">
      	<tr>
      		<td class="text-center">
      			<a href="chef.jsp?page=<%=curpage>1?curpage-1:curpage %>" class="btn btn-sm btn-primary">이전</a>
      			 <%=curpage %> page / <%=totalpage %> pages
             <a href="chef.jsp?page=<%=curpage<totalpage?curpage+1:curpage %>" class="btn btn-sm btn-warning">다음</a>
      		</td>
      	</tr>      
      </table>
    </div>
  </div>
</body>
</html>