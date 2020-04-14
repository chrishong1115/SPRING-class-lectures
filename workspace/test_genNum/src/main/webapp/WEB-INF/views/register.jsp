<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ page session="false"%>
<html>
<head>
<style>
table {
	margin: 10px auto
}

div {
	text-align: center;
}

table tr td {
	text-align: center;
	font-size: 20px;
}

button {
	font-size: 20px;
	width: 40px; height:40px; 
	
}
</style>
<title>Home</title>
</head>
<body>

	<div class="container">
		<form role="form" action="/register" method="post">
			<table>
				<tr>
					<td><button type="submit" name="data" value=1>1</button></td>
					<td><button type="submit" name="data" value=2>2</button></td>
					<td><button type="submit" name="data" value=3>3</button></td>
				</tr>
				<tr>
					<td><button type="submit" name="data" value=4>4</button></td>
					<td><button type="submit" name="data" value=5>5</button></td>
					<td><button type="submit" name="data" value=6>6</button></td>
				</tr>
				<tr>
					<td><button type="submit" name="data" value=7>7</button></td>
					<td><button type="submit" name="data" value=8>8</button></td>
					<td><button type="submit" name="data" value=9>9</button></td>
				</tr>
				<tr>
					<td colspan="3"><button type="submit" name="data" value=0>0</button></td>
				</tr>
			</table>
		</form>
	</div>
	<div>
		<a href="list">get list</a>
	</div>
	
</body>
</html>
