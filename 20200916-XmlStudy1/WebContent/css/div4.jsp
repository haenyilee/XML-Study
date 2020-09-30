<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<style type="text/css">

/* 
	
	twitter에서 만든 반응형 웹
	즉, css라이브러리임
	외부CSS가 지정되어 있는데 수정하려면, 내부 CSS를 지정해주면 된다.
	1) container: 960px을 차지해서 양쪽에 여백을 가져온다. 
	2) container-fluid : full-screen화면이다.

 */
.container{
	border: 1px solid black;
	height: 800px;
}
/* .container-fluid{
	border: 1px solid black;
	height: 800px;
} */

/* 
	col-sm-(숫자) : sm lm mm
	960/12 ==> col-sm-1 값


 */
.col-sm-4{
	border: 1px solid red;
	height: 350px;
}

</style>

</head>
<body>
	<div class="container"> <%-- --%>
		<div class="col-sm-4"> <%--float:left inline 속성을 가지고 있음 --%>
		
		</div>
		<div class="col-sm-4">
		
		</div>
		<div class="col-sm-4">
		
		</div>
	</div>
	
<!-- 	<div class="container-fluid">
		<div class="col-sm-3>">
		
		
		</div>
		<div class="col-sm-3>">
		
		
		</div>
		<div class="col-sm-3>">
		
		
		</div>
		<div class="col-sm-3>">
		
		
		</div>
	
	</div> -->


</body>
</html>