<%@ page language="java" contentType="text/html;charset=UTF-8"
pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"><title>Insert title</title>
</head>
<body>
[직원 입력하기]
<form name="insertfrm" action="insertComp">
<table id="t_insert">
<tr>
	<td>직원번호</td>
	<td>
		<input type="text" placeholder="중복될수 없는 3자리 수" name="num" id="numCheck"/>
	</td>
	<td><div id="checkDiv"></div></td>
	
</tr>
<tr>
	<td>이름</td>
	<td>
	<input type="text" placeholder="이름입력" name="name"/>
	</td>
</tr>
<tr>
	<td>전화번호</td>
	<td>
		<input type="tel" name="phone"/>
	</td>
</tr>
<tr>
	<td>직책</td>
	<td>
		<input type="text" name="rank"/>
	</td>
</tr>
<tr>
	<td>이메일주소</td>
	<td>
		<input type="email" name="email"/>
	</td>
</tr>
<tr>
	<td colspan="2">
		<input type="button" value="입력완료" id="submitB"/>
	</td>
</tr>
</table>
</form>

</body>
</html>