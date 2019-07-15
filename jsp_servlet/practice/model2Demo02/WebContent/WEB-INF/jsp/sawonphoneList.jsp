<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>deptList.jsp</title>
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
	margin: auto;
}
</style>
</head>
<body>
	<div id="wrap">
		<table>
			<tr>
				<th>사원번호</th>
				<th>사원명</th>
				<th>직위</th>
				<th>사원번호_p</th>
				<th>폰종류</th>
				<th>폰번호</th>
				<th>날짜</th>
			</tr>
			<c:forEach var="e" items="${splist }">
				<tr>
					<td class="no">${e.sabun }</td>
					<td>&nbsp;&nbsp;${e.saname }</td>
					<td>&nbsp;&nbsp;${e.sajob }</td>
					<td>&nbsp;&nbsp;${e.sphone.pnum }</td>
					<td>&nbsp;&nbsp;${e.sphone.pmodel }</td>
					<td>&nbsp;&nbsp;${e.sphone.phnum }</td>
					<td>&nbsp;&nbsp;${e.sphone.pdate }</td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>