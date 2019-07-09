<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>mailistdemo</title>
</head>
<body>
<!-- 이름, 나이, 이메일 -->
<div>
	<form id="mailF" action="mailprocess.jsp", method="post">
	<p>이름: <input type="text" name="name" id="name"></p>
	<p>나이: <input type="number" name="age" id="age" min="19"></p>
	<p>이메일: <input type="email" name="email" id="email" placeholder="이메일 입력" required="required"></p>
	<p><input type="submit" value="가입"></p>
	</form>
</div>
</body>
</html>