<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>bbsList</title>
<script>
	$(document).ready(function() {
		$.ajax({
			url : "makelist.jsp?page=1",
			success : function(data) {
				$("#target").html(data);
			}
		});
	});
</script>
</head>
<body>
	<h2>글 목록</h2>
	<div id="target"></div>
</body>
</html>