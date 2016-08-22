<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
	<script src="<c:url value="/webjars/jquery/2.1.4/jquery.min.js"/>"></script>
	<script type="text/javascript" src="/vfront01/resources/js_files/login.js" defer></script>	
</head>
<body>
<P>  The time on the server is ${serverTime}. </P>
<h1>
	[직원 관리 프로그램] 
</h1>

<div id="listTable">
	
	<div id="show">
		<c:if test="${mainView ne null }">
			<jsp:include page="/WEB-INF/views/${mainView}.jsp"></jsp:include>
		</c:if>
	</div>
	
	<c:if test="${workerList eq null}">
			직원목록이 존재하지 않습니다.<br>
	</c:if>
		<input type="button" value="직원 등록하기" id="insertB"/>	
	
	<table>
		<c:if test="${workerList ne null }">
			<tr>
				<td>이름</td>
				<td>번호</td>
				<td>&nbsp;</td>
			</tr>
		</c:if>
		
		<c:forEach var="each" items="${workerList }">
			<tr>
				<td>${each.name }</td>
				<td>${each.num }</td>
				<td>
					<input type="button" value="상세보기" id="${each.num },detail">
				</td>
			</tr>
		</c:forEach>
	</table>
	
</div>



</body>
</html>
