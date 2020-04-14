<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<style>
table { margin: 10px auto}
div { text-align: center;}
table tr td{
	border: 1px solid black;
	text-align: center;
	font-size: 20px;
	padding: 10px;
	border-collapse: collapse;
}
</style>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<table>
		<thead>
			<tr>
				<th>#번호</th>
				<th>Data</th>
				<th>regdate</th>
			</tr>
		</thead>
		<c:forEach items="${list }" var="list">
			<tr>
				<td><c:out value="${list.sn }" /></td>
				<td><c:out value="${list.data }" /></td>
				<td><fmt:formatDate pattern="yyyy-MM-dd"
						value="${list.regdate }" /></td>
			</tr>
		</c:forEach>


	</table>
</body>
</html>