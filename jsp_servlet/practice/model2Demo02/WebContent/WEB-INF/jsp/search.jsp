<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>search.jsp</title>
<style>
table {
	border: 1px dotted;
	width: 100%;
	border-collapse: separate;
	border-spacing: 2px;
}

tbody {
	vertical-align: middle;
}

td {
	border: 1px solid;
}

#wrap {
	width: 500px;
	margin: auto;
}
</style>
</head>
<body>
	<div id="wrap">
		<table>
			<tbody>
				<tr>
					<td colspan="5">������Ʈ</td>
				</tr>
				<c:forEach var="e" items="${list2}">
					<tr>
						<td>${e.gobun}</td>
						<td>${e.goname}</td>
						<td>${e.gotel}</td>
						<td>${e.gojumin}</td>
						<td>${e.godam}</td>
					</tr>
				</c:forEach>
				<tr>
					<td colspan="5">
						<form method="post" action="search.bit">
						<input type="hidden" name="cmd" value="search">
							<select name="searchType">
								<option value="1">���̸�</option>
								<option value="2">��ȭ��ȣ</option>
								<option value="3">�ֹι�ȣ</option>
							</select> <input type="text" name="searchValue"> <input
								type="submit" value="�˻�">
						</form>
					</td>
				</tr>
			</tbody>
		</table>
	</div>
</body>
</html>