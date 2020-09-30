<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
#wrap{
	width:960px;
	height:900px;
	margin:0px auto; /*여백을 통한 가운데 정렬*/
	font-size:20px;
	text-align:center;
}
#header{
	width:960px;
	height:100px;
	background-color:skyblue;
	line-height:100px; /*글자위치 지정*/
}
#nav{
	width:960px;
	height:100px;
	background-color:yellow;
	line-height:100px; /*글자위치 지정*/

}
#aside{
	width:300px;
	height:600px;
	background-color: lime;
	line-height:600px;
	float: left;

}
#section{
	width:660px;
	height:600px;
	background-color: silver;
	line-height:600px;
	float:left;
}
#footer{
	width:960px;
	height:100px;
	background-color: black;
	line-height:100px; /*글자위치 지정*/
	color:white;
	float: left;
}


</style>
</head>
<body>
<%--
HTML5 버전에서 사용하는 법 : 시멘텍 태그 => 태그를 쉽게 찾을 수 있게 만드는 태그
 <div id="wrap">
 	<header></header>
 	<nav></nav>
 	<aside></aside>
 	<section></section>
 	<footer></footer>
 </div>
 --%>
 
 <%-- HTML4버전 --%>
 <div id="wrap">
 	<div id="header">Header(회사로고)</div>
 	<div id="nav">nav(메뉴)</div>
 	<div id="aside">aside(부가정보,로그인창)</div>
 	<div id="section">section(실제 출력부분)</div>
 	<div id="footer">footer(회사정보,개인정보 방침)</div>
 </div>
 
 
</body>
</html>