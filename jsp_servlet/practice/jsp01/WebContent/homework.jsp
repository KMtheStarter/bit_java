<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>homework</title>
</head>
<body>
	<div id="wrap">
		<form method="post" action="homework.jsp">
		<input type="hidden" name="mode" value="ok">
			��: <input type="number" name="dan" id="dan">
			����: <input type="color" name="color" id="color">
			����: <select name="limits">
				<option>3</option>
				<option>5</option>
				<option>7</option>
				</select>
			<input type="submit" value="Ȯ��">
		</form>
		<%
			String mode = request.getParameter("mode");
			if(mode != null){
				int num = Integer.parseInt(request.getParameter("dan"));
				String col = request.getParameter("color");
				int range = Integer.parseInt(request.getParameter("limits"));
		%>
		<table>
		<%
				for (int i = num - range/2; i < num + range/2; i++){
		%>
		<tr><t
		<%
				}
		%>
		</table>
		<%
			}
		%>
	</div>
</body>
</html>