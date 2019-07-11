<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>register</title>
<style>
#address {
	width: 300px;
}

#postal {
	width: 480px;
}
</style>
</head>
<body>
	<form method="post" action="signup.jsp">
		<fieldset>
			<legend>회원가입</legend>
			아이디:<br> <input type="text" id="id" name="id"><input
				type="button" id="validbtn" value="중복검사"><br>
			<div id="validtarget"></div>
			비밀번호:<br> <input type="text" id="pwd" name="pwd"><br>
			이름:<br> <input type="text" id="name" name="name"><br>
			<table>
				<tr>
					<td>우편번호:</td>
					<td>도로명주소:</td>
					<td></td>
				</tr>
				<tr>
					<td><input type="text" id="zipcode" name="zipcode"
						placeholder="우편번호" readonly></td>
					<td><input type="text" id="address" name="address"
						placeholder="도로명주소" readonly></td>
					<td><input type="button" id="searchbtn" value="우편번호 찾기"
						onclick="sample4_execDaumPostcode()"></td>
				</tr>
			</table>
			상세주소:<br> <input type="text" id="postal" name="postal"
				placeholder="상세주소"><br> <br> <input type="submit"
				value="submit"><br> <input type="button" id="listbtn"
				value="전체 회원 보기"><br>
			<br>검색:<input type="text" id="searchv"><input
				type="button" id="searchname" value="검색">
		</fieldset>
	</form>
	<div id="listtarget"></div>
	<div id="searchtarget"></div>
</body>
<script src="http://dmaps.daum.net/map_js_init/postcode.v2.js"></script>
<script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
<script>
	//본 예제에서는 도로명 주소 표기 방식에 대한 법령에 따라, 내려오는 데이터를 조합하여 올바른 주소를 구성하는 방법을 설명합니다.
	function sample4_execDaumPostcode() {
		new daum.Postcode({
			oncomplete : function(data) {
				// 팝업에서 검색결과 항목을 클릭했을때 실행할 코드를 작성하는 부분.

				// 도로명 주소의 노출 규칙에 따라 주소를 표시한다.
				// 내려오는 변수가 값이 없는 경우엔 공백('')값을 가지므로, 이를 참고하여 분기 한다.
				var roadAddr = data.roadAddress; // 도로명 주소 변수
				var extraRoadAddr = ''; // 참고 항목 변수

				// 법정동명이 있을 경우 추가한다. (법정리는 제외)
				// 법정동의 경우 마지막 문자가 "동/로/가"로 끝난다.
				if (data.bname !== '' && /[동|로|가]$/g.test(data.bname)) {
					extraRoadAddr += data.bname;
				}
				// 건물명이 있고, 공동주택일 경우 추가한다.
				if (data.buildingName !== '' && data.apartment === 'Y') {
					extraRoadAddr += (extraRoadAddr !== '' ? ', '
							+ data.buildingName : data.buildingName);
				}
				// 표시할 참고항목이 있을 경우, 괄호까지 추가한 최종 문자열을 만든다.
				if (extraRoadAddr !== '') {
					extraRoadAddr = ' (' + extraRoadAddr + ')';
				}

				// 우편번호와 주소 정보를 해당 필드에 넣는다.
				document.getElementById('zipcode').value = data.zonecode;
				document.getElementById("address").value = roadAddr;

			}
		}).open();
	}
	$(function() {
		$('#validbtn').click(
				function() {
					$.ajax({
						url : "validation.jsp?id=" + $('#id').val(),
						success : function(data) {
							$('#validtarget').css("width", "300").css(
									"background", "yellow").html(data);
						}
					});
				});
	});
	$(function() {
		$('#listbtn').click(function() {
			$.ajax({
				url : "list.jsp",
				success : function(data) {
					$('#listtarget').css("height", "300").html(data);
				}
			});
		});
	});
	$(function() {
		$('#searchname').click(function() {
			$.ajax({
				url : "search.jsp?name=" + $('#searchv').val(),
				success : function(data) {
					$('#searchtarget').css("height", "100").html(data);
				}
			});
		});
	});
</script>
</html>