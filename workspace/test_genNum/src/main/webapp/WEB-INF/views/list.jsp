<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<style>
table {
	margin: 10px auto;
	border-collapse: collapse;
}

div {
	text-align: center;
}

table tr td {
	border: 1px solid black;
	text-align: center;
	font-size: 12px;
	padding: 5px;
}
th {
	border: 1px solid black;
	text-align: center;
	font-size: 14px;
	padding: 5px;}
</style>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<div>
	<table>
		<tr>
			<th>#번호</th>
			<th>Data</th>
			<th>Regdate</th>
		</tr>
		<c:forEach items="${list }" var="list">
			<tr>
				<td><c:out value="${list.sn }" /></td>
				<td><c:out value="${list.data }" /></td>
				<td><fmt:formatDate pattern="yyyy-MM-dd"
						value="${list.regdate }" /></td>
			</tr>
		</c:forEach>
	</table>
	</div>
	<div><a href="/">등록 페이지로</a></div>
</body>
</html>