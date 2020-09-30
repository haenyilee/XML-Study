<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body>
	<!-- 망고플레이트와 만개의 레시피가 오픈소스인 부트스트랩으로 만들어져 있음 -->
	<div class="container">
		<div class="row">
		<!-- <input 태그> -->
		 <table class="table table-bordered">
		 	<tr>
		 		<th class="text-right danger" width=20%>이름</th>
		 		<td width=80%>
		 			<input type=text size=15 class="input-sm"> <!-- lg-sm-xs  -->
		 		</td>
		 	</tr>	
		 		
		 	<tr>
		 		<th class="text-right danger" width=20%>부서명</th>
		 		<td width=80%>
		 			<select class="input-sm">
		 				<option>개발부</option>
		 				<option>영업부</option>
		 				<option>총무부</option>
		 			</select>
		 		</td>
		 	</tr>
		 	<tr>
		 		<td colspan="2" class="text-center">
		 			<!-- 
		 			** 버튼은 클래스로 되어 있다는 것 주의 **
		 				<버튼 색상 종류>
		 				1. btn-primary : 파랑색
		 				2. btn-success : 녹색
		 				3. btn-warning : 주황색
		 				4. btn-danger : 빨간색
		 				5. btn-info : 하늘색
		 				6. btn-active : 회색
		 			
		 				<버튼 크기 종류>
		 				1. btn-sm
		 				2. btn-lg
		 				3. btn-xs
		 			 -->
		 			<input type=button class="btn btn-sm btn-primary" value="전송">
		 			<input type=button class="btn btn-sm btn-success" value="취소">
		 		</td>
		 	</tr>	 
		 </table>		
		</div>
	</div>
</body>
</html>