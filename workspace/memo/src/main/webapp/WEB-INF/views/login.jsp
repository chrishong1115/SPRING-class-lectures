<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<div class="jumbotron" style="padding-top: 20px;">
		<form method="post" action="loginAction.jsp">
			<h3 style="text-align: center;">로그인화면</h3>
			<div class="form-group" style="text-align: center; padding-bottom:20px">
				<input type="text" class="form-control" placeholder="아이디"
					name="userID" maxlength="20">
			</div>
			<div class="form-group" style="text-align: center; padding-bottom:20px">
				<input type="password" class="form-control" placeholder="비밀번호"
					name="userPassword" maxlength="20">
			</div>
			<div align="center">
				<input type="submit" class="btn btn-primary" value="로그인"> 
			</div>
		</form>
	</div>
</body>
</html>