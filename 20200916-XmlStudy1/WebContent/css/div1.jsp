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
	margin: 0px auto; /* 가운데 정렬 */
}
#box1{
	width:30%;
	height:700px;
	background-color: pink;
	float: left;
}
#box2{
	width:70%;
	height:350px;
	background-color: lime;
	float: left;
}
#box3{
	width:70%;
	height:350px;
	background-color: skyblue;
	float: left;
}


</style>
</head>
<body>
<!-- 
	<수업 전 준비사항>
	1. xml문서 확인
	http://newssearch.naver.com/search.naver?where=rss&query=%EC%98%81%ED%99%94
									   =====
									   확장자가 변경되었다는 것은 MVC구조라는 뜻
	
	2. h
	http://mvnrepository.com
	1. jaxb => jar파일 다운로드
	2. simple-json => jar.파일 다운로드

 -->
 <div id="wrap">
   <div id="box1"></div>
   <div id="box2"></div>
   <div id="box3"></div>
 </div>
</body>
</html>