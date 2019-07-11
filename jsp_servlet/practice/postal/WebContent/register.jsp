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
			<legend>ȸ������</legend>
			���̵�:<br> <input type="text" id="id" name="id"><input
				type="button" id="validbtn" value="�ߺ��˻�"><br>
			<div id="validtarget"></div>
			��й�ȣ:<br> <input type="text" id="pwd" name="pwd"><br>
			�̸�:<br> <input type="text" id="name" name="name"><br>
			<table>
				<tr>
					<td>�����ȣ:</td>
					<td>���θ��ּ�:</td>
					<td></td>
				</tr>
				<tr>
					<td><input type="text" id="zipcode" name="zipcode"
						placeholder="�����ȣ" readonly></td>
					<td><input type="text" id="address" name="address"
						placeholder="���θ��ּ�" readonly></td>
					<td><input type="button" id="searchbtn" value="�����ȣ ã��"
						onclick="sample4_execDaumPostcode()"></td>
				</tr>
			</table>
			���ּ�:<br> <input type="text" id="postal" name="postal"
				placeholder="���ּ�"><br> <br> <input type="submit"
				value="submit"><br> <input type="button" id="listbtn"
				value="��ü ȸ�� ����"><br>
			<br>�˻�:<input type="text" id="searchv"><input
				type="button" id="searchname" value="�˻�">
		</fieldset>
	</form>
	<div id="listtarget"></div>
	<div id="searchtarget"></div>
</body>
<script src="http://dmaps.daum.net/map_js_init/postcode.v2.js"></script>
<script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
<script>
	//�� ���������� ���θ� �ּ� ǥ�� ��Ŀ� ���� ���ɿ� ����, �������� �����͸� �����Ͽ� �ùٸ� �ּҸ� �����ϴ� ����� �����մϴ�.
	function sample4_execDaumPostcode() {
		new daum.Postcode({
			oncomplete : function(data) {
				// �˾����� �˻���� �׸��� Ŭ�������� ������ �ڵ带 �ۼ��ϴ� �κ�.

				// ���θ� �ּ��� ���� ��Ģ�� ���� �ּҸ� ǥ���Ѵ�.
				// �������� ������ ���� ���� ��쿣 ����('')���� �����Ƿ�, �̸� �����Ͽ� �б� �Ѵ�.
				var roadAddr = data.roadAddress; // ���θ� �ּ� ����
				var extraRoadAddr = ''; // ���� �׸� ����

				// ���������� ���� ��� �߰��Ѵ�. (�������� ����)
				// �������� ��� ������ ���ڰ� "��/��/��"�� ������.
				if (data.bname !== '' && /[��|��|��]$/g.test(data.bname)) {
					extraRoadAddr += data.bname;
				}
				// �ǹ����� �ְ�, ���������� ��� �߰��Ѵ�.
				if (data.buildingName !== '' && data.apartment === 'Y') {
					extraRoadAddr += (extraRoadAddr !== '' ? ', '
							+ data.buildingName : data.buildingName);
				}
				// ǥ���� �����׸��� ���� ���, ��ȣ���� �߰��� ���� ���ڿ��� �����.
				if (extraRoadAddr !== '') {
					extraRoadAddr = ' (' + extraRoadAddr + ')';
				}

				// �����ȣ�� �ּ� ������ �ش� �ʵ忡 �ִ´�.
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