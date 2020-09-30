<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<style type="text/css">
.container {
	border: 1px solid black;
	height: 760px;
}
.row{
 	/* border: 1px solid red;
	height: 350px;  */
	/* 가운데 정렬!!! */
	margin:0px auto;
	width:700px;
}
h1 {
	/* 문자를 가운데 정렬할 때 사용하는 것 : text-align */
	text-align: center;
	font-family: 맑은 고딕;
}



</style>



</head>
<body>
<%-- 

<table과 input>
1. row 는 한 줄을 만들때 사용

2. table의 종류 : 
	1) table-hover : 테두리 없이 마우스 가져댔을때 색상 변화
	2) table-bordered
	3) table-striped

 --%>

	<div class="container">
		<div class="row">
			<h1>사원목록</h1>
			<!-- 
				<table의 종류>
				1. table-hover : 테두리 없이 마우스 가져댔을때 색상 변화
				2. table-bordered
				3. table-striped
				
			 -->
			<table class="table table-striped">
			
				<!-- 
					<색상의 종류>
					1. danger : 분홍~빨강
					2. success: 연녹색
					3. warning: 주황색
					4. info: 하늘색
					5. default: 회색
					
				 -->
				<tr class="info">
					<!-- 가운데 정렬 : text-center -->
					<th class="text-center">사번</th>
					<th class="text-center">이름</th>
					<th class="text-center">직위</th>
					<th class="text-center">근무지</th>
					<th class="text-center">부서명</th>
				</tr>
				
				<tr>
					<td class="text-center">1</td>
					<td class="text-center">홍길동</td>
					<td class="text-center">대리</td>
					<td class="text-center">서울</td>
					<td class="text-center">개발부</td>
				</tr>
				
				<tr>
					<td class="text-center">2</td>
					<td class="text-center">홍길동</td>
					<td class="text-center">대리</td>
					<td class="text-center">서울</td>
					<td class="text-center">개발부</td>
				</tr>
				
				<tr>
					<td class="text-center">3</td>
					<td class="text-center">홍길동</td>
					<td class="text-center">대리</td>
					<td class="text-center">서울</td>
					<td class="text-center">개발부</td>
				</tr>
			</table>
		</div>
		<div class="row">
		
		</div>
	
	</div>

</body>
</html>